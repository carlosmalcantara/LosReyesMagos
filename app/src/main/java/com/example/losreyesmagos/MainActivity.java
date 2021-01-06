package com.example.losreyesmagos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.villancico);
        mediaPlayer.start();

        Typeface miFuente = Typeface.createFromAsset(getAssets(), "Viejo Oeste.ttf");
        TextView subtitulo = (TextView) findViewById(R.id.subtitulo);
        subtitulo.setTypeface(miFuente);

        Animation slideUp = AnimationUtils.loadAnimation(this,R.anim.slideup);
        Animation giroscopo = AnimationUtils.loadAnimation(this,R.anim.giroscopo);
        Animation fadeIn = AnimationUtils.loadAnimation(this,R.anim.fadein);
        TextView titulo = (TextView) findViewById(R.id.titulo);

        ImageView imagen = (ImageView) findViewById(R.id.cielito);

        imagen.startAnimation(fadeIn);
        titulo.startAnimation(giroscopo);
        subtitulo.startAnimation(slideUp);

    }
}