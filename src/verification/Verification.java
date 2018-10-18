package verification;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class Verification {

    private final static LocalDate DATE0 = LocalDate.of(1900, Month.JANUARY, 1);
    private final static LocalDate DATE1 = LocalDate.of(1971, Month.JANUARY, 1);
    private final static LocalDate DATE2 = LocalDate.of(1981, Month.JANUARY, 1);
    private final static LocalDate DATE3 = LocalDate.of(1991, Month.JANUARY, 1);
    private final static LocalDate DATE4 = LocalDate.of(2001, Month.JANUARY, 1);
    private final static LocalDate DATE5 = LocalDate.of(2011, Month.JANUARY, 1);

    public static String showMessageFromAge(String year, String month, String day) {
        
        String message;
        LocalDate localDate;
        try {
            int myDay = Integer.parseInt(day);
            int myMonth = Integer.parseInt(month);
            int myYear = Integer.parseInt(year);
            
            boolean estValide = testDay(myDay) && testMonth(myMonth) && testYear(myYear);
            localDate = LocalDate.of(myYear, myMonth, myDay);
            Calendar cal = Calendar.getInstance();
            cal.setLenient(false);
            //boolean estValide = localDate.isAfter(DATE0);
            boolean estCouverte = localDate.isBefore(DATE5);
            if (estValide) {
                if (estCouverte) {
                    message = getMessage(localDate);
                } else {
                    message = "pas couverte";
                }
            } else {
                message = "pas valide";
            }
        } catch (NumberFormatException e) {
            message = "erreur";
        }
        return message;
    }

    private static String getMessage(LocalDate date) {
        String message;
        if (date.isBefore(DATE1)) {
            message = "Il est temps d'aller se promener à travers le monde";
        } else if (date.isBefore(DATE2)) {
            message = "Il est temps de commancer à travailler surieusement";
        } else if (date.isBefore(DATE3)) {
            message = "Il est grand temps de terminer tes études";
        } else if (date.isBefore(DATE4)) {
            message = "Fais ce qui te plait, tu as encore le temps!";
        } else {
            message = "Utilisation de ce service non-autorisée !!!";
        }
        return message;
    }

    private static boolean testDay(int day) {
        if (day > 0 && day < 32) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean testMonth(int day) {
        if (day > 0 && day < 13) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean testYear(int year) {
        if (year > 0 && year < LocalDate.now().getYear()) {
            return true;
        } else {
            return false;
        }
    }
}