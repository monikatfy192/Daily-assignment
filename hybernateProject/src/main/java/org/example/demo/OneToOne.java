package org.example.demo;

import org.example.entities.Instructor;
import org.example.entities.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOne{
    public static void main(String[] args) {
        // create session factory
        SessionFactory sessionFactory = new Configuration().configure("file.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
        //open session
        Session session = sessionFactory.openSession();
        //begin transaction
        session.beginTransaction();
        //do my actions on DB
        //lazy
//        Instructor instructor = session.get(Instructor.class,8);
//        System.out.println(instructor);
//        System.out.println("lazy");
//        System.out.println(instructor.getInstructorDetails());
        //eager
        Instructor instructor = session.get(Instructor.class,8);
        System.out.println(instructor);
        System.out.println("eager");
        System.out.println(instructor.getInstructorDetails());
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
