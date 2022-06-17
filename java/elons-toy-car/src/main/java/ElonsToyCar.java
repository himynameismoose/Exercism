public class ElonsToyCar {
    private int distanceDriven;
    private int batteryLife;

    public ElonsToyCar() {
        distanceDriven = 0;
        batteryLife = 100;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryLife == 0) {
            return "Battery empty";
        }

        return "Battery at " + batteryLife + "%";
    }

    public void drive() {

        if (batteryLife > 0) {
            distanceDriven += 20;
            batteryLife -= 1;
        } else if (batteryLife <= 0) {
            batteryLife = 0;
        }
    }
}
