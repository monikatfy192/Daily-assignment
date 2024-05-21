package org.example.demo;

import org.example.entities.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Delete {
    public static void main(String[] args) {
        // create session factory
        SessionFactory sessionFactory = new Configuration().configure("file.xml").addAnnotatedClass(Instructor.class).buildSessionFactory();
        //open session
        Session session = sessionFactory.openSession();
        //begin transaction
        session.beginTransaction();
        //do my actions on DB
        Instructor instructor = session.get(Instructor.class,3);
        session.remove(instructor);
        //commit transaction
        session.getTransaction().commit();
        //close session
        session.clear();
        //close session factory
        sessionFactory.close();
    }
}
