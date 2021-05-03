

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        // declaración de variables
        int presupuesto_anual = 0;
        
        // instanciando objeto scanner
        Scanner entrada = new Scanner(System.in);
        
        // ingreso del presupuesto anual
        System.out.print("Ingrese el presupuesto anual: ");
        presupuesto_anual = Integer.parseInt(entrada.nextLine());  // obtiene un string y lo convierte en un entero
        
        if(presupuesto_anual <= 0){
            System.out.println("Por favor ingrese un número valido");
        }else{
            System.out.println("-------------------------");
            System.out.println("EL PRESUPUESTO ANUAL ES: "+ presupuesto_anual);
            System.out.println("-------------------------");
            
            float porcentaje_urgencias = 37*presupuesto_anual/100;
            float porcentaje_pedriatra = 42*presupuesto_anual/100;
            float porcentaje_trauma    = 21*presupuesto_anual/100;
            
            
            System.out.println("AREA: Urgencias 37%");
            System.out.println("Presupuesto: "+porcentaje_urgencias );
            
            
            System.out.println("AREA: Pediatría 42%");
            System.out.println("Presupuesto: "+porcentaje_pedriatra);
            
            
            System.out.println("AREA: Traumatología 21%");
            System.out.println("Presupuesto: "+porcentaje_trauma);
            

            System.out.println("-------------------------");
            System.out.println(porcentaje_pedriatra+ porcentaje_urgencias+ porcentaje_trauma);
            System.out.println("-------------------------");
            
        }
        
        
        
        
        
        
    }
    
}
