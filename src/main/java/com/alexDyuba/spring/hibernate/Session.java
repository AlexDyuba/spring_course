package com.alexDyuba.spring.hibernate;
import com.alexDyuba.spring.hibernate.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Session {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            org.hibernate.Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            List<Employee> employeeList = session.createQuery("from Employee")
                    .getResultList();

            for (Employee i : employeeList) {
                System.out.println(i);
            }

            session.getTransaction().commit();
            sessionFactory.close();
        }
    }
}
