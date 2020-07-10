package models;

import java.util.ArrayList;
import java.util.List;

public class VillaManager {
    List<Villa> listVilla ;
    Villa villa;

    public VillaManager() {
    }

    public List<Villa> getListVilla() {
        return listVilla;
    }

    public void setListVilla(List<Villa> listVilla) {
        this.listVilla = listVilla;
    }

    public Villa getVilla() {
        return villa;
    }

    public void setVilla(Villa villa) {
        this.villa = villa;
    }

    public VillaManager(List<Villa> listVilla, Villa villa) {
        this.listVilla = listVilla;
        this.villa = villa;
    }

    public VillaManager(Villa villa) {
        this.villa = villa;
    }
    public boolean addVilla(Villa villa){
        if(villa!=null){
            return this.listVilla.add(villa);
        }
        return false;
    }
}
