package datos.vo;

public class CursoVO {

    private int idCurso;
    private String nombre;
    private int cupo;

    public CursoVO(int idCurso, String nombre, int cupo) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.cupo = cupo;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

}
