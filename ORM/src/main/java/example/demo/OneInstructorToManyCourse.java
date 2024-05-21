package example.demo;

import example.entities.Course;
import example.entities.Instructor;
import example.entities.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneInstructorToManyCourse {
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
//        Instructor instructor= session.get(Instructor.class, 1);
//        Course course1= new Course("springboot",instructor);
//        Course course2= new Course("j2e",instructor);
//        Course course3= new Course("java",instructor);
//        Course course4= new Course("anglur",instructor);
//        Course course5= new Course("react",instructor);
//
//        course1.setInstructor(instructor);
//        course2.setInstructor(instructor);
//        course3.setInstructor(instructor);
//        course4.setInstructor(instructor);
//        course5.setInstructor(instructor);
//
//        session.persist(course1);
//        session.persist(course2);
//        session.persist(course3);
//        session.persist(course4);
//        session.persist(course5);
//
//        System.out.println(course1);

        Instructor instructor =session.get(Instructor.class,1);
        instructor.getCourses().stream().forEach(course -> System.out.println(course));
        //commit transaction
        session.getTransaction().commit();
        //close session
        session.close();
        //close session factory
        sessionFactory.close();
    }
}
