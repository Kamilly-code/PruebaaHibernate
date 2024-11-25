package org.example;

import entidades.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class App {
    public static void main(String[] args) {
        HibernateUtil.buildSessionFactory();

        // Create
        Cliente newCliente = new Cliente();
        newCliente.setCedulaRuc("1234567890");
        newCliente.setNombrecia("Company Name");
        newCliente.setNombrecontacto("John Doe");
        newCliente.setDireccioncli("123 Main St");
        newCliente.setFax("1234567890");
        newCliente.setEmail("john.doe@example.com");
        newCliente.setCelular("1234567890");
        newCliente.setFijo("1234567890");
        persistCliente(newCliente);

        // Read
        List<Cliente> clientes = getAllClientes();
        for (Cliente cliente : clientes) {
            System.out.println("cliente: " + cliente);
        }

        HibernateUtil.closeSessionFactory();
    }

    public static void persistCliente(Cliente cliente) {
        Session session = HibernateUtil.getCurrentSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(cliente);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static List<Cliente> getAllClientes() {
        Session session = HibernateUtil.getCurrentSession();
        return session.createQuery("FROM Cliente", Cliente.class).list();
    }
}