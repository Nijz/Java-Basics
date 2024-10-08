
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        
        System.out.println("Hello World");
        System.out.println("First code in java");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("You entered: " + number);
    }
}