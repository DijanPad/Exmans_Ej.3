/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Ejercicio 1, Overloading
 * 13-08-2023
 * @return Sede
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
        float sum = 0; 
        for (int i = 0; i <this.ExamList.size(); i++){
            sum = sum + ExamList.get(i).getNota();
        }

        float mean = sum/(this.ExamList.size());

        return mean;
    }

    public float median(){
        int median = 0;

        if (this.ExamList.size() != 0){

        if (this.ExamList.size()%2 != 0){
            median = this.ExamList.get(this.ExamList.size()/2).getNota();
        
        }else {
            median = (this.ExamList.get((this.ExamList.size()-1)/2).getNota()+this.ExamList.get((this.ExamList.size())/2).getNota())/2;
        }
        }
        return median;
    }

    public int mode(){
        int mode = 0;
        // conteo de moda realizado con ayuda de chatGPT
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i=0; i<this.ExamList.size(); i++) {
            int nota = ExamList.get(i).getNota();
            freq.put(nota, freq.getOrDefault(nota, 0) + 1);
        }
        int maxFrecuencia = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                mode = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }
        return mode;
    }

    public double estDesv(){
        double desv = 0;
        float sum = 0; 
        for (int i = 0; i <this.ExamList.size(); i++){
            sum = sum + ExamList.get(i).getNota();
        }

        float mean = sum/(this.ExamList.size());
        
        double sumNotas = 0;
        for (int i=0; i<this.ExamList.size(); i++){
            sumNotas = sumNotas + Math.sqrt(Math.pow(this.ExamList.get(i).getNota() - mean,2));

        }
        desv = Math.sqrt(sumNotas);
        return desv;
    }
    public int Registstudents(){
        int students = this.ExamList.size();
        return students;
    }

    public int LowestByExamn(){
        int low = 100;

        for(int i=0;i<this.ExamList.size();i++){
            if (this.ExamList.get(i).getNota() < low){
                low = this.ExamList.get(i).getNota();
            }
        }

        return low;
    }
    
    public int HighestByExamn(){
        int high = 0;
        for(int i=0;i<this.ExamList.size();i++){
            if (this.ExamList.get(i).getNota() >high){
                high = this.ExamList.get(i).getNota();
            }
        }

        return high;
    }
    
}
