package example.demo;
import example.entities.Instructor;
import example.entities.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class OneToOnePiDirection {
    public static void main(String[] args) {
        //create session factory
        SessionFactory sessionFactory = new Configuration().configure("file.xml")
                .addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class)
                .buildSessionFactory();

        // open sessions
        Session session= sessionFactory.openSession();

        //begin transaction
        session.beginTransaction();

        //do my actions on db
        InstructorDetails details= session.get(InstructorDetails.class,2);
        System.out.println(details);
        System.out.println(details.getInstructor());

        //commit transaction
        session.getTransaction().commit();
        //close session

        //close session factory


    }
}