package ejercicios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import primero.Asignatura;
import primero.HibernateUtil;
import primero.Profesor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        List<Byte> numeros = new ArrayList<Byte>();
        numeros.add((byte) 3);
        numeros.add((byte) 4);
        numeros.add((byte) 6);

        String hql = "from Asignatura where horasSemanales in (:listaHoras)";
        Query q = session.createQuery(hql);

        q.setParameterList("listaHoras",numeros);

        List<Asignatura> lista= q.list();
        Iterator<Asignatura> iter= lista.iterator();

        System.out.println("Todos las asignaturas con 3,4 o 6 horas:");

        while (iter.hasNext()){
            Asignatura asig = iter.next();
            System.out.printf("%s   %s %s\n",asig.getCodAsig(), asig.getNombre(),asig.getHorasSemanales());
        }






        session.close();

        System.exit(0);
    }
}
