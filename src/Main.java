// Client
public class Main {
    public static void main(String[] args) {
        UnitConverter converter = new ImperialAdapter();

        double meters = 10;
        double kg = 5;

        System.out.println(meters + " meters = " + converter.convertLength(meters) + " feet");
        System.out.println(kg + " kg = " + converter.convertWeight(kg) + " pounds");
    }
}
