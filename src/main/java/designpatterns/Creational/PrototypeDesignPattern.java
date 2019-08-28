package designpatterns.Creational;

import java.util.HashMap;
import java.util.Map;

public class PrototypeDesignPattern {

    public static void main(String[] args) {
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("red").addColor();
        ColorStore.getColor("red").addColor();
        ColorStore.getColor("blue").addColor();

    }
}

abstract class Color implements Cloneable {
    String colorName;

    abstract void addColor();

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class BlueColor extends Color {

    public BlueColor() {
        this.colorName = "Blue color";
    }

    @Override
    void addColor() {
        System.out.println("Blue Color Added!!!");

    }
}

class RedColor extends Color {

    public RedColor() {
        this.colorName = "Red Color";
    }

    @Override
    void addColor() {
        System.out.println("Red Color Added!!!");
    }
}


class ColorStore {
    private static Map<String, Color> colorMap = new HashMap<>();

    static {
        colorMap.put("blue", new BlueColor());
        colorMap.put("red", new RedColor());
    }

    public static Color getColor(String colorName) {
        return colorMap.get(colorName);
    }
}