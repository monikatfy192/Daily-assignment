package example.demo;

import example.entities.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Select {
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
        Instructor instructor= session.get(Instructor.class,1);
        System.out.println(instructor);
        List<Instructor> instructors= session.createQuery("from Instructor i", Instructor.class)
                .getResultList();
        instructors.stream().forEach( i -> System.out.println(i));
        //commit transaction
        session.getTransaction().commit();
        //close session
        session.close();
        //close session factory
        sessionFactory.close();

    }
}
