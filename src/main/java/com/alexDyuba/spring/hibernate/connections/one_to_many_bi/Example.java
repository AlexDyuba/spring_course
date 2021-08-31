package com.alexDyuba.spring.hibernate.connections.one_to_many_bi;

import com.alexDyuba.spring.hibernate.connections.one_to_many_bi.entity.Department;
import com.alexDyuba.spring.hibernate.connections.one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Example {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 6);

            session.delete(department);
            session.getTransaction().commit();
        }
    }
}
