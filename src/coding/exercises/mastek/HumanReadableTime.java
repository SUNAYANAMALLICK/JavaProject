package coding.exercises.mastek;

public class HumanReadableTime {
    public static void main(String[] args) {
        HumanReadableTime.humanReadableTime(359999);

    }
        public static void humanReadableTime(final long secs) {

        long min = secs%60;
        long hr=(secs/60)/60;
        long sec = secs - (min*60) - (hr*60*60);
        System.out.printf(" Input : %s : %sHH%sMM%sSS%n",secs,hr,min,sec);

    }

}
