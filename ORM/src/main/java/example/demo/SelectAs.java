package example.demo;

import example.entities.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class SelectAs {
    public static void main(String[] args) {
        //create session factory
        SessionFactory sessionFactory = new Configuration().configure("file.xml")
                .addAnnotatedClass(Instructor.class)
                .buildSessionFactory();

        // open sessions
        Session session= sessionFactory.openSession();

        //begin transaction
        session.beginTransaction();

        //do my actions on db
        System.out.println("select by where");
        List<Instructor> instructors= session.createQuery("from Instructor i where i.firstName like :pattern",Instructor.class)
                .setParameter("pattern","m%")
                .getResultList();
        instructors.stream().forEach( i -> System.out.println(i));
        //commit transaction
        session.getTransaction().commit();
        //close session

        //close session factory


    }
}
