package savarjisho2;

import java.util.Comparator;

public class CompareWithDate implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        // date1 = [0, 4, ., 0, 4, ., 2, 0, 0, 9]
        // date2 = [2, 6, ., 0, 3, ., 2, 0, 0, 9]

        // day1 =



        char[] date1 = o1.getDate().toCharArray();
        String day1 = "" + date1[0] + date1[1];
        String month1 = "" + date1[3] + date1[4];
        String year1 = "" + date1[6] + date1[7] + date1[8] + date1[9];

        char[] date2 = o2.getDate().toCharArray();
        String day2 = "" + date2[0] + date2[1];
        String month2 = "" + date2[3] + date2[4];
        String year2 = "" + date2[6] + date2[7] + date2[8] + date2[9];

        if(year1.compareTo(year2) == 0) {
            if(month1.compareTo(month2) == 0) {
                if(day1.compareTo(day2) == 0) {
                    return 0;
                }
                return day1.compareTo(day2);
            }
            return month1.compareTo(month2);
        }
        return year1.compareTo(year2);
    }
}
