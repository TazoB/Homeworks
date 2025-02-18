import java.io.*;

public class Main {
    public static void main(String[] args) {
//        String fileName = "src/Vefxistyaosani.txt";
//        // 1.
//        try {
//            BufferedWriter bw = new BufferedWriter(
//                    new FileWriter(fileName)
//            );
//            bw.write(
//                    """
//                            შიგან ასრე გავერივე, გნოლის ჯოგსა ვითა ქორი,
//                            კაცი კაცსა შემოვსტყორცი, ცხენ-კაცისა დავდგი გორი;
//                            კაცი, ჩემგან განატყორცი ბრუნავს ვითა ტანაჯორი,
//                            ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი."""
//            );
//            bw.close();
//        } catch (IOException ioe) {
//            System.out.println(ioe.getMessage());
//        }
//
//
//        // 2.
//        try {
//            BufferedReader br = new BufferedReader(
//                    new FileReader(fileName)
//            );
//            int wordCount = 0;
//            String line;
//
//            while ((line = br.readLine()) != null) {
//                String[] words = line.trim().split("\\s+");
//                wordCount += words.length;
//            }
//
//            System.out.println(wordCount);
//        } catch (IOException ioe) {
//            ioe.getMessage();
//        }
//
//
//        // 3.
//        try{
//            BufferedReader br = new BufferedReader(
//                    new FileReader(fileName)
//            );
//            List <String> words = new ArrayList<>();
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] str = line.trim().split("\\s+");
//                words.addAll(Arrays.asList(str));
//            }
//
//            Scanner scanner = new Scanner(System.in);
//            String word = scanner.next();
//            System.out.println(words.contains(word));
//
//        } catch (IOException ioe) {
//            System.out.println(ioe.getMessage());
//        }

        // 4. a)
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("src/text.txt")
            );
            bw.write(
                    """
                            Assure polite his real and other figures though. Day age advantages
                            and sufficient eating expression traveling. Of on am father by agreed
                            supply rather either. Own handsome delicate property mistresses her
                            end appetite. Mean are sons too sold nor said. Son share three men
                            power by you. Now merits wonder effect garret own.
                            """
            );
            bw.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        // 4. b)
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("src/capitalText.txt")
            );

            BufferedReader br = new BufferedReader(
                    new FileReader("src/text")
            );

            String line;
            while((line = br.readLine()) != null) {
                String[] str = line.trim().split("\\s+");
                for (String s : str) {
                    bw.write(s.toUpperCase() + " ");
                }
                bw.newLine();
            }

            bw.close();
            br.close();
        } catch (IOException ioe) {
            ioe.getMessage();
        }

        // 5.
        try {
            BufferedReader br1 = new BufferedReader(
                    new FileReader("src/Vefxistyaosani.txt")
            );

            BufferedReader br2 = new BufferedReader(
                    new FileReader("src/text.txt")
            );

            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("src/BothText.txt")
            );

            bw.write("First file:");
            bw.newLine();

            while(br1.ready()) {
                bw.write(br1.readLine());
                bw.newLine();
            }

            bw.newLine();
            bw.newLine();
            bw.write("Second File:");
            bw.newLine();

            while(br2.ready()) {
                bw.write(br2.readLine());
                bw.newLine();
            }

            bw.close();
            br1.close();
            br2.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}