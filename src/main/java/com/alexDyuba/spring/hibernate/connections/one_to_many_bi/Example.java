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

            Employee employee1 = session.get(Employee.class, 3);
//            Employee employee2 = new Employee("Oleg", "Dusho", 1110);
////Department department = new Department("HR", 1000, 4000);
//
//            department.addEmployeesToDepartment(employee1);
//            department.addEmployeesToDepartment(employee2);
            session.delete(employee1);
            session.getTransaction().commit();
        }
    }
}
