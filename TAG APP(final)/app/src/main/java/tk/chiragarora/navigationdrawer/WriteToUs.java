package tk.chiragarora.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class WriteToUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_to_us);
    }
    public void toastMsg(String msg){
        Toast toast = Toast.makeText(this,msg,Toast.LENGTH_LONG);
        toast.show();


    }
    public void displayToast (View view){
        toastMsg("Thank You!");

    }

}
