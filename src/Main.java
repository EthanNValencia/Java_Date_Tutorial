/*

Little example that demonstrates how date can be shown in Java.
*/

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args){
        System.out.println("----- GregorianCalendar -----"); // Not very good looking.
        Calendar c = new GregorianCalendar();
        c.set(2020, 0, 1);
        System.out.println(c.getTime());                                          // Wed Jan 01 15:18:27 EST 2020
        c.add(Calendar.DATE, 1);
        System.out.println(c.getTime());                                          // Thu Jan 02 15:18:27 EST 2020

        System.out.println("----- LocalDate -----");
        System.out.println("Iterating through LocalDate");
        LocalDate date = LocalDate.of(2021, 1, 29);
        for(int i = 1; i <= 3; i++){
            System.out.println("The next day is: " + date.plusDays(i));             // The next day is: 2021-01-30
                                                                                    // The next day is: 2021-01-31
                                                                                    // The next day is: 2021-02-01
        }

        date = LocalDate.of(2021, 7, 3);
        System.out.println("Printing out LocalDate " + date);                       // Printing out LocalDate 2021-07-03
        date = date.minusDays(365);
        System.out.println("Subtracting 365 days from LocalDate " + date);          // Subtracting 365 days from LocalDate 2020-07-03


        date = LocalDate.now();
        System.out.println("Today is " + date);
        System.out.println("\nLocalDate is probably the easiest to use.");
    }
}
