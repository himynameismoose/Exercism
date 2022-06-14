public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate = 1;

        if (speed >= 5 && speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else if (speed == 10) {
            successRate = 0.77;
        }

        return 221 * speed * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        double carsPerHour = productionRatePerHour(speed);

        return (int) carsPerHour / 60;
    }
}
