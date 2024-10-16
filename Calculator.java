public class Calculator {

    public static void main(String[] args) {

        AddNumber add = new AddNumber();
        int addAns = add.addition(4, 6);
        System.out.println("Addition of two number: " + addAns);

        SubNumber sub = new SubNumber();
        int subAns = sub.subtraction(5, 3);
        System.out.println("Subtraction of two Number: " + subAns);

    }
}

class AddNumber {

    public int addition(int a, int b){
        return a + b;
    }
}

class SubNumber {

    public int subtraction(int a, int b){
        return a - b;
    }
}