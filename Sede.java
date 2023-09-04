/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Ejercicio 1, Overloading
 * 13-08-2023
 * @return Sede
 */
import java.util.ArrayList;

public class Sede {
    
    private String nameSede;
    
    ArrayList<Exam> ExamList = new ArrayList<Exam>();

    Sede(String Name){
        this.nameSede = Name;
    }

    public String getNameSede() {
        return nameSede;
    }

    public void setNameSede(String nameSede) {
        this.nameSede = nameSede;
    }

    public ArrayList<Exam> getExamList() {
        return ExamList;
    }

    public void setExamList(ArrayList<Exam> examList) {
        ExamList = examList;
    }

    public float mean(){
        float mean = 0;

        return mean;
    }

    public float median(){
        float median = 0;
        return median;
    }

    public int mode(){
        int mode = 0;
        return mode;
    }

    public float estDesv(){
        float desv = 0;
        return desv;
    }
    public int Registstudents(){
        int students = this.ExamList.size();
        return students;
    }

    public int LowestByExamn(){
        int low = 0;
        return low;
    }
    
    public int HighestByExamn(){
        int high = 0;
        return high;
    }
    
}
