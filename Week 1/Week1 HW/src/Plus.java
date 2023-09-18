public class Plus implements Calculator{
    @Override
    public void calculate(int num1, int num2){
        System.out.printf("%d + %d = %d%n", num1, num2, num1+num2);
    }
}