package tk.chiragarora.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.support.v7.app.ActionBar;
public class PitchAProject extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pitch_aproject);
    }

    public void toastMsg(String msg){
        Toast toast = Toast.makeText(this,msg,Toast.LENGTH_LONG);
        toast.show();


    }
    public void displayToast (View view){
        toastMsg("Thank You!");

    }
}
