public class Exercise1 {
    enum DaysOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        DaysOfWeek today = DaysOfWeek.SUNDAY;
        System.out.println(today);
    }
}
