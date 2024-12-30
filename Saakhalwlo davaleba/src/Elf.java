import jdk.jshell.SourceCodeAnalysis;

public class Elf extends WorkShopMember implements ChristmasCelebrator{
    private double skillLevel;
    private String elfType;

    public Elf() {
        super();
        skillLevel = 0.0;
        elfType = null;
    }

    public Elf(int age, String nickName, String name, String elfType, double skillLevel) {
        super(age, nickName, name);
        this.elfType = elfType;
        this.skillLevel = skillLevel;
    }

    public double getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(double skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getElfType() {
        return elfType;
    }

    public void setElfType(String elfType) {
        this.elfType = elfType;
    }

    @Override
    public void celebrateChristmas() {
        System.out.println();
        System.out.println("🎄 Merry Christmas! 🎅");
        System.out.println();

        Santa santa = new Santa();

        System.out.println("Decorating the Christmas tree...");
        santa.decorateTree();
        System.out.println();

        System.out.println("Singing Christmas carols...");
        santa.singCarols();
        System.out.println();

        santa.spreadJoy();
    }

    @Override
    public void hostChristmasParty() {
        System.out.println();
        System.out.println("🎉 Hosting a Christmas Party! 🎄");

        Santa santa = new Santa();
        santa.decorateTree();
        System.out.println();
    }

    public void makeToy(String type, double difficultyLevel) {
        System.out.println();
        System.out.println("🎁 " + super.getName() + " is starting the toy-making process! 🎁");

        Toy toy = new Toy(type, difficultyLevel);
        System.out.println("The toy is ready! 🎉 It's perfect for children.");
        System.out.println();

        increaseExperience("Make Toy");
    }

    public void wrapGifts() {
        System.out.println();
        System.out.println("🎁 " + super.getName() + " is cutting the wrapping paper");
        System.out.println("Placing the gift on the paper");
        System.out.println("Folding the paper");
        System.out.println("Finally " + super.getNickName() + " is adding decorative elements 🎁");
        System.out.println();

        increaseExperience("Wrap Gifts");
    }

    private void increaseExperience(String command) {
        if(command.equals("Make Toy")) {
            skillLevel++;
        }
        else if(command.equals("Wrap Gifts")) {
            skillLevel += 0.5;
        }
    }

    @Override
    public String toString() {
        return "Elf{" +
                "skillLevel=" + skillLevel +
                ", elfType='" + elfType + '\'' +
                '}';
    }
}
