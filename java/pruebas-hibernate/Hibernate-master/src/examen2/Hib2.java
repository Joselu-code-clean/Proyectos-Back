    package examen2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import primero.HibernateUtil;
import java.util.List;

public class Hib2 {
    public static void main(String[] args) {
        List<Object[]> datos;
        Object[] filas;


        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        Query query = session.createQuery("select  oe.codOe,oe.nombre,count( DISTINCT c.id.codCurso),count(DISTINCT r.id.codAsig),count( DISTINCT r.id.codProf) from Ofertaeducativa oe join Curso c on oe.codOe = c.id.codOe join Reparto r on c.id.codOe = r.id.codOe and c.id.codCurso = r.id.codCurso GROUP by 1,2");

        datos = query.list();
        System.out.println("Información de las ofertas educativas");
        for (int i = 0; i < datos.size(); i++) {
            filas = datos.get(i);
            System.out.printf("%s %s \n  -Total cursos: %s\n  -Total asignaturas: %s\n  -Total profesores: %s\n\n", filas[0], filas[1], filas[2], filas[3], filas[4]);
        }

        session.close();

        System.exit(0);
    }

}
