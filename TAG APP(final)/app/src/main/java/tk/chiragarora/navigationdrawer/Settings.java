package tk.chiragarora.navigationdrawer;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static tk.chiragarora.navigationdrawer.R.id.listView;

public class Settings extends AppCompatActivity {

    ListView list;
    String[] title;
    String[] descriptions;
    int[] images = {R.drawable.icon1, R.drawable.icon2, R.drawable.icon3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        Resources res = getResources();
        title = res.getStringArray(R.array.titles);
        descriptions = res.getStringArray(R.array.descriptions);

        list = (ListView) findViewById(listView);
        CAdapter adapter = new CAdapter(this, title, images, descriptions);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), Feedback.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(view.getContext(), WriteToUs.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(view.getContext(), EditTheme.class);
                    startActivity(intent);
                }
            }
        });
    }
}

    class CAdapter extends ArrayAdapter<String> {
        Context context;
        int[] images;
        String[] titleArray;
        String[] descriptionArray;

        CAdapter(Context c, String[] titles, int imgs[], String[] desc)

        {
            super(c, R.layout.single_row, R.id.textView, titles);
            this.context = c;
            this.images = imgs;
            this.titleArray = titles;
            this.descriptionArray = desc;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.single_row, parent, false);
            ImageView myImage = (ImageView) row.findViewById(R.id.imageView);
            TextView myTitle = (TextView) row.findViewById(R.id.textView);
            TextView myDescirtion = (TextView) row.findViewById(R.id.textView2);

            myImage.setImageResource(images[position]);
            myTitle.setText(titleArray[position]);
            myDescirtion.setText(descriptionArray[position]);

            return row;
        }
    }
