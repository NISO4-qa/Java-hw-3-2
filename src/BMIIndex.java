public class BMIIndex {

    public int calculate(double weight, int height) {
int bmi = (int) (weight / (height * height));
        return bmi;
    }

}

