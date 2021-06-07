public enum DaysOfTheWeek {
    SUNDAY("Sunday"), MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday"), SATURDAY("Satuday");

    private final String DAYNAME;

    DaysOfTheWeek(String name){
        this.DAYNAME = name;
    }

    public String getName(){
        return this.DAYNAME;
    }
}
