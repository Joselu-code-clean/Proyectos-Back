package ejercicios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import primero.HibernateUtil;
import primero.Profesor;

import java.util.Iterator;
import java.util.List;


public class Ex04 {
    public static void main(String[] args) {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();


        Query q = session.createQuery("from Profesor");
        List<Profesor> lista= q.list();
        Iterator<Profesor> iter= lista.iterator();

        System.out.println("Todos los profesores:");
        while (iter.hasNext()){
            Profesor prof = iter.next();
            System.out.printf("%s   %s %s\n",prof.getCodProf(),prof.getNombre(),prof.getApellidos());
        }



        session.close();

        System.exit(0);
    }
}
