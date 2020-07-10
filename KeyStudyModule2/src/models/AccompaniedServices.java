package models;

import java.util.Objects;

public class AccompaniedServices {
    private String nameAccompanServices;
    private String unitAccompanServices;
    private String priceAccompanServices;

    public AccompaniedServices() {
    }

    public AccompaniedServices(String nameAccompanServices, String unitAccompanServices, String priceAccompanServices) {
        this.nameAccompanServices = nameAccompanServices;
        this.unitAccompanServices = unitAccompanServices;
        this.priceAccompanServices = priceAccompanServices;
    }

    public String getNameAccompanServices() {
        return nameAccompanServices;
    }

    public void setNameAccompanServices(String nameAccompanServices) {
        this.nameAccompanServices = nameAccompanServices;
    }

    public String getUnitAccompanServices() {
        return unitAccompanServices;
    }

    public void setUnitAccompanServices(String unitAccompanServices) {
        this.unitAccompanServices = unitAccompanServices;
    }

    public String getPriceAccompanServices() {
        return priceAccompanServices;
    }

    public void setPriceAccompanServices(String priceAccompanServices) {
        this.priceAccompanServices = priceAccompanServices;
    }

    @Override
    public String toString() {
        return "AccompaniedServices{" +
                "nameAccompanServices='" + nameAccompanServices + '\'' +
                ", unitAccompanServices='" + unitAccompanServices + '\'' +
                ", priceAccompanServices='" + priceAccompanServices + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccompaniedServices)) return false;
        AccompaniedServices that = (AccompaniedServices) o;
        return Objects.equals(getNameAccompanServices(), that.getNameAccompanServices()) &&
                Objects.equals(getUnitAccompanServices(), that.getUnitAccompanServices()) &&
                Objects.equals(getPriceAccompanServices(), that.getPriceAccompanServices());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameAccompanServices(), getUnitAccompanServices(), getPriceAccompanServices());
    }
}
