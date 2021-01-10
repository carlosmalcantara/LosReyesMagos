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
        mediaPlayer.setLooping(false);
        mediaPlayer.start();

        Typeface miFuente = Typeface.createFromAsset(getAssets(), "Viejo Oeste.ttf");
        TextView subtitulo = (TextView) findViewById(R.id.subtitulo);
        subtitulo.setTypeface(miFuente);

        Animation slideUp = AnimationUtils.loadAnimation(this,R.anim.slideup);
        Animation giroscopo = AnimationUtils.loadAnimation(this,R.anim.giroscopo);
        Animation fadeIn = AnimationUtils.loadAnimation(this,R.anim.fadein);

        Animation fadeIn_2 = AnimationUtils.loadAnimation(this,R.anim.fadein_2);
        Animation fadeIn_3 = AnimationUtils.loadAnimation(this,R.anim.fadein_3);
        Animation fadeIn_4 = AnimationUtils.loadAnimation(this,R.anim.fadein_4);
        Animation fadeIn_5 = AnimationUtils.loadAnimation(this,R.anim.fadein_5);
        Animation fadeIn_6 = AnimationUtils.loadAnimation(this,R.anim.transl_6);
        Animation fadeIn_7 = AnimationUtils.loadAnimation(this,R.anim.fadein_7);
        Animation fadeIn_8 = AnimationUtils.loadAnimation(this,R.anim.fadein_8);


        TextView titulo = (TextView) findViewById(R.id.titulo);

        ImageView cielo = (ImageView) findViewById(R.id.cielito);
        ImageView imageStar = (ImageView) findViewById(R.id.imageStar);

        cielo.startAnimation(fadeIn);
        titulo.startAnimation(giroscopo);
        subtitulo.startAnimation(slideUp);

        imageStar.startAnimation(fadeIn_2);

        ImageView estrellas = (ImageView) findViewById(R.id.estrellas);
        ImageView montes = (ImageView) findViewById(R.id.montes);
        ImageView palmeras = (ImageView) findViewById(R.id.palmeras);
        ImageView castillo = (ImageView) findViewById(R.id.castillo);
        ImageView pesebre = (ImageView) findViewById(R.id.pesebre);
        ImageView reyes = (ImageView) findViewById(R.id.reyes);

        estrellas.startAnimation(fadeIn_3);
        montes.startAnimation(fadeIn_4);
        palmeras.startAnimation(fadeIn_5);
        castillo.startAnimation(fadeIn_6);
        pesebre.startAnimation(fadeIn_7);
        reyes.startAnimation(fadeIn_8);

        TextView titulo2 = (TextView) findViewById(R.id.titulo2);
        Animation fin_9 = AnimationUtils.loadAnimation(this,R.anim.fin_9);
        titulo2.startAnimation(fin_9);





    }
}