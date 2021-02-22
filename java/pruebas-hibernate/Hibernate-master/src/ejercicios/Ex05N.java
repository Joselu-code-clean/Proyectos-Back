package ejercicios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import primero.Asignatura;
import primero.HibernateUtil;

public class Ex05N {
    public static void main(String[] args) {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        String hql ="from Asignatura where nombre= :nAsig";
        Query q = session.createQuery(hql);
        q.setParameter("nAsig","Bases de datos");

        Asignatura asig = (Asignatura) q.uniqueResult();

        System.out.printf("%s  %s\n",asig.getCodAsig(),asig.getNombre());


        session.close();

        System.exit(0);
    }
}
