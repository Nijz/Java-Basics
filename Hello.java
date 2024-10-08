
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        
        System.out.println("Hello World");
        System.out.println("First code in java");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("You entered: " + number);

        HelloWorld hw = new HelloWorld();
        hw.haha();
    }
}

class HelloWorld {

    public void haha() {
        System.out.println("Hello World from hello wrold class");
    }

}