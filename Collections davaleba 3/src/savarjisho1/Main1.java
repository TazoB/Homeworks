package savarjisho1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Basketball_Player> players = new ArrayList<>(
                List.of(
                        new Basketball_Player("Nikola", "Jokić", 1704, 768, 40, 619, 193),
                        new Basketball_Player("Kevin", "Durant", 1401, 319, 68, 226, 157),
                        new Basketball_Player("Luka", "Dončić", 913, 284, 14, 268, 125),
                        new Basketball_Player("Ja", "Morant", 888, 166, 11, 306, 157),
                        new Basketball_Player("Lamelo", "Ball", 1048, 216, 12, 289, 145)
                )
        );
        Collections.sort(players);

        System.out.println("რეიტინგის ზრდის მიხედვით: ");
        players.forEach(System.out::println);

        System.out.println();
        System.out.println("რეიტინგის კლების მიხედვით: ");
        for(int i = players.size()-1; i>=0; i--) {
            System.out.println(players.get(i));
        }
    }
}
