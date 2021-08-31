package com.alexDyuba.spring.hibernate.connections.many_to_many;

import com.alexDyuba.spring.hibernate.connections.many_to_many.entity.Children;
import com.alexDyuba.spring.hibernate.connections.many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Example {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Children.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();

            Section section = new Section("Judo");
            Children children1 = new Children("Alex", 8);
            Children children2 = new Children("Vano", 9);
            Children children3 = new Children("Arti", 7);
            section.addChildToSection(children1, children2, children3);

            session.beginTransaction();
            session.save(section);

            session.getTransaction().commit();
        }
    }
}
