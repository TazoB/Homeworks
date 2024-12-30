import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf(15, "Jingle Sparkle", "Tinsel Sparklefoot", "Toy-Maker", 12);
        Elf elf2 = new Elf(20, "Tinsel Twinkle", "Jingle Merrybrook", "Reindeer Care", 9);
        Elf elf3 = new Elf(22, "Peppermint Frost", "Holly Evergreen", "Gift-Wrapping Elves", 20);
        Elf elf4 = new Elf(10, "Mistletoe Dash", "Frosty Nutmeg", "Santa’s Helper Elves", 15);

        elf1.makeToy("Car", 7.9);
        elf2.wrapGifts();
        elf3.makeToy("Dolly", 4.5);
        elf4.wrapGifts();


        Reindeer reindeer1 = new Reindeer(8, "Speedster", "Comet", 70_000, "Black");
        Reindeer reindeer2 = new Reindeer(10, "Flash", "Dasher", 47_000, "Blue");
        Reindeer reindeer3 = new Reindeer(13, "Sassy", "Vixen", 38_000, "Pink");
        Reindeer reindeer4 = new Reindeer(17, "Glow", "Rudolph", 12_000, "Yellow");

        reindeer1.fly();
        System.out.println("Fitness level of " + reindeer2.getName() + ": " + reindeer2.checkFitnessLevel());
        reindeer3.fly();
        System.out.println("Fitness level of " + reindeer4.getName() + ": " + reindeer4.checkFitnessLevel());
        System.out.println();

        List <String> wishList1 = Arrays.asList("Puppy", "Car toy");

        List <String> wishList2 = Arrays.asList("Cat", "Dolly");

        List <String> wishList3 = Arrays.asList("Guitar", "Laptop");

        Child child1 = new Child("Tazo", 7.9, wishList1);
        Child child2 = new Child("Tekla", 4.9, wishList2);
        Child child3 = new Child("Lasha", 8.9, wishList3);

        List <Child> childrenList = Arrays.asList(child1, child2, child3);

        Santa santa = new Santa(67, "The Big Red", "Jolly Claus", childrenList);

        List <Child> niceChildrenList = santa.checkNaughtyOrNiceList();

        System.out.println("Nice Children List:");

        int number = 1;
        for(Child child : niceChildrenList) {
            System.out.println(number + ". " + child.getName());
            number++;
        }

        santa.deliverGifts();

        List <String> accessories = new ArrayList<>();
        accessories.add("Hat");
        accessories.add("Scarf");
        accessories.add("Nose");
        accessories.add("Arms");
        accessories.add("Mouth");
        accessories.add("Buttons");
        accessories.add("Gloves");

        Snowman snowman = new Snowman(3, "Black", true, accessories);

        snowman.decorate("Broomstick");
        snowman.decorate("Christmas Lights");


        System.out.println("Height of snowman is: " + snowman.getHeight());
        snowman.melt();
        System.out.println("Height of snowman is: " + snowman.getHeight());

        snowman.melt();
        System.out.println("Height of snowman is: " + snowman.getHeight());

        snowman.melt();
        System.out.println("Height of snowman is: "+ snowman.getHeight());
    }
}