package apprtc.pn.carbuddythailand;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ManageTABLE objManageTABLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setup Constructor
        objManageTABLE = new ManageTABLE(this);

        //Test Add Value
        //objManageTABLE.addNewValue("testCat", "testName", "testPhone");

        //Delete All Data
        deleteAllData();

    }   // Main Method

    private void deleteAllData() {
        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.DATABASE_NAME, MODE_PRIVATE, null);
        objSqLiteDatabase.delete(ManageTABLE.TABLE_PHONE, null, null);
    }

}   // Main Class
