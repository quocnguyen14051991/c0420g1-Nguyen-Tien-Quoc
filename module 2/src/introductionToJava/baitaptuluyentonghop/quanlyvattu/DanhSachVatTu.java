package introductionToJava.baitaptuluyentonghop.quanlyvattu;

import java.util.ArrayList;
import java.util.List;

public class DanhSachVatTu<E> {

    private List<E> list;

    public DanhSachVatTu() {
    }


    public DanhSachVatTu(List<E> list) {
        this.list = list;
    }

    public void addNew(E e) {
        list.add(e);
    }

    public void show() {
        for (E vattu : list) {
            System.out.println(vattu.toString());
        }
    }
}
