package models;

import java.util.List;

public class HouseManager {
    List<House> listHouse;
    House house;

    public HouseManager(List<House> listHouse, House house) {
        this.listHouse = listHouse;
        this.house = house;
    }
}
