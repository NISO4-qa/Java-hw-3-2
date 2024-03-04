public class Main {
    public static void main(String[] args) {
        BMIIndex service = new BMIIndex();
        double height = 1.83;
        int weight = 80;
        int bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс=" + bmi);}
    }
