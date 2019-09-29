package Question5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args){

        LocalDate TJT = LocalDate.parse("1987-04-09");
        LocalDate RAH = LocalDate.parse("1998-10-10");

        System.out.println("Amount of time between 'The Joshua Tree' and 'Rattle and Rum': \n"
        + ChronoUnit.DAYS.between(TJT, RAH));
        LocalDate newRelease = RAH.plusDays(ChronoUnit.DAYS.between(TJT, RAH));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM YYYY");
        System.out.println("Their new album will probably release at " + formatter.format(newRelease));

    }
}
