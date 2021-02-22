package ejercicios;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import primero.Curso;
import primero.HibernateUtil;
import primero.Ofertaeducativa;

import java.util.Iterator;

public class Ex07 {
    public static void main(String[] args) {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        Query query = session.createQuery("from Ofertaeducativa oe join Curso c on oe.codOe = c.ofertaeducativa.codOe");
        Iterator q = query.iterate();
        while (q.hasNext()){
            Object[] par = (Object[]) q.next();
            Ofertaeducativa of = (Ofertaeducativa) par[0];
            Curso cu = (Curso) par[1];
            System.out.printf("%s %s %s %s %s\n%s %s\n\n",of.getCodOe(),of.getNombre(),of.getDescripcion(),of.getTipo(),of.getFechaLey(),cu.getId().getCodCurso(),cu.getProfesor().getNombre());
        }


        session.close();

        System.exit(0);
    }
}

