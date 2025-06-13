import java.util.Arrays;
import java.util.List;

public class DateChecker {

    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public boolean has31Days(Month month) {

        List<Month> monthsWith31Days = List.of(Month.JANUARY, Month.MARCH, Month.MAY,
                Month.JULY, Month.AUGUST, Month.OCTOBER, Month.DECEMBER );

        // List<Month> monthsWithNot31Days = List.of(Month.FEBRUARY, Month.APRIL, Month.JUNE,
        //         Month.SEPTEMBER, Month.NOVEMBER );

        return monthsWith31Days.contains(month);
    }

    


}
