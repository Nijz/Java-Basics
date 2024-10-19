import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Str s = new Str();

        String name = s.inputString();

        System.out.println("Hello " + name);
        System.out.println("Initial "+ name.charAt(0));
    }
}

class Students {

    int rollno;
    String name;
    String course;
    int marks;

    public Students(int rollno, String name, String course, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}

class Str {

    String str;

    public String inputString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        str = sc.nextLine();
        return str;
    }
}