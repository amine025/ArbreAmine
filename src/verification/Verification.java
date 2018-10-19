package verification;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

public class Verification {

    private final static LocalDate DATE0 = LocalDate.of(1900, Month.JANUARY, 1);
    private final static LocalDate DATE1 = LocalDate.of(1971, Month.JANUARY, 1);
    private final static LocalDate DATE2 = LocalDate.of(1981, Month.JANUARY, 1);
    private final static LocalDate DATE3 = LocalDate.of(1991, Month.JANUARY, 1);
    private final static LocalDate DATE4 = LocalDate.of(2001, Month.JANUARY, 1);
    private final static LocalDate DATE5 = LocalDate.of(LocalDate.now().getYear() - 18, Month.JANUARY, 1);
    private static String[] Arrayinfos;

    public static void splitInfos(String param) {
        Arrayinfos = param.split(";");
    }

    public static String showMessageFromAge(String infos) {
       
        splitInfos(infos);
        String message;
        LocalDate localDate;
        try {
            int myYear = Integer.parseInt(Arrayinfos[0]);
            int myMonth = Integer.parseInt(Arrayinfos[1]);
            int myDay = Integer.parseInt(Arrayinfos[2]);
            boolean estPositif = myYear > 0 && myMonth > 0 && myDay > 0;

            localDate = LocalDate.of(myYear, myMonth, myDay);
            boolean estValide = testDate(localDate);

            if (estValide && estPositif) {
                message = getMessage(localDate);
            } else {
                message = "date invalide ou pas couverte par le service";
            }
        } catch (NumberFormatException e) {
            message = "erreur 1";
        } catch (DateTimeException e) {
            message = "erreur 2";
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

    private static boolean testDate(LocalDate date) {
        LocalDate l = LocalDate.of(1900, Month.JANUARY, 1);
        return date.isAfter(DATE0) && date.isBefore(DATE5);
    }
}
