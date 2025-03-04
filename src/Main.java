public class Main {
    public static Void main(String[]arg){
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5,7));
        //prueba sustraer
        System.out.println(myCalculator.subtract(45,11));
        // prueba multiplicacion
        System.out.println(myCalculator.multiply(58, 21));
        //prueba division
        System.out.println(myCalculator.divide(58, 21));

        //prueba modulo
        System.out.println(myCalculator.modulo(154, 3));


    }
}
