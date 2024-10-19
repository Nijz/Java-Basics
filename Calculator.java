public class Calculator {

    public static void main(String[] args) {

        AddNumber add = new AddNumber();
        int addAns = add.addition(4, 6);
        System.out.println("Addition of two number: " + addAns);

        SubNumber sub = new SubNumber();
        int subAns = sub.subtraction(5, 3);
        System.out.println("Subtraction of two Number: " + subAns);

        MultiplyNumber mul = new MultiplyNumber();
        int mulAns = mul.multiplication(2, 3);
        System.out.println("Multiplication of two Number: " + mulAns);

        DivideNumber div = new DivideNumber();
        int divAns = div.division(10, 2);
        System.out.println("Division of two Number: " + divAns);
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

class MultiplyNumber {

    public int multiplication(int a, int b){
        return a * b;
    }
}

class DivideNumber {

    public int division(int a, int b){
        return a / b;
    }
}

