package introductionToJava.javacollectionframework.thuchanh.caidatcaytimkiemnhiphan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String > list =new ArrayList<>();
        list.add("Quoc");
        list.add("An");
        list.add("Uong");
        Collections.sort(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
