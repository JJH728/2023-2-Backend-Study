public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator=new Plus();
        calculator.calculate(1234,4321);
        calculator=new Minus();
        calculator.calculate(911,170);
        calculator=new Mul();
        calculator.calculate(2,3);
        calculator=new Div();
        calculator.calculate(33,11);

        Animal animal=new Animal("cat", "Meow");
        animal.howl();
        
        animal.setName("dog");
        animal.setHowling("Woof");
        animal.howl();
    }
}
