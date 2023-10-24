package Practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[]args ){
        //take current date
        LocalDate myDate=LocalDate.now();
        System.out.println(myDate);

        //take current time
        LocalTime myTime=LocalTime.now();
        System.out.println(myTime);

        //take current date and time
        LocalDateTime myDateTime=LocalDateTime.now();
        System.out.println(myDateTime);

        //format date
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateTime.format(format);
        System.out.println("After formatting: " + formattedDate);

    }
}
