import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 23;
        int month = 6;
        int year = 1967;

        System.out.println(collectBirthdays(year, month, day));

    }
    public static String collectBirthdays(int year, int month, int day) {

        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.from(LocalDate.now());
        LocalDate time2 = LocalDate.from(today.minusYears(1));

        int age = 0;
        LocalDate time1 = birthday;

        while (time2.isAfter(time1)) {
            time1 = LocalDate.from(birthday.plusYears(age));
            DateTimeFormatter formatter1 =
                    DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);
            System.out.println(age + " - " + formatter1.format(time1));
            age = age + 1;
        }
        return "";
    }
}
