public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule(DaysOfTheWeek.MONDAY);
        System.out.println(schedule.day.getName());
    }
}
