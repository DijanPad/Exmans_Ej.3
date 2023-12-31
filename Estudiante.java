/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Ejercicio 1, Overloading
 * 13-08-2023
 * @return Estudiante
 */

public class Estudiante {
    
    //atributos
    private String nombre;

    private String Apellido;

    private long CUI;

    private int mes_de_nacimiento;

    private int dia_de_nacimiento;

    private int año_de_nacimiento;

    private String Correo_electronico;

    private String Campus;

    //constrructor con parametros
    public Estudiante(String nombre, String Apellido, long CUI, int mes_de_nacimiento, int dia_de_nacimiento, int año_de_nacimiento, String Correo_electronico, String Campus) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.CUI = CUI;
        this.mes_de_nacimiento = mes_de_nacimiento;
        this.dia_de_nacimiento = dia_de_nacimiento;
        this.año_de_nacimiento = año_de_nacimiento;
        this.Correo_electronico = Correo_electronico;
        this.Campus = Campus;


    }

    //setter y getters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public long getCUI() {
        return CUI;
    }

    public void setCUI(long cUI) {
        CUI = cUI;
    }

    public int getMes_de_nacimiento() {
        return mes_de_nacimiento;
    }

    public void setMes_de_nacimiento(int mes_de_nacimiento) {
        this.mes_de_nacimiento = mes_de_nacimiento;
    }

    public int getDia_de_nacimiento() {
        return dia_de_nacimiento;
    }

    public void setDia_de_nacimiento(int dia_de_nacimiento) {
        this.dia_de_nacimiento = dia_de_nacimiento;
    }

    public int getAño_de_nacimiento() {
        return año_de_nacimiento;
    }

    public void setAño_de_nacimiento(int año_de_nacimiento) {
        this.año_de_nacimiento = año_de_nacimiento;
    }

    public String getCorreo_electronico() {
        return Correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        Correo_electronico = correo_electronico;
    }

    public String getCampus() {
        return Campus;
    }

    public void setCampus(String campus) {
        Campus = campus;
    }

    

}
