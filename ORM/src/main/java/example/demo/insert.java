package example.demo;

import example.entities.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Insert {
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
        Instructor instructor= new Instructor("monika", "atfy", "monika@gmail.com");
        Instructor instructor1= new Instructor("monika", "atfy", "monika@gmail.com");
        Instructor instructor2= new Instructor("monika", "atfy", "monika@gmail.com");
        session.persist(instructor);
        session.persist(instructor1);
        session.persist(instructor2);
        //commit transaction
        session.getTransaction().commit();
        //close session

        //close session factory


    }
}
