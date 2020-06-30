package com.jhcovid19project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import com.jhcovid19project.Adapter.GridAdapter;

public class HealthCareActivity extends AppCompatActivity {


    private GridView Grid_View;

    String[] web = {
            "CCC",
            "DCH",
            "DCHC"

    };
    int[] imageId = {
            R.drawable.healthcarecenters,
            R.drawable.healthcarecenters,
            R.drawable.healthcarecenters

    };

    private ImageView Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_care);
        Back = findViewById(R.id.toolbar_icon);

        Grid_View = findViewById(R.id.grid_view);
        GridAdapter adapter = new GridAdapter(HealthCareActivity.this, web, imageId);
        Grid_View.setAdapter(adapter);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Grid_View.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(Intent.ACTION_VIEW);
                        intent0.setData(Uri.parse("https://firebasestorage.googleapis.com/v0/b/jh-covid-19project.appspot.com/o/CCC.pdf?alt=media&token=5ac0d9b1-9148-4b8c-82cd-d52c0c02835a"));
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://firebasestorage.googleapis.com/v0/b/jh-covid-19project.appspot.com/o/DCH%20Notification%20for%20COVID-19.pdf?alt=media&token=1ec5d619-e259-4439-85c1-8c2daee7df2f"));
                        startActivity(intent);
                        break;

                    case 2:
                        Intent intent1 = new Intent(Intent.ACTION_VIEW);
                        intent1.setData(Uri.parse("https://firebasestorage.googleapis.com/v0/b/jh-covid-19project.appspot.com/o/DCHC.pdf?alt=media&token=81c73ada-c997-4607-8d69-d23121abf9fa"));
                        startActivity(intent1);
                        break;

                }

            }
        });


    }
}