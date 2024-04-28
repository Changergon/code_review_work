public class Calculator {
    public double add(double a, double b){
        return a + b;
    }
    public double dif(double a, double b){
        return a - b;
    }
    public double div(double a, double b){
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
    public double times(double a, double b){
        return a * b;
    }
    public double solver(){
        // Решаем уравнение: 2 * (3 + 4) - 5 / 2
        double sum = add(3, 4);
        double product = times(2, sum);
        double divisionResult = div(5, 2);
        double result = dif(product, divisionResult);
        return result;
    }
}