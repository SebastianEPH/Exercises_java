
import java.util.Scanner;

public class Cajera {

    public static void main(String[] args) {
        
        int dinero = 0;
        
        int billetes_200=0;
        int billetes_100=0;
        int billetes_50=0;
        int billetes_20=0;
        int billetes_10=0;
        int moneda_5=0;
        int moneda_2=0;
        int moneda_1=0;
        
        
        // ingreso del monto
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el monto : ");
        dinero = Integer.parseInt(entrada.nextLine());  // obtiene un string y lo convierte en un entero
        System.out.println("El dinero ingresado es: "+dinero);   
        
        if (dinero <= 0){
            System.out.println("por favor ingrese un valor que sea mayor igual a 1");
            System.exit(0);
        }
        
        // 200 soles 
        if(dinero >=200){
            // se separará el dinero en billetes de 200 hasta tener un valor menor que 200
            int total= 0;
            for (int i = 0; i < dinero; i++) {
                total = total + 200;
                if(total>= dinero){
                    total = total - 200; // se elimina los 200 sobrantes
                    billetes_200 = i; // guardamos el valor
                    dinero =  dinero- total;
                    break;
                }
            }
        }

        // 100 soles 
        if(dinero >=100){
            billetes_100 = 1;
            dinero = dinero - 100;
        }
        
        // 50 soles 
        if(dinero >=50){
            billetes_50 = 1;
            dinero = dinero - 50;
        }
        // 20 soles 
        if(dinero >=20){
            if (dinero >=40){
                billetes_20 = 2;
                dinero = dinero - 40;
            }else{
                billetes_20 = 1;
                dinero = dinero - 20;
            }
        }
        
        // 10 soles 
        if(dinero >=10){
            billetes_10 = 1;
            dinero = dinero - 10;
        }
        
        // 5 soles 
        if(dinero >=5){
            moneda_5 = 1;
            dinero = dinero - 50;
        }
        // 2 soles 
        if(dinero >=2){
            if (dinero >=4){
                moneda_2 = 2;
                dinero = dinero - 4;
            }else{
                moneda_2 = 1;
                dinero = dinero - 2;
            }
        }
        // 1 soles 
        if(dinero >=1){
            moneda_1 = 1;
            dinero = dinero - 1;
        }
        
       
        System.out.println("Recibe");
        if(billetes_200 >=1){
            System.out.println(billetes_200+" Billete de 200: ");
        }
        if(billetes_100 >=1){
            System.out.println(billetes_100 +" Billete de 200: ");
        }
        if(billetes_50 >=1){
            System.out.println(billetes_50+" Billete de 50: ");
        }
        if(billetes_20 >=1){
            System.out.println(billetes_20+" Billete de 20: ");
        }
        if(billetes_10 >=1){
            System.out.println(billetes_10+"Billete de 10: ");
        }
        if(moneda_5 >=1){
             System.out.println(moneda_5 +" Moneda de 5: ");
        }
        if(moneda_2 >=1){
            System.out.println(moneda_2+" Moneda de 2: ");
        }
        if(moneda_1 >=1){
            System.out.println(moneda_1+ " Moneda de 1: ");
        }
        
        
       
      


        
        
        
        
        
        
      
        
        
        
        
        
        
        
        
        
        
    }
    
}
