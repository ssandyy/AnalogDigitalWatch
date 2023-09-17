import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Date;
import java.util.Calendar;

public class AnalogDigitalWatch extends JPanel implements Runnable {
    Thread thread;
    int i,j,k,p=0,q=0;
    String year,month,day,second,minute,hour;
    SimpleDateFormat sdf = new SimpleDateFormat("s", Locale.getDefault());
    Date cd;
    int xOrigin = 375, yOrigin=375,xsec,ysec,xmin,ymin,xhr,yhr;
    private void clockLayout(Graphics g){
    Calendar calender = new GregorianCalendar();
    year = String.valueOf(calender.get(Calendar.YEAR));
    month = String.valueOf(calender.get(Calendar.MONTH)+1);
    day = String.valueOf(calender.get(Calendar.DATE));
    second = String.valueOf(calender.get(Calendar.SECOND));
    minute = String.valueOf(calender.get(Calendar.MINUTE));
    hour = String.valueOf(calender.get(Calendar.HOUR));
    }
}
