package ejercicios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import primero.HibernateUtil;
import primero.Profesor;

import java.util.Iterator;

public class Ex04Iter {
    public static void main(String[] args) {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();


        Query q = session.createQuery("from Profesor");
        q.setFetchSize(3);
        Iterator iter=q.iterate();

        System.out.println("Todos los profesores:");

        while (iter.hasNext()){
            Profesor prof = (Profesor) iter.next();
            System.out.printf("%s   %s %s\n",prof.getCodProf(),prof.getNombre(),prof.getApellidos()); }




        session.close();

        System.exit(0);
    }
}
