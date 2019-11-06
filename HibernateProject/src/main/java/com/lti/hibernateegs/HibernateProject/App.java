package com.lti.hibernateegs.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String args[] )
    {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new  StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory factory = configuration.buildSessionFactory(builder.build());
        Session session = factory.openSession();
        Employeees employee = new Employeees();
        employee.setEmpName("shobhika");
        employee.setBranch("Chennai");
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
    }
}
