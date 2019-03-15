/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import datos.vo.AlumnoVO;
import datos.vo.CursoVO;
import datos.dao.CursoDAO;
import datos.dao.AlumnoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "ct")
@RequestScoped

public class Controlador {

    private List<CursoVO> cursitos;
    private List<AlumnoVO> alubnitos;
    private String curso;
    private int cupo;
    private String nombre;
    private int IdCupoNobre;

    

    public int getIdCupoNobre() {
        return IdCupoNobre;
    }

    public void setIdCupoNobre(int IdCupoNobre) {
        this.IdCupoNobre = IdCupoNobre;
    }
    
    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 

    public Controlador() {
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<CursoVO> getCursitos() {
        if (cursitos == null) {
            cursitos = new CursoDAO().consultarCursos();
        }
        
        return cursitos;
    }

    public void setCursitos(List<CursoVO> cursitos) {
        this.cursitos = cursitos;
    }
    
    public List<AlumnoVO> getAlubnitos() {
        
        return alubnitos;
    }

    public void setAlubnitos(List<AlumnoVO> alubnitos) {
        this.alubnitos = alubnitos;
    }
    
    public void consultaCurso(ActionEvent event) {
        List<CursoVO> cursillos = new ArrayList<>();
        if (curso.equals("")) {
            cursillos = new CursoDAO().consultarCursos();
        } else {
            cursillos = new CursoDAO().buscarCursos(curso);
        }

        setCursitos(cursillos);
    }
    
    public void EventCupoDeLosNombres(ActionEvent ebt) {
        List<AlumnoVO> alubnitos = new ArrayList<>();
        IdCupoNobre = (int) ebt.getComponent().getAttributes().get("atributito");
        alubnitos = new AlumnoDAO().consultarAlumnosConIdCurso(IdCupoNobre);
        System.out.println();
        setAlubnitos(alubnitos);
    }
    
}
