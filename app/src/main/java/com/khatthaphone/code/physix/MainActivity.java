package com.khatthaphone.code.physix;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.khatthaphone.code.physix.MESSAGE";

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

//        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), pageName, imageName);

      ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pageName);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(getBaseContext(), pageName[position], Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(getApplicationContext(), DisplayFormula.class);
                Intent intent = new Intent(getApplicationContext(), DisplayHTML.class);
                String extraMessage = pageName[position];
                intent.putExtra(EXTRA_MESSAGE, extraMessage);
                startActivity(intent);

/*                switch (position) {
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
                }*/
            }
        });
    }

    public File getWebpage(String webpageName) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), webpageName);
        if (!file.mkdirs()) {
//            Log.e(LOG_TAG, "Directory not created");
        }
        return file;
    }

    /* Checks if external storage is available for read and write */
    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    /* Checks if external storage is available to at least read */
    public boolean isExternalStorageReadable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state) ||
                Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
            return true;
        }
        return false;
    }

}
