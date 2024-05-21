package org.example.demo;

import org.example.entities.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Select {
    public static void main(String[] args) {
        // create session factory
        SessionFactory sessionFactory = new Configuration().configure("file.xml").addAnnotatedClass(Instructor.class).buildSessionFactory();
        //open session
        Session session = sessionFactory.openSession();
        //begin transaction
        session.beginTransaction();
        //do my actions on DB
        System.out.println("select by id");
        Instructor instructor = session.get(Instructor.class,1);
        System.out.println(instructor);
        //to select all
        System.out.println("select all");
        List<Instructor> instructors=session.createQuery("from Instructor i", Instructor.class).getResultList();
        instructors.stream().forEach(i-> System.out.println(i));
        //
        System.out.println("select by where");
        List<Instructor> instructors2 =session.createQuery("from Instructor i where i.firstName LIKE :pattern", Instructor.class).setParameter("pattern","H%")
                .getResultList();
        instructors2.stream().forEach(i-> System.out.println(i));
        //commit transaction
        session.getTransaction().commit();
        //close session
        session.clear();
        //close session factory
        sessionFactory.close();
    }
}
