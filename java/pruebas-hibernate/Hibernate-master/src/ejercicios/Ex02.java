package ejercicios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import primero.HibernateUtil;
import primero.Profesor;


public class Ex02 {
    public static void main(String[] args) {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        System.out.println("Modifico una fila en la tabla Profesor");

        Profesor prof;
        //Session
        prof = session.load(Profesor.class, "AMD");
        prof.setNombre("Antonio");

        session.save(prof);

        tx.commit();
        session.close();

        System.exit(0);
    }

}
