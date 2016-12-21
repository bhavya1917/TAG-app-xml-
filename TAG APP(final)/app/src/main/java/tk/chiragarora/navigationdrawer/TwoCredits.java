package tk.chiragarora.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TwoCredits extends AppCompatActivity {

    public void Click1(View v){
        startActivity(new Intent(TwoCredits.this, EventsAndWorkshops.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_credits);
    }
}
