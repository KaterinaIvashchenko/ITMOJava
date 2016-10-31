package car.Inner;

/**
 * Created by katerina on 10/31/16.
 */
public class Engine {
    private Integer rpm = 0;
    private Cylinder[] cylindres;

    public Engine(int count) {
        this.cylindres = new Cylinder[count];

        for (int i = 0; i < cylindres.length; i++) {
            cylindres[i] = new Cylinder();
        }
    }

    public boolean checkWorking() {
        if (rpm > 0) {
            for (Cylinder c : cylindres){
                c.work();
            }
            return true;
        }
        return false;
    }

    public boolean start() {
        if (!checkWorking()) {
            this.rpm = (int) (Math.random() * 8001);
            return checkWorking();
        }
        return false;
    }
        public  void stop(){
            this.rpm = 0;
        }
}
