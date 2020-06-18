package introductionToJava.baitaptuluyen.thuvienngayvagiotrongjava;

import java.util.Calendar;
import java.util.Date;

public class NgayVaGio {
    public static void main(String[] args) {
        Date now=new Date();
        System.out.println(now);
        Date now1=new Date();
        if(now.equals(now1)){
            System.out.println("bang nhau");
        }if(now.before(now1)){
            System.out.println("truoc");
        }if(now.after(now1)){
            System.out.println("sau");
        }
        long d1=now.getTime();
        System.out.println(d1);
        System.out.println("hello java ");
        System.out.println("hello java ");
        System.out.println("hello java ");
        System.out.println("hello java ");
        long d2=now1.getTime();
        System.out.println(d2);
        long d3=(long) (d2-d1);
        System.out.println(d3);
        Calendar calendar=Calendar.getInstance();// biến calendar có kiểu tham chiếu Calendar gọi phương thúc getinstance

        calendar.add(calendar.HOUR,-1);
        System.out.println(calendar.getTime());
        // CÓ 2 CÁCH LẤY TIME DATE VÀ CALENDAR
    }
}
