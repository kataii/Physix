package com.khatthaphone.code.physix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String pageName[] = getResources().getStringArray(R.array.pageName);

        int[] imageName = {
                R.drawable.arrows,
                R.drawable.arrows,
                R.drawable.arrows,
                R.drawable.arrows,
                R.drawable.arrows,
                R.drawable.arrows
        };

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), pageName, imageName);

        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pageName );*/

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), pageName[position], Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:

                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    default:

                        break;
                }
            }
        });
    }
}
