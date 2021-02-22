package ejercicios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import primero.HibernateUtil;

public class Ex02HQL {
    public static void main(String[] args) {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        session.createQuery("update primero.Profesor set nombre='Amador' where codProf='AMD'").executeUpdate();

        System.out.println("Modifico una fila en la tabla Profesor");

        tx.commit();
        session.close();

        System.exit(0);    }
}
