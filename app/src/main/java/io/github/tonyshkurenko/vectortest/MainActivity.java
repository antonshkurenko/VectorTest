package io.github.tonyshkurenko.vectortest;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final ImageView androidImageView = (ImageView) findViewById(R.id.android);
    final Drawable androidDrawable = androidImageView.getDrawable();
    if (androidDrawable instanceof Animatable) {
      ((Animatable) androidDrawable).start();
    }

    final ImageView smilingFaceImageView = (ImageView) findViewById(R.id.smiling_face);
    final Drawable smilingDrawable = smilingFaceImageView.getDrawable();
    if (smilingDrawable instanceof Animatable) {
      ((Animatable) smilingDrawable).start();
    }
  }
}
