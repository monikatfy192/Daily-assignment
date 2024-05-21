package example.ManyToMany;

import example.entities.Course;
import example.entities.Instructor;
import example.entities.InstructorDetails;
import example.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddCourseAndStudent {
    public static void main(String[] args) {
        //create session factory
        SessionFactory sessionFactory = new Configuration()
                .configure("file.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(InstructorDetails.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // open sessions
        Session session= sessionFactory.openSession();

        //begin transaction
        session.beginTransaction();

        //do my actions on db
        Student student= new Student("monika", "atfy", "mok@gmail.com");

        Instructor instructor= session.get(Instructor.class,4);
        Course course= new Course("math", instructor);
        student.addCourse(course);
        session.persist(student);
        //commit transaction
        session.getTransaction().commit();
        //close session
        session.close();
        //close session factory
        sessionFactory.close();

    }
}
