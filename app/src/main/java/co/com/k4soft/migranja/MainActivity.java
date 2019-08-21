package co.com.k4soft.migranja;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playCerdo(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cerdo);
        mediaPlayer.start();

    }

    public void playGato(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.gato);
        mediaPlayer.start();
    }
}
