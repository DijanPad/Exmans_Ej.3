/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Ejercicio 1, Overloading
 * 13-08-2023
 * @return Sede
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sede {
    
    //atributos
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

            //recorrido y suma de todas las notas por sede
            sum = sum + ExamList.get(i).getNota();
        }

        //suma total divido la cantidad de datos (Statistics ;))
        float mean = sum/(this.ExamList.size());

        return mean;
    }

    public float median(){
        int median = 0;

        if (this.ExamList.size() != 0){//defensivo evita division en 0


        if (this.ExamList.size()%2 != 0){
            
            //media de numero impar de datos
            median = this.ExamList.get(this.ExamList.size()/2).getNota();
        
        }else {
            //media de numero par de datos
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

            //recorrido y mapeo de cada dato en el array ExamList
            int nota = ExamList.get(i).getNota();

            //conteo de frequencia por dato
            freq.put(nota, freq.getOrDefault(nota, 0) + 1);
        }
        int maxFrecuencia = 0;

        //valor mas alto de repeticion de datos
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
        
        //media dentro de este metodo (para no depender del otro)
        //no es potimizado, pero si el otro falla, vuelve a hayar la media

        double sumNotas = 0;
        for (int i=0; i<this.ExamList.size(); i++){
            sumNotas = sumNotas + Math.sqrt(Math.pow(this.ExamList.get(i).getNota() - mean,2));
            //sumatoria del valor absoluto de la diferencia entre cada dato y la media
        }
        desv = Math.sqrt(sumNotas);
        //raiz cuadrada para pasar de varianza a desviacion estandar

        return desv;
    }


    public int Registstudents(){
        int students = this.ExamList.size();
        //cantidad de alumnos en array list
        return students;
    }

    public int LowestByExamn(){
        int low = 0;
        if (this.ExamList.size() !=0){//condicion defensiva
        low = 100;
        //100 es el valor maximo, por lo que siempre va a encontrar un minimo
        //incluso cuando 100 sea el minimo

        for(int i=0;i<this.ExamList.size();i++){
            if (this.ExamList.get(i).getNota() < low){
                low = this.ExamList.get(i).getNota();
            }
            //recorre y busca un dato menor a 100
        }
        }
        return low;
        
    }
    
    public int HighestByExamn(){
        int high = 0;
        //misma logica del 100 en el minimo, para el 100 en el maximo

        for(int i=0;i<this.ExamList.size();i++){
            if (this.ExamList.get(i).getNota() >high){
                high = this.ExamList.get(i).getNota();
            }
        }
        //busca y reemplaza con las notas mas altas

        return high;
    }
    
}
