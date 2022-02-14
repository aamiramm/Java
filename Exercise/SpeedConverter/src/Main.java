public class Main {

    public static void main(String[] args) {

        double miles = SpeedConverter.toMilesPerHour(1.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(1.5);
    }
}
