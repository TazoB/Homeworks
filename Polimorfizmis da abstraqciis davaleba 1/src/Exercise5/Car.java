package Exercise5;

public class Car implements Engine, Direction{
    @Override
    public void left() {
        System.out.println("Go left");
    }

    @Override
    public void right() {
        System.out.println("Go right");
    }

    @Override
    public void start() {
        System.out.println("Start Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine");
    }
}
