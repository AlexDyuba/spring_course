package com.alexDyuba.spring.hibernate.connections.one_to_one;

import com.alexDyuba.spring.hibernate.connections.entity.Details;
import com.alexDyuba.spring.hibernate.connections.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory()) {

//            Employee employee = new Employee("Pitro", "Sinevo", "Sales", 1700);
//            employee.setEmployeeDetails(new Details("Minsk", "823-43-25", "PSin@icloud.com"));

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
//            session.save(employee);
            try {
                Employee employee = session.get(Employee.class, 10);
                System.out.println(employee.getEmployeeDetails());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                session.getTransaction().commit();
            }
        }
    }
}
