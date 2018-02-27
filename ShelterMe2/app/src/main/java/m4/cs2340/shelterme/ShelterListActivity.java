package m4.cs2340.shelterme;

import android.app.Activity;
import android.app.LoaderManager.LoaderCallbacks;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;



/**
 * Created by Ally Liu on 2/26/2018.
 */

public class ShelterListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelterlist);

        //String[] shelters = {"Shelter 1", "Shelter 2", "Shelter 3", "Shelter 5", "Shelter 6", "Shelter 7"};
        //ListAdapter shelterListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, shelters);
        //ListView shelterListView = (ListView) findViewById(R.id.shelterList);
        //shelterListView.setAdapter(shelterListAdapter);
    }
}
