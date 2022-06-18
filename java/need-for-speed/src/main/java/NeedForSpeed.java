class NeedForSpeed {
    // Attributes
    int speed;
    int batteryStatus;
    int distanceDriven;
    int batteryDrain;

    // TODO: define the constructor for the 'NeedForSpeed' class
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        distanceDriven = 0;
        batteryStatus = 100;
    }

    public boolean batteryDrained() {
        return batteryStatus == 0;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            batteryStatus -= batteryDrain;

            if (batteryStatus <= 0)
                batteryStatus = 0;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    // Attributes
    int distance;

    // TODO: define the constructor for the 'RaceTrack' class
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        boolean canFinish = false;

        while (car.distanceDriven() < distance && !car.batteryDrained()) {
            car.drive();

            if (car.distanceDriven() == distance)
                canFinish = true;
        }

        return canFinish;
    }
}
