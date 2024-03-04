public class Main {
    public static void main(String[] args) {
        BMIIndex service = new BMIIndex();
double weight =1.83;
        int height =80;
        int bmi= service.calculate( weight,height);
        System.out.println("Ваш индекс=" + bmi);}
    }
