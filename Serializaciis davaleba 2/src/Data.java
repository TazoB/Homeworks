import java.io.*;

public class Data {
    public void serialize(PhoneContact[] contacts) {
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("output.txt")
        )) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public PhoneContact[] deserialize() {
        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("output.txt")
        )) {
            return (PhoneContact[]) ois.readObject();
        } catch (IOException |ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return new PhoneContact[0];
    }
}
