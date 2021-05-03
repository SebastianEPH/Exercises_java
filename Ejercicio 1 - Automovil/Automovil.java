
import java.util.Scanner;

public class Automovil {

    public static void main(String[] args) {
        // declaración de variables
        int salario_empleado = 1250; // S/ 
        int comision = 150; // S/
        String nombre_empleado = "";
        int venta_empleado; // unidades
        
        int valor_auto[];// S/
        int valor_total_auto = 0; // soles

        
        
        // ingreso del nombre del empleado
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        nombre_empleado = entrada.nextLine(); 
        
        
        
        // ingreso de la cantidad de automoviles vendió
        System.out.print("¿El empleado "+ nombre_empleado+", cuantos automoviles vendio?: "); 
        venta_empleado = Integer.parseInt(entrada.nextLine());  // obtiene un string y lo convierte en un entero
        
        // se crea un array con la longitud de ventas
        valor_auto= new int[venta_empleado];
        
        if(venta_empleado <= 0){
            // El empleado no vendio autos
        }else{

            for (int i = 0; i < venta_empleado ; i++) {
                System.out.println("El "+ (i+1) +" auto tiene un valor de ?: ");
                // guarda el costo del automovil en un array
                valor_auto[i] = Integer.parseInt(entrada.nextLine());
                //va sumando el costo total de todos los automoviles vendidos
                valor_total_auto = valor_total_auto + valor_auto[i] ;
            }
        }
        
 
        
        
        // calculando el salario del empleado
        System.out.println("-----------------------------------");
        System.out.println("-----------SALARIO DEL MES---------");
        System.out.println("-----------------------------------");
        System.out.println("Hola "+nombre_empleado+" ");
        System.out.println("-----------------------------------");
        System.out.println("COMISION ESTANDARD POR VENTA: "+comision);
        System.out.println("SU VENTA DE AUTOS: "+venta_empleado);
        
        if(venta_empleado <= 0){
            System.out.println("COMISION POR VENTAS DE AUTOS: "+ venta_empleado +" SOLES");
            
            System.out.println("SU SALARIO DEL MES ES DE: "+salario_empleado +" SOLES");
        }else{
            System.out.println("LISTA DE PRECIOS DE AUTOS VENDIDOS\n");
            for (int i = 0; i < venta_empleado ; i++) {
               System.out.println(" * => El automovil  "+ (i+1) +" tiene un valor de: " + valor_auto[i]+" soles");
            }
            System.out.println("\nEL VALOR TOTAL DE LOS AUTOS ES DE: " + valor_total_auto+" SOLES");
            System.out.println("COMISIÓN POR AUTOS : "+(venta_empleado*comision)+" SOLES");
            
            // se calcula la comision del 5%
            int comision_cinco = (valor_total_auto/100)*5;
            System.out.println("COMISIÓN DEL 5% POR AUTO : "+(comision_cinco )+" SOLES");
            
            System.out.println("SU SALARIO DEL MES ES DE: "+(salario_empleado+ comision_cinco +(venta_empleado*comision))+" SOLES");
        }
        
       
        
        System.out.println("-----------------------------------");
        
        
       

    }
    
}

