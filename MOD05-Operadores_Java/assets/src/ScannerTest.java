import java.util.Scanner;

public class ScannerTest{
    public static void main(String[] args){

        //Configurar la lectura del teclado
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String n = keyboard.nextLine();
        System.out.println("¡Wow! Tu nombre " + n + " es muy bonito!");
        keyboard.close();
    }
    
}