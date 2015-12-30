package apprtc.pn.carbuddythailand;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by masterUNG on 12/30/15 AD.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private String[] nameStrings, phoneStrings;

    public MyAdapter(Context objContext, String[] nameStrings, String[] phoneStrings) {
        this.objContext = objContext;
        this.nameStrings = nameStrings;
        this.phoneStrings = phoneStrings;
    }   // Constructor

    @Override
    public int getCount() {
        return nameStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.phone_listview, viewGroup, false);

        TextView nameTextView = (TextView) objView1.findViewById(R.id.textView);
        nameTextView.setText(nameStrings[i]);

        TextView phoneTextView = (TextView) objView1.findViewById(R.id.textView2);
        phoneTextView.setText(phoneStrings[i]);

        return objView1;
    }
}   // Main Class
