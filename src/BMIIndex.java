public class BMIIndex {

    public int calculate(int weight, double height) {
        double index = weight / (height * height);
        return (int) index;
    }

}

