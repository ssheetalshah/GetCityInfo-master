package dev.raghav.getcityinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class SearchDetails extends AppCompatActivity {
    CardView cardClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_details);

        cardClick = (CardView)findViewById(R.id.cardClick);

        cardClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchDetails.this,SviewActivity.class);
                startActivity(intent);
            }
        });
    }
}
