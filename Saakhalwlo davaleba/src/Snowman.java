import java.util.List;

public class Snowman {
    private double height;
    private String hatColor;
    private boolean isMagical;
    List <String> accessories;

    public Snowman() {
        height = 0.0;
        hatColor = null;
        isMagical = false;
        accessories = null;

    }

    public Snowman(double height, String hatColor, boolean isMagical, List<String> accessories) {
        this.height = height;
        this.hatColor = hatColor;
        this.isMagical = isMagical;
        this.accessories = accessories;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHatColor() {
        return hatColor;
    }

    public void setHatColor(String hatColor) {
        this.hatColor = hatColor;
    }

    public boolean isMagical() {
        return isMagical;
    }

    public void setMagical(boolean magical) {
        isMagical = magical;
    }

    public List<String> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<String> accessories) {
        this.accessories = accessories;
    }

    public void decorate(String accessory) {
        if(!accessories.contains(accessory)) {
            accessories.add(accessory);
            System.out.println();
            System.out.println("☃️ " + accessory + " has added to the snowman ☃️");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println("☃️ Snowman is already decorated with this accessory. ☃️");
            System.out.println();
        }
    }

    public void melt() {
        if(height > 1) {
            height /= 2;
        }
        else if(height == 1) {
            height = 0;
        }
    }

    public void makeMagical() {
        System.out.println();
        System.out.println("❄️ Casting a spell to make the snowman magical! ❄️");
        isMagical = true;
        System.out.println("⛄ The snowman is now magical! ✨");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Snowman{" +
                "height=" + height +
                ", hatColor='" + hatColor + '\'' +
                ", isMagical=" + isMagical +
                ", accessories=" + accessories +
                '}';
    }
}
