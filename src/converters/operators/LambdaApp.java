package converters.operators;

public class LambdaApp {
    public static void main(String[] args) {
        LambdaApp app = new LambdaApp();
        app.run();
    }

    private void run(){
        Operation operation1 = (int Number1, int Number2) -> Number1 + Number2;
        Operation operation2 = (int Number1, int Number2) -> Number1 - Number2;
        Operation operation3 = (int Number1, int Number2) -> Number1 * Number2;
        Operation operation4 = (int Number1, int Number2) -> (double)Number1 / Number2;

        System.out.println(operation1.calculate(4, 5));
        System.out.println(operation2.calculate(4, 5));
        System.out.println(operation3.calculate(4, 5));
        System.out.println(operation4.calculate(4, 5));
    }
}

interface Operation {
    double calculate(int Number1, int Number2);
}
