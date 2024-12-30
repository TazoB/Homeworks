import java.util.ArrayList;
import java.util.List;

public class Santa extends WorkShopMember implements ChristmasSpirit{
    List <Child> childrenList;

    public Santa() {
        super();
        childrenList = null;
    }

    public Santa(int age, String nickName, String name, List<Child> childrenList) {
        super(age, nickName, name);
        this.childrenList = childrenList;
    }

    public List<Child> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<Child> childrenList) {
        this.childrenList = childrenList;
    }

    @Override
    public void spreadJoy() {
        System.out.println();
        System.out.println("✨ Spreading joy and cheer this holiday season! ✨");
        System.out.println();
    }

    @Override
    public void singCarols() {
        System.out.println();
        System.out.println(" ♫ 'Jingle Bells, Jingle Bells...' ♫");
        System.out.println();
    }

    @Override
    public void decorateTree() {
        System.out.println();
        System.out.println("🎄 Hanging ornaments and stringing lights... 🎄");
        System.out.println();
    }

    public void deliverGifts(){
        System.out.println();
        System.out.println("🎅 Santa is ready and reindeer are set to go 🦌");
        System.out.println("🎁 Gifts have been delivered! Merry Christmas! 🎁");
        System.out.println();
    }

    public List<Child>  checkNaughtyOrNiceList() {
        List <Child> niceChildrenList = new ArrayList<>();

        for(Child child : childrenList) {
            if(child.getBehaviourScore() > 5) {
                niceChildrenList.add(child);
            }
        }

        return niceChildrenList;
    }

    @Override
    public String toString() {
        return "Santa{" +
                "childrenList=" + childrenList +
                '}';
    }
}
