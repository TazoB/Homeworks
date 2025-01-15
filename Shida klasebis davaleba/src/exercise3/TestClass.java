package exercise3;

public class TestClass {
    public static void main(String[] args) {
        Computer computer = new Computer("სამხრეთ კორეა", "Samsung", 2500.0, true);
        Computer.Monitor monitor = computer.new Monitor(27.0, "1920x1080", 144);
        Computer.Motherboard motherboard = computer.new Motherboard(4, "DDR4", 3200);

        computer.prinInfo();
        monitor.printInfo();
        motherboard.printInfo();
    }
}
