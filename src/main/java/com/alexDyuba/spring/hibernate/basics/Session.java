package com.alexDyuba.spring.hibernate.basics;
import com.alexDyuba.spring.hibernate.basics.entity.Employee;
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
            session.save(new Employee("Andrew", "Dorogoy", "Engineer", 2200));
            List<Employee> employeeList = session.createQuery("from Employee")
                    .getResultList();

            for (Employee i : employeeList) {
                System.out.println(i);
            }

            session.getTransaction().commit();
        }
    }
}
