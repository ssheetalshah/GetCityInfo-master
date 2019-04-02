package dev.raghav.getcityinfo.Adapter;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import dev.raghav.getcityinfo.Model_Class.Item;
import dev.raghav.getcityinfo.R;
import dev.raghav.getcityinfo.RegistrationActivity;

public class RegisterPan_Adapter extends RecyclerView.Adapter<RegisterPan_Adapter.ViewHolder> {

    private List<Item> data;

    public RegisterPan_Adapter(List<Item> data) {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.descrete_scroll_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

       holder.currentItemName.setText(data.get(position).getName());
       holder.currentItemPrice.setText(data.get(position).getPrice());

        if (data.get(position).getId()==1){
            holder.image.setImageResource(R.drawable.mm);
        }
        if (data.get(position).getId()==2){
            holder.image.setImageResource(R.drawable.map);
        }
        if (data.get(position).getId()==3){
            holder.image.setImageResource(R.drawable.circle);
        }


        holder.card_plan.setTag(holder);

//        Glide.with(holder.itemView.getContext())
//                .load(data.get(position).getImage())
//                .into(holder.image);

        holder.card_plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                int i = position;
//                PID =  postStringHashMap.get(i);

                Intent intent = new Intent(view.getContext(), RegistrationActivity.class);
                view.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView currentItemName;
        private TextView currentItemPrice;
        private CardView card_plan;


        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            currentItemName = (TextView)itemView.findViewById(R.id.item_name);
            currentItemPrice = (TextView)itemView.findViewById(R.id.item_price);
            card_plan = (CardView) itemView.findViewById(R.id.card_plan);


        }
    }
}
