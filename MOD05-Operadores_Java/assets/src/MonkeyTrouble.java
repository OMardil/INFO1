import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Is the first monkey smiling? (true/false): ");
        boolean monkey1 = teclado.nextBoolean();

        System.out.print("Is the second monkey smiling? (true/false): ");
        boolean monkey2 = teclado.nextBoolean();

        if ((monkey1 == true && monkey2 == true) || (monkey1 == false && monkey2 == false)) {
            System.out.println("Look out! The monkeys are planning something!");
        } 
        else {
            System.out.println("Don't worry, everything is OK");
        }
        teclado.close();
    }
}
