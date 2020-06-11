package introductionToJava.LopVaDoiTuong.ThucHanhVaBaiTap.ThucHanh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class StringThanhDate {
    public static void main(String[] args) {
//       SimpleDateFormat simpleFormatter=new SimpleDateFormat("dd/MM/yyy");
//       String dateString="07/06/2012";
//       try{
//           Date date=simpleFormatter.parse(dateString);
//           System.out.printf(String.valueOf(date));
//           System.out.println(simpleFormatter.format(date));
//       }catch (ParseException e)
//       {
//           e.printStackTrace();
//       }
//
//
//
//        String name="itquoc";
//
//        String quoc=name.concat("cc");
//        System.out.println(quoc);
        String str1="";
        String str2="itphutran.com";
        System.out.printf(String.valueOf(str1.isEmpty()));
        String arrstr2[]=str2.split("\\.");
        for (String item:arrstr2
             ) {
            System.out.println(item);
            
        }
        int number=arrstr2.length;
        System.out.println(number);
    }

}
