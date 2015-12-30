package apprtc.pn.carbuddythailand;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterUNG on 12/30/15 AD.
 */
public class ManageTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String TABLE_PHONE = "phoneTABLE";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_CATEGORY = "Category";
    public static final String COLUMN_NAME = "Name";
    public static final String COLUMN_PHONE = "Phone";

    public ManageTABLE(Context context) {

        //Create & Connected Database
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();

    }   // Constructor

    //Add New Value to SQLite
    public long addNewValue(String strCategory, String strName, String strPhone) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_CATEGORY, strCategory);
        objContentValues.put(COLUMN_NAME, strName);
        objContentValues.put(COLUMN_PHONE, strPhone);

        return writeSqLiteDatabase.insert(TABLE_PHONE, null, objContentValues);
    }


}   // Main Class
