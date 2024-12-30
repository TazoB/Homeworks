public class Reindeer extends WorkShopMember{
    public double flyingSpeed;
    public String noseColor;

    public Reindeer() {
        super();
        flyingSpeed = 0.0;
        noseColor = null;
    }

    public Reindeer(int age, String nickName, String name, double flyingSpeed, String noseColor) {
        super(age, nickName, name);
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }

    public double getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(double flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    public String getNoseColor() {
        return noseColor;
    }

    public void setNoseColor(String noseColor) {
        this.noseColor = noseColor;
    }

    public void fly() {
        System.out.println();
        System.out.println("🦌 " + super.getName() + " is getting ready to fly!");
        System.out.println(super.getNickName() + " takes off into the sky!");
        System.out.println(super.getName() + " is flying through the clouds and pulling Santa's sleigh!");
        System.out.println(super.getNickName() + " has landed gracefully after the flight! 🦌");
        System.out.println();
    }

    public void trainForChristmas() {
        System.out.println();
        System.out.println("🦌 " + super.getName() + "Practicing high-speed flight");
        System.out.println("Increasing stamina");
        System.out.println("Building muscles");
        System.out.println("Training complete! " + super.getNickName() + " is now ready for Christmas! 🦌");
        System.out.println();
    }

    public String checkFitnessLevel() {
        if(super.getAge() < 10 && flyingSpeed > 60_000) {
            return "A";
        }
        else if(super.getAge() < 12 && flyingSpeed > 45_000) {
            return "B";
        }
        else if(super.getAge() < 14 && flyingSpeed > 30_000) {
            return "C";
        }
        else if(super.getAge() < 16 && flyingSpeed > 20_000) {
            return "D";
        }
        else if(super.getAge() < 18 && flyingSpeed > 10_000) {
            return "E";
        }
        else {
            return "F";
        }
    }

    @Override
    public String toString() {
        return "Reindeer{" +
                "flyingSpeed=" + flyingSpeed +
                ", noseColor='" + noseColor + '\'' +
                '}';
    }
}
