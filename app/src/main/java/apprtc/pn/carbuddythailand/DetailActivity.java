package apprtc.pn.carbuddythailand;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    public String TAG = "Carbuddy";
    private String selectString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Receive Value From Intent
        selectString = getIntent().getStringExtra("Select");
        Log.d(TAG, "Select = " + selectString);

        //ListView Controller
        listViewController();

    }   // Main Method

    private void listViewController() {

        //Get Data From Database
        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.DATABASE_NAME,
                MODE_PRIVATE, null);

        Cursor objCursor = objSqLiteDatabase.rawQuery("SELECT * FROM phoneTABLE WHERE Category = " + "'" + selectString + "'" , null);

        objCursor.moveToFirst();
        String[] nameStrings = new String[objCursor.getCount()];
        String[] phoneStrings = new String[objCursor.getCount()];

        for (int i=0;i<objCursor.getCount();i++) {

            nameStrings[i] = objCursor.getString(objCursor.getColumnIndex(ManageTABLE.COLUMN_NAME));
            phoneStrings[i] = objCursor.getString(objCursor.getColumnIndex(ManageTABLE.COLUMN_PHONE));
            objCursor.moveToNext();

        }   // for
        objCursor.close();

        //Create ListView
        MyAdapter objMyAdapter = new MyAdapter(DetailActivity.this, nameStrings, phoneStrings);
        ListView nameListView = (ListView) findViewById(R.id.listView);
        nameListView.setAdapter(objMyAdapter);

    }   // listViewContorller

} // Main Class
