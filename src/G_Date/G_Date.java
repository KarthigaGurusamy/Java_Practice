package G_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class G_Date {
    public static void main(String[] args) {
        Date date = new Date();
        String pattern ="dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        System.out.println(dateFormat.format(date));
    }
}
