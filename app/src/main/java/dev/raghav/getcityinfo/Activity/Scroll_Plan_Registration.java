package dev.raghav.getcityinfo.Activity;

import android.content.ClipData;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import dev.raghav.getcityinfo.Adapter.RegisterPan_Adapter;
import dev.raghav.getcityinfo.Adapter.Shop;
import dev.raghav.getcityinfo.Descrete_Scroll_Library.transform.DSVOrientation;
import dev.raghav.getcityinfo.Descrete_Scroll_Library.transform.DiscreteScrollView;
import dev.raghav.getcityinfo.Descrete_Scroll_Library.transform.InfiniteScrollAdapter;
import dev.raghav.getcityinfo.Descrete_Scroll_Library.transform.ScaleTransformer;
import dev.raghav.getcityinfo.Model_Class.Item;
import dev.raghav.getcityinfo.R;

public class Scroll_Plan_Registration extends AppCompatActivity implements DiscreteScrollView.OnItemChangedListener,
        View.OnClickListener {

     DiscreteScrollView itemPicker;
    TextView currentItemName;
     TextView currentItemPrice;

    private InfiniteScrollAdapter infiniteAdapter;
    private List<Item> data;
    private Shop shop;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descrete_scroll_plan);

        shop = Shop.get();
        data = shop.getData();

        currentItemName = (TextView)findViewById(R.id.item_name);
        currentItemPrice = (TextView)findViewById(R.id.item_price);
        itemPicker=findViewById(R.id.item_picker);

        itemPicker.setOrientation(DSVOrientation.HORIZONTAL);
        itemPicker.addOnItemChangedListener(this);
        infiniteAdapter = InfiniteScrollAdapter.wrap(new RegisterPan_Adapter(data));
        itemPicker.setAdapter(infiniteAdapter);
        //itemPicker.setItemTransitionTimeMillis(DiscreteScrollViewOptions.getTransitionTime());
        itemPicker.setItemTransformer(new ScaleTransformer.Builder()
                .setMinScale(0.8f)
                .build());

        onItemChanged(data.get(0));


    }

        private void onItemChanged(Item item) {
//            currentItemName.setText(item.getName());
//            currentItemPrice.setText(item.getPrice());


    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onCurrentItemChanged(@Nullable RecyclerView.ViewHolder viewHolder, int adapterPosition) {

    }
}
