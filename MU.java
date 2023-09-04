import java.util.ArrayList;
import java.util.Scanner;

public class MU {


    public static void main(String[] args){
    

    Scanner scanner = new Scanner(System.in);
    Sede sede1, sede2, sede3;

    sede1 = new Sede("Sede Norte");
    sede2 = new Sede("Sede Sur");
    sede3 = new Sede("Sede Central");

   
    
    ArrayList<Sede> Sedelist = new ArrayList<Sede>();

    Sedelist.add(sede1);
    Sedelist.add(sede2);
    Sedelist.add(sede3);

    boolean run =  true;
    String inputString = "";
    int inputOption = 0;

    while (run == true){
        System.out.println("");
        System.out.println("1. Ingresar nuevo estudiante");
        System.out.println("2. Ingresar por csv (solo estructura)");
        System.out.println("3. Ingresar notas");
        System.out.println("4. Mostrar estadísticas");
        System.out.println("5. Agregar nueva sede");
        System.out.println("6. Salir");
        String catcher = scanner.nextLine();

        inputOption = scanner.nextInt();


        if (inputOption == 1) {
        catcher = scanner.nextLine();
        System.out.println(catcher);
    }
        else if (inputOption == 2) {

    }
    else if (inputOption == 3) {

        // catcher = scanner.nextLine();
        // System.out.println(catcher);    
        // for (int i = 0; i < Sedelist.size(); i++){
        //     Sede sede = Sedelist.get(i);
        //     ArrayList<Exam> exlist = sede.getExamList();
        //     for (int j = 0; j < exlist.size(); j++){
        //         Exam ex = exlist.get(j);
        //         Estudiante stud = ex.getUsuario();
        //         System.out.println(stud.getNombre());
        //         ex.setNota(j);
        // }
        // }
        
    }
    else if (inputOption == 4) {
    for (int i = 0; i < Sedelist.size(); i++){
                Sede sede = Sedelist.get(i);
                System.out.println("Media: " + sede.mean());
                System.out.println("Mediana: " + sede.median());
                System.out.println("Moda: " + sede.estDesv());
                System.out.println("Numero de estudiantes: " + sede.Registstudents());
                System.out.println("Nota mas baja" + sede.LowestByExamn());
                System.out.println("Nota mas alta" + sede.HighestByExamn());

        }
    }
    else if (inputOption == 5) {
        catcher = scanner.nextLine();
        System.out.println(catcher);

        inputString = scanner.nextLine();
        Sedelist.add(new Sede(inputString));

    }
    else if (inputOption == 6) {
        run = false;
    }
    else{
        System.out.println("Igrese una opcion valida");
    }

    }

}
}

