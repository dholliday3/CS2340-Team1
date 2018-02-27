package m4.cs2340.shelterme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Button;


/**
 * Created by Ally Liu on 2/27/2018.
 */

public class ShelterInfoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Button backButton = (Button) findViewById(R.id.backToList_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShelterInfoActivity.this, ShelterListActivity.class);
                startActivity(intent);
            }
        });
    }
}
