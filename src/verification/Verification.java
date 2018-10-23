package verification;

import java.time.DateTimeException;
import java.util.Date;

public class Verification {

    private final static Date DATE0 = new Date(1900);
    private final static Date DATE1 = new Date(1971);;
    private final static Date DATE2 = new Date(1981);;
    private final static Date DATE3 = new Date(1991);;
    private final static Date DATE4 = new Date(2001);;
    private final static Date DATE5 = new Date();
    
    public static String showMessageFromAge(int year) {
        String message;
        Date date;
        try {
           
            date = new Date(year);

            boolean estPositif = year > 0;
            boolean estValide = testDate(date);

            if (estValide && estPositif) {
                message = getMessage(date);
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

    private static String getMessage(Date date) {
        String message;
        if (date.before(DATE1)) {
            message = "Il est temps d'aller se promener à travers le monde";
        } else if (date.before(DATE2)) {
            message = "Il est temps de commancer à travailler surieusement";
        } else if (date.before(DATE3)) {
            message = "Il est grand temps de terminer tes études";
        } else if (date.before(DATE4)) {
            message = "Fais ce qui te plait, tu as encore le temps!";
        } else {
            message = "Utilisation de ce service non-autorisée !!!";
        }
        return message;
    }

    private static boolean testDate(Date date) {
        return date.after(DATE0) && date.before(DATE5);
    }
    
    public void getInfosClient(){
        System.getenv();
    }
}
