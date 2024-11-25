public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void printTime(){
        int h = hours, m = minutes, s = seconds;
        while(s >= 60){
            s -= 60;
            m++;
        }
        while(m >= 60){
            m -= 60;
            h++;
        }

        System.out.println(h + " : " + m + " : " + s);
    }
}
