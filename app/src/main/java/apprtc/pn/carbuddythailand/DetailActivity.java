package apprtc.pn.carbuddythailand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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

    }   // Main Method

} // Main Class
