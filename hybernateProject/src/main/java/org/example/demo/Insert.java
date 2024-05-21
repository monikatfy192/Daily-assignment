package org.example.demo;

import org.example.entities.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {
    public static void main(String[] args) {
        // create session factory
        SessionFactory sessionFactory = new Configuration().configure("file.xml").addAnnotatedClass(Instructor.class).buildSessionFactory();
        //open session
        Session session = sessionFactory.openSession();
        //begin transaction
        session.beginTransaction();
        //do my actions on DB
        Instructor instructor = new Instructor("habobaa","Fouad","h@gmail.com");
        session.persist(instructor);
        //commit transaction
        session.getTransaction().commit();
        //close session
        session.close();
        //close session factory
        sessionFactory.close();
    }
}
