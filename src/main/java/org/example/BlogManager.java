package org.example;

import javax.persistence.*;
import java.util.List;

public class BlogManager {

    private static final String PERSISTENCE_UNIT_NAME = "blogPU";
    private static EntityManagerFactory factory;

    public BlogManager() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    public void addEntrada(Entrada entrada) {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(entrada);
        em.getTransaction().commit();
        em.close();
    }

    public List<Entrada> getAllEntradas() {
        EntityManager em = factory.createEntityManager();
        Query q = em.createQuery("SELECT e FROM Entrada e");
        List<Entrada> entradas = q.getResultList();
        em.close();
        return entradas;
    }

    public List<Entrada> getLast3Entradas() {
        EntityManager em = factory.createEntityManager();
        Query q = em.createQuery("SELECT e FROM Entrada e ORDER BY e.fecha DESC");
        q.setMaxResults(3);
        List<Entrada> entradas = q.getResultList();
        em.close();
        return entradas;
    }
}
