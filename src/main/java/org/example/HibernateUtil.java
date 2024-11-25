package org.example;

import entidades.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;
    private static Session session;

    /**
     * Crea la factoria de sesiones
     */
    public static void buildSessionFactory() {

        Configuration configuration = new Configuration();
        configuration.configure();
        // Se registran las clases que hay que mapear con cada tabla de la base de datos
        configuration.addAnnotatedClass(Categoria.class);
        configuration.addAnnotatedClass(Cliente.class);
        configuration.addAnnotatedClass(DetalleOrdene.class);
        configuration.addAnnotatedClass(DetalleOrdeneId.class);
        configuration.addAnnotatedClass(Empleado.class);
        configuration.addAnnotatedClass(Ordene.class);
        configuration.addAnnotatedClass(Producto.class);
        configuration.addAnnotatedClass(Proveedore.class);


        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

    /**
     * Abre una nueva sesión
     *
     * @return
     */
    public static Session openSession() {
        session = sessionFactory.openSession();
        return null;
    }

    /**
     * Devuelve la sesión actual
     * @return
     */
    public static Session getCurrentSession() {

        if ((session == null) || (!session.isOpen()))
            openSession();

        return session;
    }

    /**
     * Cierra Hibernate
     */
    public static void closeSessionFactory() {

        if (session != null)
            session.close();

        if (sessionFactory != null)
            sessionFactory.close();
    }
}

