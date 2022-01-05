package povtor.important.enums;

import java.util.Arrays;

public class Enum1{

    public static void main(String[] args) {
        Today today = new Today(WeekDay.SATURDAY);
        today.daysInfo();
        System.out.println(today.weekDay);

        WeekDay w1 = WeekDay.FRIDAY;
        WeekDay w2 = WeekDay.FRIDAY;
        WeekDay w3 = WeekDay.MONDAY;
        System.out.println(w1==w2);
        System.out.println(w1==w3);
        System.out.println(WeekDay.FRIDAY.equals(WeekDayTwo.FRIDAY));
        WeekDay w15 = WeekDay.valueOf("MONDAY");
        System.out.println(w15);

        WeekDay[] array = WeekDay.values();
        System.out.println(Arrays.toString(array));
    }
}
enum WeekDay{
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    WeekDay(String mood) {
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }
}

enum WeekDayTwo {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

class Today{
    WeekDay weekDay;

    public Today(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo(){
        switch (weekDay){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Idi na rabotu");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Mojno otdohnut");
                break;
        }
        System.out.println("Nastroenie v etot den: " + weekDay.getMood());
    }
}
