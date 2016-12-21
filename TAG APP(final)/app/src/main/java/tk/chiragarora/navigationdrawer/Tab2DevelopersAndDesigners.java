
package tk.chiragarora.navigationdrawer;
/**
 * Created by Chirag Arora on 15-12-2016.
 */
/*
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Tab1Board extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1board, container, false);
        return rootView;
    }


}
*/

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import  android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.MenuItem;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.w3c.dom.Text;

import static tk.chiragarora.navigationdrawer.R.id.listView1;

public class Tab2DevelopersAndDesigners extends Fragment {

    ListView list;
    String[] title2;
    String[] descriptions2;
    int[] images2 = {R.drawable.ankit, R.drawable.anubhav, R.drawable.atharva, R.drawable.bhavya, R.drawable.profile, R.drawable.jaimin,
            R.drawable.kunal, R.drawable.lakshay, R.drawable.puneet, R.drawable.riddhi,R.drawable.roshni, R.drawable.saurabhdt, R.drawable.shivam, R.drawable.shubham, R.drawable.shweta, R.drawable.siddharth, R.drawable.srijan};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootview = inflater.inflate(R.layout.tab1board, container, false);


        title2 = getActivity().getResources().getStringArray(R.array.titles2);

        descriptions2 = getActivity().getResources().getStringArray(R.array.descriptions2);


        list = (ListView) rootview.findViewById(listView1);



        AAdapter adapter = new AAdapter(getActivity(), title2, images2, descriptions2);
        list.setAdapter(adapter);
        return list;
    }
}

class AAdapter extends ArrayAdapter<String> {
    Context context;
    int[] images2;
    String[] titleArray2;
    String[] descriptionArray2;

    AAdapter(Context c, String[] titles2, int imgs2[], String[] desc2)

    {
        super(c, R.layout.single_row, R.id.textView, titles2);
        this.context = c;
        this.images2 = imgs2;
        this.titleArray2 = titles2;
        this.descriptionArray2 = desc2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.single_row, parent, false);
        ImageView myImage = (ImageView) row.findViewById(R.id.imageView);
        TextView myTitle = (TextView) row.findViewById(R.id.textView);
        TextView myDescription = (TextView) row.findViewById(R.id.textView2);

        myImage.setImageResource(images2[position]);
        myTitle.setText(titleArray2[position]);
        myDescription.setText(descriptionArray2[position]);

        return row;
    }
}


