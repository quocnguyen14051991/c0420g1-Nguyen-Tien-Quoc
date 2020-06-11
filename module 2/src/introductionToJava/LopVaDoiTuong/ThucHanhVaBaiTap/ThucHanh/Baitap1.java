package introductionToJava.LopVaDoiTuong.ThucHanhVaBaiTap.ThucHanh;

import java.util.ArrayList;
import java.util.List;

public class Baitap1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 10; i < 200; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                list.add(i);
            }

        }
        show(list);
    }

    private static void show(List<Integer> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size - 1; i++) {
                System.out.print(list.get(i) + ",");
            }
            System.out.print(list.get(size - 1));
        }
    }
}

