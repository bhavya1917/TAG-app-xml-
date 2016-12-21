package tk.chiragarora.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class EventsAndWorkshops extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Contact> list=new ArrayList<Contact>();
    int[] image_id={
            R.drawable.photoshop,
            R.drawable.pcbuilder,
            R.drawable.wordpress,
            R.drawable.model

    };
    String[] name,email,mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_and_workshops);

        name=getResources().getStringArray(R.array.person_name);
        email=getResources().getStringArray(R.array.person_email);
        mobile=getResources().getStringArray(R.array.person_mobile);
        int count=0;
        for (String Name:name){
            Contact contact=new Contact(image_id[count],Name,email[count],mobile[count]);
            count++;
            list.add(contact);
        }
        recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter=new ContactAdapter(list);
        recyclerView.setAdapter(adapter);



    }
}
