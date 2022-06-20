import java.util.*;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> rankedCarsList = new ArrayList<>();

        rankedCarsList.add(prc1);
        rankedCarsList.add(prc2);

        Collections.sort(rankedCarsList);

        return rankedCarsList;
    }
}
