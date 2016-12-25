package chess;

/**
 * Created by katerina on 12/25/16.
 */

public class Clock {

    private boolean state = false;

    public synchronized boolean changeState(boolean state) throws InterruptedException {

        if (this.state == state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            this.state = state;
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        return state;
    }
}
