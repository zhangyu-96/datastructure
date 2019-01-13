package Pickupthebamboo;

import java.util.Objects;

public class Parker {
    private String number; //牌的数字
    private String color;  //牌的花色

    public Parker(String number, String color) {
        this.number = number;
        this.color = color;
    }

    public Parker() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parker parker = (Parker) o;
        return Objects.equals(number, parker.number) &&
                Objects.equals(color, parker.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, color);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color+number+" ";
    }
}
