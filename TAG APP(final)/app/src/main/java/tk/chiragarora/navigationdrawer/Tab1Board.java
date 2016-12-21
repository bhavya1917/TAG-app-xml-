
package tk.chiragarora.navigationdrawer;
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

import static tk.chiragarora.navigationdrawer.R.id.listView1;

public class Tab1Board extends Fragment {

    ListView list;
    String[] title1;
    String[] descriptions1;
    int[] images1 = {R.drawable.indraneel, R.drawable.ankit, R.drawable.hemant, R.drawable.saurabh, R.drawable.milendu, R.drawable.srijan, R.drawable.anubhav, R.drawable.rutuja,  R.drawable.priyam, R.drawable.shweta, R.drawable.rajit};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootview = inflater.inflate(R.layout.tab1board, container, false);


        title1 = getActivity().getResources().getStringArray(R.array.titles1);

        descriptions1 = getActivity().getResources().getStringArray(R.array.descriptions1);


        list = (ListView) rootview.findViewById(listView1);



        BAdapter adapter = new BAdapter(getActivity(), title1, images1, descriptions1);
        list.setAdapter(adapter);
        return list;
    }
}

class BAdapter extends ArrayAdapter<String> {
    private Context context;
    private int[] images1;
    private String[] titleArray1;
    private String[] descriptionArray1;

    BAdapter(Context c, String[] titles1, int imgs1[], String[] desc1)

    {
        super(c, R.layout.single_row, R.id.textView, titles1);
        this.context = c;
        this.images1 = imgs1;
        this.titleArray1 = titles1;
        this.descriptionArray1 = desc1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.single_row, parent, false);
            ImageView myImage = (ImageView) row.findViewById(R.id.imageView);
            TextView myTitle = (TextView) row.findViewById(R.id.textView);
            TextView myDescription = (TextView) row.findViewById(R.id.textView2);

            myImage.setImageResource(images1[position]);
            myTitle.setText(titleArray1[position]);
            myDescription.setText(descriptionArray1[position]);

        return row;
    }
}


