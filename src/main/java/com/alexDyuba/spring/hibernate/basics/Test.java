package com.alexDyuba.spring.hibernate.basics;

import com.alexDyuba.spring.hibernate.basics.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println("Salary before: " + employee.getSalary());
//            employee.setSalary(2000);
//            session.getTransaction().commit();
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee1 = session.get(Employee.class, 1);
//            System.out.println("Salary after: " + employee1.getSalary());
            List employeeList = session.createQuery("from Employee ").getResultList();
            System.out.println("before");
            for (Object i : employeeList) {
                System.out.println(i);
            }
            session.createQuery("update Employee set salary = 5000").executeUpdate();
            session.getTransaction().commit();
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            employeeList = session.createQuery("from Employee ").getResultList();
            System.out.println("after");
            for (Object i : employeeList) {
                System.out.println(i);
            }
        }
    }
}
