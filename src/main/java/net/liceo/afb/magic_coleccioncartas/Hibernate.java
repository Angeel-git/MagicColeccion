package net.liceo.afb.magic_coleccioncartas;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernate {

    public void insertCarta(Carta carta) {
        StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();

        Session session = sf.openSession();
        session.getTransaction().begin();

        session.persist(carta);

        session.getTransaction().commit();
        session.close();
        sf.close();
    }
}
