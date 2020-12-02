package com.example.alpha.helper;

import android.graphics.Typeface;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    //fonts
    Typeface fonts, fontsItalic, fontsBold;

    public void initFont() {

        fonts = Typeface.createFromAsset(this.getAssets(), "fonts/rubik/Rubik-Light.ttf");
        fontsItalic = Typeface.createFromAsset(this.getAssets(), "fonts/rubik/Rubik-LightItalic.ttf");
        fontsBold = Typeface.createFromAsset(this.getAssets(), "fonts/rubik/Rubik-Bold.ttf");

    }


    public void applyFontRegularToTextView(TextView textView) {
        initFont();
        textView.setTypeface(fonts);
    }
}
