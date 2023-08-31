public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.69;
        int weight = 58;
        int BMI = service.calculate(height, weight);
        System.out.println(BMI);
    }
}