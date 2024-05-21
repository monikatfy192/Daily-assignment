package example.OneToOne;

        import example.entities.Instructor;
        import example.entities.InstructorDetails;
        import org.hibernate.Session;
        import org.hibernate.SessionFactory;
        import org.hibernate.cfg.Configuration;

        import java.util.List;


public class SelectInstructorWithDetail  {
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
        Instructor instructor= session.get(Instructor.class,4);
        System.out.println(instructor);
        System.out.println(instructor.getInstructorDetails());

        //commit transaction
        session.getTransaction().commit();
        //close session

        //close session factory


    }
}
