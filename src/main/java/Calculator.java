public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль не допускается.");
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        // Решим уравнение: 2 * (3 + 4) - 5 / 2
        int result = times(2, add(3, 4)) - div(5, 2);
        return result;
    }
}
