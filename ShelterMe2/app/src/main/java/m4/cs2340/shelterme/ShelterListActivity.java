package m4.cs2340.shelterme;

import android.app.Activity;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;



/**
 * Created by Ally Liu on 2/26/2018.
 */

public class ShelterListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelterlist);

        //hardcoded shelters
        String[] shelters = {"Shelter 1",
                "Shelter 2",
                "Shelter 3",
                "Shelter 5",
                "Shelter 6",
                "Shelter 7",
                "Shelter 8",
                "Shelter 9"};
        //converts the string array into list object
        ListAdapter shelterListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, shelters);
        ListView shelterListView = (ListView) findViewById(R.id.shelterList);
        shelterListView.setAdapter(shelterListAdapter);

        shelterListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String shelterClicked = String.valueOf(adapterView.getItemAtPosition(i)); //gives the strong value of the shelter clicked (can be used in about)
                        Intent intent = new Intent(ShelterListActivity.this, ShelterInfoActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }

    @Override
    public void onBackPressed() {
        return;
    }
}
