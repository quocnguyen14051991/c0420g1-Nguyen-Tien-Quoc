package introductionToJava.baitaptuluyentonghop.quanlyvattu;

import java.util.LinkedList;

public class DanhSachHoaDon<E> {

    LinkedList<E> linkedList;

    public DanhSachHoaDon() {
    }

    public DanhSachHoaDon(LinkedList<E> linkedList) {
        this.linkedList = linkedList;
    }
}
