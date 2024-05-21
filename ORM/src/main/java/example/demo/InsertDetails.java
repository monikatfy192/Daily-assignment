package example.demo;

import example.entities.Instructor;
import example.entities.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class InsertDetails {
    public static void main(String[] args) {
        //create session factory
        SessionFactory sessionFactory = new Configuration().configure("file.xml")
                .addAnnotatedClass(InstructorDetails.class)
                .buildSessionFactory();

        // open sessions
        Session session= sessionFactory.openSession();

        //begin transaction
        session.beginTransaction();

        //do my actions on db
        InstructorDetails instructorDetails= new InstructorDetails( "youtube","swim");
        session.persist(instructorDetails);
        //commit transaction
        session.getTransaction().commit();
        //close session

        //close session factory


    }
}
