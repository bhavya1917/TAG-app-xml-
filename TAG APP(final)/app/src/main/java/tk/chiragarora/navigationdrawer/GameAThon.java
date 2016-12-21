package tk.chiragarora.navigationdrawer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.text.Html;

public class GameAThon extends AppCompatActivity {
    Button clk;
    VideoView videov;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_athon);
        clk = (Button) findViewById(R.id.button);
        videov = (VideoView) findViewById(R.id.videoView2);
        mediaC = new MediaController(this);

    }

    public void videoplay(View v)
    {
        String videopath = "http://r7---sn-4g57knk7.googlevideo.com/videoplayback?initcwndbps=552500&nh=IgpwcjAyLmZyYTE1KgkxMjcuMC4wLjE&expire=1482365210&mime=video%2Fmp4&ratebypass=yes&ipbits=0&pcm2=no&itag=18&upn=uGWRT_qNR30&mm=31&mt=1482343351&mv=m&id=o-AAIv-bOwgYzcXyfcxCB2WwAxsJGULH_e2Zee8yGRHm-f&ms=au&source=youtube&pl=23&dur=133.932&key=yt6&ip=179.61.131.48&sparams=dur%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cnh%2Cpcm2%2Cpl%2Cratebypass%2Csource%2Cupn%2Cexpire&mn=sn-4g57knk7&lmt=1473088650217734&signature=3A9C74C43B3C34C1523D95A0411AB70BB09A3B41.549BEFBF2117A3736A7BEFED193AF5A826E52DBD&title=Game-A-Thon+2K16";
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();
    }
}
