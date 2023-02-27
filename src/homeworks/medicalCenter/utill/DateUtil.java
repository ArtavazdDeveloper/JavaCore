package homeworks.medicalCenter.utill;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtil {
    public static  final SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
    public static  final SimpleDateFormat SDTF = new SimpleDateFormat("dd-MM-yyyy HH:mm");

    public static String dateToString(Date date){
        return SDF.format(date);
    }
    public static String dateTime(Date date){
        return SDTF.format(date);
    }
    public static Date stringToDateTime(String dateStr) throws ParseException {
        return (Date) SDTF.parse(dateStr);
    }
    public static Date stringToDate(String dateStr) throws ParseException {
        return (Date) SDF.parse(dateStr);
    }
    public static boolean isSameDay(Date date1, Date date2){
         return dateToString(date1).equals(dateToString(date2));
    }
}
