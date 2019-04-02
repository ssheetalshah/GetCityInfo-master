package dev.raghav.getcityinfo.Model_Class;

/**
 * Created by yarolegovich on 07.03.2017.
 */

public class Item {


    private final int id;
    private final String name;
    private final String price;


    public Item(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

//    public Drawable getImage() {
//        return image;
//    }
}
