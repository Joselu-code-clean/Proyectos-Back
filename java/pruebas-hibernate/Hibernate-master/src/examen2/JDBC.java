package examen2;

import java.sql.*;


public class JDBC {
    public static void main(String[] args) {
        Connection conexion;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/Horario?allowMultiQueries=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            Statement sentencia = conexion.createStatement();
            String sql = "select codOe,codCurso,h.codTramo,h.codAsig, nombre,horasSemanales " +
                    "from horario h join asignatura a on h.codAsig=a.codAsig join tramohorario t on h.codTramo = t.codTramo " +
                    "group by 1,2,4,3,5,6 " +
                    "order by 1,2,4,dia asc,3 asc";

            ResultSet resul = sentencia.executeQuery(sql);
            String aux = "";

            System.out.println("ASIGNATURAS DEL IES SALADILLO:");

            while (resul.next()) {
                if (!resul.getString(4).equals(aux)) {
                    System.out.println();
                    System.out.println();

                    System.out.printf("Código: %s Nombre: %s Horas semanales: %s\n Codigo Curso: %s %s Tramos Horarios: %s", resul.getString(4), resul.getString(5), resul.getString(6), resul.getString(1), resul.getString(2), resul.getString(3));
                } else {
                    System.out.printf(" %s", resul.getString(3));
                }
                aux = resul.getString(4);

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println();
            e.printStackTrace();
        }
    }
}

