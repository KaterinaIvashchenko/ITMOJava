package CycleForEx;


public class Main {

    public static void main(String[] args) {
        w();
    }

    private static void w() {
        int random = (int) (Math.random()*101);
        while (random != 42) {
        } try {
                throw new Exception("Random is " + random);
            } catch (Exception e) {
            } finally {
                random = (int) (Math.random()*101);
                System.out.println("Random is " + random);
            }
        }
}
