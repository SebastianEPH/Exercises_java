
import java.util.Scanner;

public class Profesor {

    public static void main(String[] args) {
           
        // declaraci;on de variables
        int estudiantes = 0;
        int hombres = 0;
        int mujeres = 0;
        
        // instanciando objeto scanner
        Scanner entrada = new Scanner(System.in);
        
        // cantidad de hombres
        System.out.print("Ingrese cuantos hombres hay: ");
        hombres = Integer.parseInt(entrada.nextLine());  // obtiene un string y lo convierte en un entero
        
         // cantidad de mujeres
        System.out.print("Ingrese cuantas mujeres hay: ");
        mujeres = Integer.parseInt(entrada.nextLine());  // obtiene un string y lo convierte en un entero
        
        // sumando obtenemos el total
        estudiantes = hombres + mujeres ;
        
        //sacando el porcentaje de hombres
        int porcentaje_hombres = (hombres*100)/estudiantes;
        
        System.out.println("EL PORCENTAJE DE HOMBRES ES DE: "+porcentaje_hombres+"%");
        System.out.println("EL PORCENTAJE DE MUJERES ES DE: "+ (100-porcentaje_hombres)+"%");
        System.out.println("EL TOTAL DE ESTUDIANTES ES: "+estudiantes);
    }
    
}
