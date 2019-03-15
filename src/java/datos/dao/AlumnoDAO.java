package datos.dao;

import datos.vo.AlumnoVO;
import datos.vo.CursoVO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {
    
    public List<AlumnoVO> consultarAlumnos() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            PreparedStatement sentencia = conexion.prepareStatement("select * from Alumno");
            ResultSet datos = sentencia.executeQuery();
            List<AlumnoVO> alumnitos = new ArrayList();
            while (datos.next()) {
                AlumnoVO alumnito = new AlumnoVO(datos.getInt("idAlumno"), datos.getInt("documento"), datos.getString("nombre"),datos.getInt("Curso_idCurso"));
                alumnitos.add(alumnito);
            }
            conexion.close();
            return alumnitos;
        } catch (Exception e) {
            System.out.println("paila no pude traer los putos alumnos: " + e);
            return null;
        }

    }
    
        public List<AlumnoVO> consultarAlumnosConIdCurso(int IdCirso) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM `alumno` WHERE Curso_idCurso = "+IdCirso+"");
            ResultSet datos = sentencia.executeQuery();
            List<AlumnoVO> alumnitos = new ArrayList();
            while (datos.next()) {
                AlumnoVO alumnito = new AlumnoVO(datos.getInt("idAlumno"), datos.getInt("documento"), datos.getString("nombre"),datos.getInt("Curso_idCurso"));
                alumnitos.add(alumnito);
            }
            conexion.close();
            return alumnitos;
        } catch (Exception e) {
            System.out.println("paila no pude traer los putos alumnos: " + e);
            return null;
        }

    }
    
}
