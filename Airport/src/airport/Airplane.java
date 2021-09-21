package airport;

public class Airplane {
    private  String id;
    private boolean isCurrentlyFlying;
    private double cruiseSpeed;

    public Airplane(String id,  boolean isCurrentlyFlying, double cruiseSpeed){
        this.id = id;
        this.isCurrentlyFlying = isCurrentlyFlying;
        this.cruiseSpeed= cruiseSpeed;
    }

    public String getId() {return id;}

    public void setId(String planeId) {this.id = id;}

    public boolean isCurrentlyFlying() {return isCurrentlyFlying;}

    public void setCurrentlyFlying(boolean currentlyFlying) {isCurrentlyFlying = currentlyFlying;}

    public double getCruiseSpeed() {return cruiseSpeed;}

    public void setCruiseSpeed(double speed) {this.cruiseSpeed= cruiseSpeed;}



    public void airplaneTakeOff() {
        if(!this.isCurrentlyFlying()){
            this.isCurrentlyFlying = true;
            System.out.println("Airplane " + this.id + " rises.");
        }else{
            System.out.println("Airplane " + this.id + " can not take off, because we are already flying.");
        }

    }

    public void airplaneLand() {
        if(this.isCurrentlyFlying()){
            this.isCurrentlyFlying = false;
            this.cruiseSpeed= 0;
            System.out.println("Airplane " + this.id + " lands.");
        }else{
            System.out.println("Airplane " + this.id + " can not land, because we are still on the ground. ");
        }
    }




}
