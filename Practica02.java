import java.util.Scanner;

public class Practica02 {

    public static void main(String[] args) {
        
        double temperatura;
        int escala;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bienvenido a un conversor, porfavor ingrese la temperatura:");
        temperatura = input.nextDouble();
        
        System.out.println("Ahora ingrese la escala");
        System.out.println("Celcius(1) o Farenhair(2)");
        
        escala = input.nextInt();
        
        if(escala == 1){
            double celcius =(temperatura - 32) * 5/9;
            System.out.println(celcius);
            
        }
        else {
            if(escala == 2){
                double farenhair = temperatura * 1.8 + 32;
                System.out.println(farenhair);
            }
            else {
                System.out.println("Porfavor ponga uno de los valores que se le mostro, Gracias");
            }
        }
        
        input.close();
        
    }
}
