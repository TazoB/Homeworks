public class Toy {
    private String type;
    private double difficultyLevel;

    public Toy() {
        type = null;
        difficultyLevel = 0.0;
    }

    public Toy(String type, double difficultyLevel) {
        this.type = type;
        this.difficultyLevel = difficultyLevel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(double difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "type='" + type + '\'' +
                ", difficultyLevel=" + difficultyLevel +
                '}';
    }
}
