/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Ejercicio 1, Overloading
 * 13-08-2023
 * @return Exam
 */
public class Exam {
    
    //atributos
    private String tipo;

    private Estudiante usuario;

    private int nota;

    //constrructor con parametros
    Exam(String tipo, Estudiante usuario){
        this.tipo = tipo;
        this.usuario = usuario;
    }

    //setters y getters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Estudiante getUsuario() {
        return usuario;
    }

    public void setUsuario(Estudiante usuario) {
        this.usuario = usuario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    

}
