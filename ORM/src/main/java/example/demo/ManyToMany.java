package example.demo;

import example.entities.Course;
import example.entities.Instructor;
import example.entities.InstructorDetails;
import jakarta.persistence.Column;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ManyToMany {
    public static void main(String[] args) {
        //create session factory
        SessionFactory sessionFactory = new Configuration().configure("file.xml")
                .addAnnotatedClass(Course.class).addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class)
                .buildSessionFactory();

        // open sessions
        Session session= sessionFactory.openSession();

        //begin transaction
        session.beginTransaction();

        //do my actions on db
        Course course= new Course("spring");
        Instructor instructor= session.get(Instructor.class, 1);
        course.setInstructor(instructor);
        session.persist(course);
        System.out.println(course);
        //commit transaction
        session.getTransaction().commit();
        //close session
        session.close();
        //close session factory
        sessionFactory.close();

    }
}
