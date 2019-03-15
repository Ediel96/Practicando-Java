package datos.vo;

public class AlumnoVO {

    private int idAlumno;
    private int documento;
    private String nombre;
    private int Curso_idCurso;

    public AlumnoVO(int idAlumno, int documento, String nombre, int Curso_idCurso) {
        this.idAlumno = idAlumno;
        this.documento = documento;
        this.nombre = nombre;
        this.Curso_idCurso = Curso_idCurso;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso_idCurso() {
        return Curso_idCurso;
    }

    public void setCurso_idCurso(int Curso_idCurso) {
        this.Curso_idCurso = Curso_idCurso;
    }
}
