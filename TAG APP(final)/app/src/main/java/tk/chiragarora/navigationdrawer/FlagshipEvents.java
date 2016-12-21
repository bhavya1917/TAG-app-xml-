package tk.chiragarora.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FlagshipEvents extends AppCompatActivity {

    public void Click(View v){
        startActivity(new Intent(FlagshipEvents.this,GameAThon.class));
    }
    public void Click1(View v){startActivity(new Intent(FlagshipEvents.this,VITGamersLeague.class)); }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flagship_events);
    }


}
