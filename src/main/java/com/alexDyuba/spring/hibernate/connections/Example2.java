package com.alexDyuba.spring.hibernate.connections;

import com.alexDyuba.spring.hibernate.connections.entity.Details;
import com.alexDyuba.spring.hibernate.connections.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Example2 {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory()) {
//            Details details = new Details("Gomel", "789124235", "apoler@@Dada.com");
//
//            Employee employee = new Employee("Alexus", "susamiko", "HR", 5000);
//
//            details.setEmployee(employee);
//            employee.setEmployeeDetails(details);
//            Session session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            session.save(details);
//            session.getTransaction().commit();
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("delete from Employee where id = 3").executeUpdate();
            session.createQuery("delete from Details where id = 3").executeUpdate();

            session.getTransaction().commit();

        }
    }
}
