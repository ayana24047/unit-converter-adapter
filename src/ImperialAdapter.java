// Adapter
public class ImperialAdapter implements UnitConverter {
    private MetricConverter metric = new MetricConverter();

    @Override
    public double convertLength(double meters) {
        return meters * 3.28084; // meters → feet
    }

    @Override
    public double convertWeight(double kg) {
        return kg * 2.20462; // kg → pounds
    }
}
