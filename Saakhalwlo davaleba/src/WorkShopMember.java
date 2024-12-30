public abstract class WorkShopMember {
    private String name;
    private String nickName;
    private int age;

    public WorkShopMember() {
        name = null;
        nickName = null;
        age = 0;
    }

    public WorkShopMember(int age, String nickName, String name) {
        this.age = age;
        this.nickName = nickName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "WorkShopMember{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                '}';
    }
}
