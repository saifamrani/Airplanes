package airport;

public class CargoPlane extends Airplane {
    private int capacity;


    public CargoPlane(String planeId, boolean isCurrentlyFlying, double speed, int capacity) {
        super(planeId, isCurrentlyFlying, speed);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int loadCapacity(int ton) {
        this.capacity = this.getCapacity();
        if (this.capacity < 20) {
            this.capacity += ton;
            if (this.capacity <= 20) {
                System.out.println("Airplane " + this.getId() + " loads " + this.capacity + " tons of cargo suitable");
            } else {
                System.out.println("Airplane " + this.getId() + " loads " + this.capacity + " tons of cargo," +
                        (this.capacity - 20) + " does not fit");
            }
        } else {
            System.out.println("Airplane " + this.getId() + " loads " + this.capacity + " tons of cargo," +
                    (this.capacity - 20) + " does not fit");
        }
        return this.capacity;
    }

    public int unloadCapacity(int ton) {

        this.capacity -= ton;
        System.out.println("Airplane " + this.getId() + " unloads " + this.getId() + " tons.");
        return this.capacity;
    }
    public String toString(){
        return "planeId: " + this.getId() + "status: " + this.isCurrentlyFlying() +
                " speed: " +this.getCruiseSpeed() +" capacity: " + this.getCapacity();
    }


}
