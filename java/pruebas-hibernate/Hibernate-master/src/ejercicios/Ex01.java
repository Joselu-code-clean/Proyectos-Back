package ejercicios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import primero.HibernateUtil;
import primero.Profesor;

import java.time.Instant;
import java.util.Date;

public class Ex01 {
    public static void main(String[] args) {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        System.out.println("Inserto una fila en la tabla Profesor");

        Profesor prof = new Profesor();
        prof.setCodProf("AMD");
        prof.setNombre("Adrián");
        prof.setApellidos("Mena Domínguez");
        prof.setFechaAlta(Date.from(Instant.now()));

        session.save(prof);
        tx.commit();
        session.close();
        System.out.println("Profesor añadido correctamente");

        System.exit(0);
    }
}

