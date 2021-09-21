package airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        PeoplePlane airplane1 = new PeoplePlane("ABC123", true, 0, 55, 150);
        PeoplePlane airplane2 = new PeoplePlane("DDD888", true, 0, 40, 120);

        List<PeoplePlane> airplanes = new ArrayList<>(Arrays.asList(
                new PeoplePlane("ABC144", true, 0, 50, 11),
                new PeoplePlane("DDD888", true, 0, 87, 25),
                new PeoplePlane("ODL345", false, 0, 100, 0)));



        List<CargoPlane> cargoPlanes = new ArrayList<>(Arrays.asList(
                new CargoPlane("FF2134", false, 400, 15),
                new CargoPlane("PLA166", false, 400, 15)));



        Airport airport1 = new Airport("Eindhoven", airplanes, cargoPlanes);
        airport1.getAllAircraft();
        System.out.println("-------------------------------------------------------");
        airport1.getAllCargoPlanes();
        System.out.println("-------------------------------------------------------");
        airport1.getFitPlane(25);
        System.out.println("-------------------------------------------------------");
        airport1.getFitCargoPlane(30);
        System.out.println("-------------------------------------------------------");
        airplane1.loadPassenger(40);
        System.out.println("-------------------------------------------------------");
        airplane1.airplaneTakeOff();
        System.out.println("-------------------------------------------------------");
        airplane2.loadPassenger(20);
        System.out.println("-------------------------------------------------------");
        airplane1.airplaneLand();
        System.out.println("-------------------------------------------------------");
        airplane1.unloadPassenger(50);
        System.out.println("-------------------------------------------------------");
        airplane2.airplaneTakeOff();
        System.out.println("-------------------------------------------------------");
        airplane2.airplaneLand();
        System.out.println("-------------------------------------------------------");
        airplane2.unloadPassenger(18);
        System.out.println("-------------------------------------------------------");
        System.out.println(cargoPlanes.get(0).toString());;
        System.out.println("-------------------------------------------------------");
    }
}
