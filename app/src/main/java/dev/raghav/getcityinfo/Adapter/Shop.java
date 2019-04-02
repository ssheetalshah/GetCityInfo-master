package dev.raghav.getcityinfo.Adapter;
import java.util.Arrays;
import java.util.List;

import dev.raghav.getcityinfo.Model_Class.Item;


public class Shop {

    private static final String STORAGE = "shop";

    public static Shop get() {
        return new Shop();
    }

//    private SharedPreferences storage;
//
//    private Shop() {
//        storage = App.getInstance().getSharedPreferences(STORAGE, Context.MODE_PRIVATE);
//    }

    public List<Item> getData() {
        return Arrays.asList(
                new Item(1, "Everyday Candle", "$122.00 USD"),
                new Item(2, "hello bhai", "$30.00 USD"),
                new Item( 3, "ics", "$50.00 USD"));

    }

}
