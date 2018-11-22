package converters.operators;

public class LambdaConverter {

    public static void main(String[] args) {
        LambdaConverter converter = new LambdaConverter();
        converter.run();
    }

    public void run(){
        Converter converter = (String str1, String str2) -> str1 + str2;
        System.out.println(converter.concatenate("Daniel ", "Pidor"));
    }
}

interface Converter{
    String concatenate(String string1, String string2);
}