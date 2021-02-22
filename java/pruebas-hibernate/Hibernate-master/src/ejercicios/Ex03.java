package ejercicios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import primero.HibernateUtil;
import primero.Historico;
import primero.Profesor;

import java.sql.Timestamp;

public class Ex03 {
    public static void main(String[] args) {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        Profesor prof = session.load(Profesor.class, "AMD");
        Historico hist=new Historico();
        hist.setCodProf(prof.getCodProf());
        hist.setNombre(prof.getNombre());
        hist.setApellidos(prof.getApellidos());
        hist.setFechaAlta((Timestamp) prof.getFechaAlta());


        session.save(hist);
        session.delete(prof);
        tx.commit();
        session.close();

        System.exit(0);
    }
}
