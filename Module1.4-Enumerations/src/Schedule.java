public class Schedule {
    DaysOfTheWeek day;

    Schedule(DaysOfTheWeek day){
        this.day = day;
    }

    public boolean isWeekend(){
        boolean isWeekend = false;
        switch(day){
            case MONDAY:
                System.out.println("Not weekend");
                break;
            case SATURDAY:
                isWeekend = true;
                break;
            case SUNDAY:
                isWeekend = true;
                break;
        }
        return isWeekend;
    }

}
