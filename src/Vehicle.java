public class Vehicle {
    int speed = 0;
    boolean start = false;

    public void Start(boolean start) {
        this.start = start;
    }

    public class Engine implements Runnable {
        @Override
        public void run(int newSpeed) {
            speed += newSpeed;
            System.out.println(speed);
        }
    }
}
