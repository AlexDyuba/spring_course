package com.alexDyuba.spring.hibernate.connections.one_to_many_uni;

import com.alexDyuba.spring.hibernate.connections.one_to_many_uni.entity.Department;
import com.alexDyuba.spring.hibernate.connections.one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Example {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Department department = new Department("IT", 1000, 3000);
            Employee employee = new Employee("Alex", "Dyuba", 800);
            Employee employee1 = new Employee("Andrew", "Curuzo", 1500);
            department.addEmployeesToDepartment(employee1, employee);
            session.save(department);
//            Department department = session.get(Department.class, 7);
//            Employee employee = session.get(Employee.class, 5);
//            session.delete(department);
//            session.delete(employee);
            session.getTransaction().commit();

        }
    }
}
