package airport;

public class PeoplePlane extends Airplane{
    private int maxNumberOfPassengers;
    private int currentNumberOfPassengers;

    public PeoplePlane(String id,  boolean isCurrentlyFlying, double speed, int maxNumberOfPassengers, int currentNumberOfPassengers){
        super(id, isCurrentlyFlying, speed);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        this.currentNumberOfPassengers =currentNumberOfPassengers;
    }


    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public int getCurrentNumberOfPassengers() {
        return currentNumberOfPassengers;
    }

    public void setCurrentNumberOfPassengers(int currentNumberOfPassengers) {
        this.currentNumberOfPassengers = currentNumberOfPassengers;
    }



    public int loadPassenger(int numberOfPassenger) {
        this.currentNumberOfPassengers = this.getCurrentNumberOfPassengers();
        if (this.currentNumberOfPassengers >= 0 | this.currentNumberOfPassengers < this.maxNumberOfPassengers) {
            this.currentNumberOfPassengers += numberOfPassenger;
            if (this.currentNumberOfPassengers <= this.maxNumberOfPassengers) {
                System.out.println("Airplane " + this.getId() + " charges " + this.currentNumberOfPassengers + " passengers.");
            } else {
                System.out.println("Airplane " + this.getId()  + " charges " + this.maxNumberOfPassengers + " passengers," +
                        (this.currentNumberOfPassengers - this.maxNumberOfPassengers) + " do not fit");
            }
        } else {
            System.out.println("Airplane " + this.getId()  + " charges " + this.maxNumberOfPassengers + " passengers," +
                    (this.currentNumberOfPassengers - this.maxNumberOfPassengers) + " do not fit");
        }
        return this.currentNumberOfPassengers;
    }

    public int unloadPassenger(int numberOfPassenger) {

        this.currentNumberOfPassengers -= numberOfPassenger;
        System.out.println("Airplane " + this.getId()  + " discharges " + numberOfPassenger + " passengers.");
        return this.currentNumberOfPassengers;
    }

    public void airplaneTakeOff() {
        if(!this.isCurrentlyFlying()){
            this.setCurrentlyFlying(true) ;
            System.out.println("Airplane " + this.getId() + " rises.");
        }else{
            System.out.println("Airplane " + this.getId() + " can not take off, because we are already flying.");
        }

    }

    public void airplaneLand() {
        if(this.isCurrentlyFlying()){
            this.setCurrentlyFlying(false) ;
            this.setCruiseSpeed(0);
            System.out.println("Airplane " +  this.getId()+ " lands.");
        }else{
            System.out.println("Airplane " +  this.getId()+ " can not land, because we are still on the ground. ");
        }
    }
    public String toString(){
        return "planeId: " + this.getId() + "status: " + this.isCurrentlyFlying() +
                    " speed: " +this.getCruiseSpeed() +" capacity: " + this.getMaxNumberOfPassengers()+"current passenger:"+ this.getCurrentNumberOfPassengers();
    }


}
