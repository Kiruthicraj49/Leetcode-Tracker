// Last updated: 09/07/2026, 15:05:54
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius+273.15;
        double fahren = (9*(celsius)/5) + 32;
        return new double[]{kelvin,fahren};
    }
}