package org.example.demo;

import org.example.entities.Instructor;
import org.example.entities.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneBiDirection {
    public static void main(String[] args) {
        // create session factory
        SessionFactory sessionFactory = new Configuration().configure("file.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
        //open session
        Session session = sessionFactory.openSession();
        //begin transaction
        session.beginTransaction();
        //do my actions on DB
        InstructorDetails details = session.get(InstructorDetails.class,2);
        System.out.println(details);
        System.out.println(details.getInstructor());
        //
//        InstructorDetails instructorDetails=new InstructorDetails("haboba channel","diving");
//        Instructor obj = new Instructor("habiba","fouad","h@gmail.com",instructorDetails);
        //session.persist(instructorDetails);
//        session.persist(obj);
        //commit transaction
        session.getTransaction().commit();
        //close session
        session.close();
        //close session factory
        sessionFactory.close();
    }
}
