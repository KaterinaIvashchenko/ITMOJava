package chess;

/**
 * Created by katerina on 12/25/16.
 */

public class Human extends Thread {

    private String someName;
    private boolean role;
    private Clock clock;

    public Human(String someName, boolean role, Clock clock) {
        this.someName = someName;
        this.role = role;
        this.clock = clock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(someName + " -> " + clock.changeState(role));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public Clock getClock() {
        return clock;
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public String getSomeName() {
        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Human{" +
                "someName='" + someName + '\'' +
                ", role=" + role +
                '}';
    }
}
