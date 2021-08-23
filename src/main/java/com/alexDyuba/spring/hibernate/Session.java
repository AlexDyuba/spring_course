package com.alexDyuba.spring.hibernate;
import com.alexDyuba.spring.hibernate.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Session {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            org.hibernate.Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Alex", "Dyuba", "IT", 2500);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }
    }
}
