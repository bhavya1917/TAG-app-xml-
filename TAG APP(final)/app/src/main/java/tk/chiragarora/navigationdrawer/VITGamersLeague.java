package tk.chiragarora.navigationdrawer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.text.Html;

public class VITGamersLeague extends AppCompatActivity {
    Button clk;
    VideoView videov;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitgamers_league);
        clk = (Button) findViewById(R.id.button);
        videov = (VideoView) findViewById(R.id.videoView2);
        mediaC = new MediaController(this);

    }

    public void videoplay(View v)
    {
        String videopath = "http://r15---sn-oguesn76.googlevideo.com/videoplayback?ip=106.186.29.207&key=yt6&mime=video%2Fmp4&mv=m&sparams=dur%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cnh%2Cpl%2Cratebypass%2Csource%2Cupn%2Cexpire&mt=1482343351&nh=IgpwcjA1Lm5ydDEwKgkxMjcuMC4wLjE&pl=23&id=o-ALao2V-FXHZQRRc3jllBpHo-BTLkPSiHlJ8nSaQ_01fD&initcwndbps=1395000&mn=sn-oguesn76&mm=31&itag=18&lmt=1481095555548566&source=youtube&upn=TrT73nso9To&dur=127.222&ipbits=0&ms=au&expire=1482365105&signature=352A18C78C0224A92C765CD6F1189D782A14D56A.6DDAF28BC4F081DBF14787DEA655F4896122FC76&ratebypass=yes&title=VGL%2717+Official+Launch+Trailer";
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();
    }
}
