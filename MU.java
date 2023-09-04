/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Ejercicio 1, Overloading
 * 13-08-2023
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MU {


    public static void main(String[] args){
    
    //Intancia de sedes
    Sede sede1, sede2, sede3;

    sede1 = new Sede("Sede Norte");
    sede2 = new Sede("Sede Sur");
    sede3 = new Sede("Sede Central");

   //creacion de array list de sedes
    Scanner scanner = new Scanner(System.in);
    ArrayList<Sede> Sedelist = new ArrayList<Sede>();

    // agregar sedes al array list
    Sedelist.add(sede1);
    Sedelist.add(sede2);
    Sedelist.add(sede3);

    //Datos de prueba del programa 
    (sede2.getExamList()).add(new Exam("Matematicas", new Estudiante("Billy", "Joel", 231433241, 6, 4, 1964, "billyjoel@gmail.com", "Norte")));
    (sede2.getExamList()).add(new Exam("Ingles", new Estudiante("John", "Diaz", 534653456, 7, 4, 1964, "billyjoel@gmail.com", "Norte")));
    (sede2.getExamList()).add(new Exam("Lengauje", new Estudiante("Gabriel", "Bran", 974747455, 6, 4, 1964, "billyjoel@gmail.com", "Norte")));
    (sede1.getExamList()).add(new Exam("Quimica", new Estudiante("Iris", "Ayala", 958498758, 6, 4, 1964, "billyjoel@gmail.com", "Norte")));
    (sede1.getExamList()).add(new Exam("Matematicas", new Estudiante("Anggie", "Quezada", 98937434, 6, 4, 1964, "billyjoel@gmail.com", "Norte")));
    (sede1.getExamList()).add(new Exam("Biologia", new Estudiante("David", "Dom", 7547389, 6, 4, 1964, "billyjoel@gmail.com", "Norte")));

    // variables de control
    boolean run =  true;
    String inputString = "";
    int inputOption = 0;
    
    // inicio del ciclo
    while (run == true){
        //menu
        System.out.println("===== Monsters University =====");
        System.out.println("1. Ingresar nuevo estudiante");
        System.out.println("2. Ingresar por csv (opcion en desarrollo)");
        System.out.println("3. Ingresar notas");
        System.out.println("4. Mostrar estadísticas");
        System.out.println("5. Agregar nueva sede");
        System.out.println("6. Salir");
        
        inputOption = scanner.nextInt();
        //catcher del enter
        String catcher = scanner.nextLine();

        if (inputOption == 1) {
        System.out.println(catcher);
        //recorrer array de sede para mostrar opciones 
        for (int count = 0; count<Sedelist.size(); count++) {
            System.out.println((count+1) + ". Sede " + Sedelist.get(count).getNameSede());
        }

        // Indicar cual es la sede en la que se realiza el examen
        System.out.println("Ingrese el numero de sede donde realiza el examen: ");
        inputOption = scanner.nextInt(); 

        //no hay progra defensiva :(

        // atributos de un objeto estudiante
        System.out.println("Ingrese el tipo de examen: ");
        inputString = scanner.nextLine();
        System.out.println("Ingrese su Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su Apellido: ");
        String Apellido = scanner.nextLine();
        System.out.println("Ingrese su CUI: ");
        long CUI = scanner.nextLong();
        System.out.println("Ingrese su Mes de Nacimiento: ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese su Dia de Nacimiento: ");
        int dia = scanner.nextInt();
        System.out.println("Ingrese su Año de Nacimiento: ");
        int año = scanner.nextInt();
        System.out.println("Ingrese su Correo electronico: ");
        String correo = scanner.nextLine();
        System.out.println("Ingrese el campus en el que se inscribira: ");
        String campus = scanner.nextLine();
        Sedelist.get(inputOption-1).getExamList().add(new Exam(inputString, new Estudiante(nombre, Apellido, CUI, mes, dia, año, correo, campus)));
    }
        else if (inputOption == 2) {
            //segun las instrucciones no se debe de elaborar pero deje la opcion en el menu
            System.out.println("Feature in development, come back soon ;)");
    }
    else if (inputOption == 3) {
        System.out.println(catcher);   
        
        //print ctacher, para insertar un enter
        for (int i = 0; i < Sedelist.size(); i++){ 
            //recorrido de sedes
            System.out.println("Estudiantes Sede: " + Sedelist.get(i).getNameSede());
            Sede sede = Sedelist.get(i);
            ArrayList<Exam> exlist = sede.getExamList();

            for (int j = 0; j < exlist.size(); j++){ 
                //recorrido de examenes/estudiantes por cada sede
                Exam ex = exlist.get(j);
                Estudiante stud = ex.getUsuario();
                System.out.println(stud.getNombre());
                System.out.println("Examen de: " + ex.getTipo());
                System.out.println("Ingresar nota: ");
                int nota = scanner.nextInt();
                ex.setNota(nota);
        }
        }
        
    }
    else if (inputOption == 4) {
    for (int i = 0; i < Sedelist.size(); i++){
        //recorrido de sedes para calculos estadisticos por sede
                Sede sede = Sedelist.get(i);
                System.out.println("============ Sede " + sede.getNameSede() + " ============");
                System.out.println("Media: " + sede.mean());
                System.out.println("Mediana: " + sede.median());
                System.out.println("Moda: "+sede.mode());
                System.out.println("Desviacion estandar: " + sede.estDesv());
                System.out.println("Numero de estudiantes: " + sede.Registstudents());
                System.out.println("Nota mas baja: " + sede.LowestByExamn());
                System.out.println("Nota mas alta: " + sede.HighestByExamn());

        }
    }
    else if (inputOption == 5) {
        //agregar una nueva sede al array list
        System.out.println(catcher);
        System.out.println("Ingrese el nombre de la Sede: ");
        inputString = scanner.nextLine();
        Sedelist.add(new Sede(inputString));

    }
    else if (inputOption == 6) {
        //salir
        run = false;
    }
    else{
        System.out.println("Igrese una opcion valida");
    }

    }
scanner.close();
}
}

