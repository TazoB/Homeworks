import java.util.List;

public class Child {
    private String name;
    private double behaviourScore;
    private List <String> wishList;

    public Child() {
        name = null;
        behaviourScore = 0.0;
        wishList = null;
    }

    public Child(String name, double behaviourScore, List<String> wishList) {
        this.name = name;
        this.behaviourScore = behaviourScore;
        this.wishList = wishList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBehaviourScore() {
        return behaviourScore;
    }

    public void setBehaviourScore(double behaviourScore) {
        this.behaviourScore = behaviourScore;
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void setWishList(List<String> wishList) {
        this.wishList = wishList;
    }

    public void addWish(String wish) {
        if(!wishList.contains(wish)) {
            wishList.add(wish);
        }
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", behaviourScore=" + behaviourScore +
                ", wishList=" + wishList +
                '}';
    }
}