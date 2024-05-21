package example.OneToOne;

import example.entities.Instructor;
import example.entities.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class InsertInstructorWithDetails {
    public static void main(String[] args) {
        //create session factory
        SessionFactory sessionFactory = new Configuration().configure("file.xml")
                .addAnnotatedClass(InstructorDetails.class).addAnnotatedClass(Instructor.class)
                .buildSessionFactory();

        // open sessions
        Session session= sessionFactory.openSession();

        //begin transaction
        session.beginTransaction();

        //do my actions on db
        InstructorDetails instructorDetails= new InstructorDetails( "you","art");
        Instructor instructor= new Instructor("moka", "atfy", "monika@gmail.com",instructorDetails);
        session.persist(instructor);
        //commit transaction
        session.getTransaction().commit();
        //close session

        //close session factory


    }
}
