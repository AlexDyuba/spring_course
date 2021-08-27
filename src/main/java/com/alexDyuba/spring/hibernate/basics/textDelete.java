package com.alexDyuba.spring.hibernate.basics;

import com.alexDyuba.spring.hibernate.basics.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class textDelete {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(com.alexDyuba.spring.hibernate.basics.entity.Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            List<com.alexDyuba.spring.hibernate.basics.entity.Employee> employeeList = session.createQuery("from Employee ").getResultList();
            for (com.alexDyuba.spring.hibernate.basics.entity.Employee i : employeeList) {
                System.out.println(i);
            }
            session.createQuery("delete Employee where name = 'Glev'").executeUpdate();
            session.getTransaction().commit();
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            employeeList = session.createQuery("from Employee ").getResultList();
            for (com.alexDyuba.spring.hibernate.basics.entity.Employee i : employeeList) {
                System.out.println(i);
            }
        }
    }
}
