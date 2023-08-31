public class BmiService {
    public int calculate(double height, int weight) {
        double formul = weight / (height * height);

        return (int) formul;
    }

}
