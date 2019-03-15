package datos.dao;

import datos.vo.CursoVO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {

    public List<CursoVO> consultarCursos() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            PreparedStatement sentencia = conexion.prepareStatement("select * from Curso");
            ResultSet datos = sentencia.executeQuery();
            List<CursoVO> cursitos = new ArrayList();
            while (datos.next()) {
                CursoVO cursito = new CursoVO(datos.getInt("idCurso"), datos.getString("nombre"), datos.getInt("cupo"));
                cursitos.add(cursito);
            }
            conexion.close();
            return cursitos;
        } catch (Exception e) {
            System.out.println("paila no pude traer los putos cursos: " + e);
            return null;
        }

    }
    
    public List<CursoVO> buscarCursos(String curso) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            PreparedStatement sentencia = conexion.prepareStatement("select * from Curso where nombre = '"+curso+"'");
            ResultSet datos = sentencia.executeQuery();
            List<CursoVO> cursitos = new ArrayList();
            while (datos.next()) {
                CursoVO cursito = new CursoVO(datos.getInt("idCurso"), datos.getString("nombre"), datos.getInt("cupo"));
                cursitos.add(cursito);
            }
            conexion.close();
            return cursitos;
        } catch (Exception e) {
            System.out.println("paila no pude traer los putos cursos: " + e);
            return null;
        }

    }
    
    
        public List<CursoVO> IngresarCursos(String curso, int cupo) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            PreparedStatement sentencia = conexion.prepareStatement("INSERT INTO `curso`(`idCurso`, `nombre`, `cupo`) VALUES (null,'"+curso+"',"+cupo+")");
            ResultSet datos = sentencia.executeQuery();
            List<CursoVO> cursitos = new ArrayList();
            while (datos.next()) {
                CursoVO cursito = new CursoVO(datos.getInt("idCurso"), datos.getString("nombre"), datos.getInt("cupo"));
                cursitos.add(cursito);
            }
            conexion.close();
            return cursitos;
        } catch (Exception e) {
            System.out.println("paila no pude traer los putos cursos: " + e);
            return null;
        }

    }
    
}
