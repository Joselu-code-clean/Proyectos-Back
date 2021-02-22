package examen2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import primero.HibernateUtil;

import java.util.List;

import static examen2.Teclado.leerString;

public class Hib3 {
    public static void main(String[] args) {
        List<Object[]> datos;
        Object[] filas;

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        String oe, curso, dia;
        System.out.println("Introduce oferta educativa");
        oe = leerString();

        System.out.println("Introduce curso");
        curso = leerString();

        System.out.println("Introduce un día");
        dia = leerString();

        Query query = session.createQuery("select h.id.codOe,h.id.codCurso,t.dia,count(distinct h.id.codAsig) from Horario h join Tramohorario t on h.id.codTramo = t.codTramo where h.id.codAsig not like'@%' group by 1,2,3 having count(distinct h.id.codAsig)>(select count(distinct h.id.codAsig) from Horario h join Tramohorario t on h.id.codTramo = t.codTramo where h.id.codAsig not like'@%' and h.id.codOe=? and h.id.codCurso=? AND t.dia=?)");

        query.setParameter(0, oe);
        query.setParameter(1, curso);
        query.setParameter(2, dia);

        datos = query.list();

        for (int i = 0; i < datos.size(); i++) {
            filas = datos.get(i);
            System.out.printf("%s %s %s %s\n", filas[0], filas[1], filas[2], filas[3]);

        }
        session.close();

        System.exit(0);
    }
}
