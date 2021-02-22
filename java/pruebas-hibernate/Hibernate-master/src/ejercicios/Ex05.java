package ejercicios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;
import primero.Asignatura;
import primero.HibernateUtil;
import primero.Profesor;


public class Ex05 {
    public static void main(String[] args) {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        String hql ="from Asignatura where codAsig=?";
        Query q = session.createQuery(hql);
        q.setParameter(0,"PROG");

        Asignatura asig = (Asignatura) q.uniqueResult();
        System.out.printf("%s  %s\n",asig.getCodAsig(),asig.getNombre());






        session.close();

        System.exit(0);
    }
}
