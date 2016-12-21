package tk.chiragarora.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.text.Html.TagHandler;
import android.widget.Toolbar;

import tk.chiragarora.navigationdrawer.R;

import static java.security.AccessController.getContext;
import static tk.chiragarora.navigationdrawer.R.id.textView5;

public class AboutUs extends AppCompatActivity {

        public void Click(View v){
            startActivity(new Intent(AboutUs.this,BoardAndDevelopers.class));
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);


    }
}


