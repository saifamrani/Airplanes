package airport;

import java.util.ArrayList;
import java.util.List;

public record Airport(String name, List<PeoplePlane> airplanes,
                      List<CargoPlane> cargoPlanes) {

    public String getName() {
        return name;
    }

    public List<PeoplePlane> getAllAircraft() {
        System.out.println("Aircraft from airport " + this.getName() + " :");
        for (PeoplePlane airplane : airplanes) {
            System.out.println("Passenger Airplane: " + airplane.getId());
        }
        return airplanes;
    }

    public List<CargoPlane> getAllCargoPlanes() {
        System.out.println("Cargo Aircraft from airport " + this.getName() + " :");
        for (CargoPlane cAirplane : cargoPlanes) {
            System.out.println("Cargo Airplane: " + cAirplane.getId());
        }
        return cargoPlanes;
    }

    public List<PeoplePlane> getFitPlane(int numberOfPassenger) {
        List<PeoplePlane> fitAirplanes = new ArrayList<>();
        for (PeoplePlane airplane : airplanes) {
            if (!airplane.isCurrentlyFlying() & ((airplane.getCurrentNumberOfPassengers() + numberOfPassenger) < airplane.getMaxNumberOfPassengers())) {
                fitAirplanes.add(airplane);
                System.out.println("Plane " + airplane.getId() + " requested. Is not flying, still room for " +
                        (airplane.getMaxNumberOfPassengers() - (airplane.getCurrentNumberOfPassengers() + numberOfPassenger)) + " passengers.");
            }
            if ((airplane.getCurrentNumberOfPassengers() + numberOfPassenger) >= airplane.getMaxNumberOfPassengers()) {
                System.out.println("Plane " + airplane.getId() + " loads " + airplane.getCurrentNumberOfPassengers() + " passengers, " +
                        ((airplane.getCurrentNumberOfPassengers() + numberOfPassenger) - airplane.getMaxNumberOfPassengers()) + " do not fit into the plane.");
            }
            if (airplane.isCurrentlyFlying() & ((airplane.getCurrentNumberOfPassengers() + numberOfPassenger) < airplane.getMaxNumberOfPassengers())) {
                System.out.println("Plane " + airplane.getId() + " loads " + airplane.getCurrentNumberOfPassengers() + " passengers, " +
                        (airplane.getMaxNumberOfPassengers() - (airplane.getCurrentNumberOfPassengers() + numberOfPassenger)) + " fit into plane");
            }
        }
        return null;
    }

    public List<CargoPlane> getFitCargoPlane(int ton) {
        List<CargoPlane> fitAirplanes = new ArrayList<>();

        for (CargoPlane airplane : cargoPlanes) {

            if (!airplane.isCurrentlyFlying() & ((airplane.getCapacity() + ton) < 20)) {
                fitAirplanes.add(airplane);
                System.out.println("Plane " + airplane.getId() + " requested. Is not flying, still room for " +
                        (20 - (airplane.getCapacity() + ton)) + " tons of freight");

            }
            if (!airplane.isCurrentlyFlying() & (airplane.getCapacity()) + ton >= 20) {
                System.out.println("Plane " + airplane.getId() + " loads " + airplane.getCapacity() + " tons of cargo, " +
                        ((airplane.getCapacity() + ton) - 20) + " does not fit into the plane.");
            }
            if (!airplane.isCurrentlyFlying() & (airplane.getCapacity()) + ton < 20) {
                System.out.println("Plane " + airplane.getId() + " loads " + airplane.getCapacity() + " tons of cargo, " +
                        (20 - (airplane.getCapacity() + ton)) + "  fits into the plane..");
            }
        }
        return null;
    }


}

