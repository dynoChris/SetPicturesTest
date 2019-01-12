package com.oliverstudio.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btn100draw, btn300draw, btn600draw, btn900draw, btn1200draw, btn2000draw, btn5000draw;
    Button btn100xhdpi, btn300xhdpi, btn600xhdpi, btn900xhdpi, btn1200xhdpi, btn2000xhdpi, btn5000xhdpi;
    Button btn1200xxhdpi, btn2000xxhdpi, btn5000xxhdpi;
    Button btn900xxxhdpi, btn1200xxxhdpi, btn2000xxxhdpi, btn5000xxxhdpi, btn10000xxxhdpi;
    Button btn100nodpi, btn300nodpi, btn600nodpi, btn900nodpi, btn1200nodpi, btn2000nodpi, btn5000nodpi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image_view);

        btn100draw = findViewById(R.id.btn_100_draw);
        btn300draw = findViewById(R.id.btn_300_draw);
        btn600draw = findViewById(R.id.btn_600_draw);
        btn900draw = findViewById(R.id.btn_900_draw);
        btn1200draw = findViewById(R.id.btn_1200_draw);
        btn2000draw = findViewById(R.id.btn_2000_draw);
        btn5000draw = findViewById(R.id.btn_5000_draw);

        btn100xhdpi = findViewById(R.id.btn_100_xhdpi);
        btn300xhdpi = findViewById(R.id.btn_300_xhdpi);
        btn600xhdpi = findViewById(R.id.btn_600_xhdpi);
        btn900xhdpi = findViewById(R.id.btn_900_xhdpi);
        btn1200xhdpi = findViewById(R.id.btn_1200_xhdpi);
        btn2000xhdpi = findViewById(R.id.btn_2000_xhdpi);
        btn5000xhdpi = findViewById(R.id.btn_5000_xhdpi);

        btn1200xxhdpi = findViewById(R.id.btn_1200_xxhdpi);
        btn2000xxhdpi = findViewById(R.id.btn_2000_xxhdpi);
        btn5000xxhdpi = findViewById(R.id.btn_5000_xxhdpi);

        btn900xxxhdpi = findViewById(R.id.btn_900_xxxhdpi);
        btn1200xxxhdpi = findViewById(R.id.btn_1200_xxxhdpi);
        btn2000xxxhdpi = findViewById(R.id.btn_2000_xxxhdpi);
        btn5000xxxhdpi = findViewById(R.id.btn_5000_xxxhdpi);
        btn10000xxxhdpi = findViewById(R.id.btn_10000_xxxhdpi);

        btn100nodpi = findViewById(R.id.btn_100_nodpi);
        btn300nodpi = findViewById(R.id.btn_300_nodpi);
        btn600nodpi = findViewById(R.id.btn_600_nodpi);
        btn900nodpi = findViewById(R.id.btn_900_nodpi);
        btn1200nodpi = findViewById(R.id.btn_1200_nodpi);
        btn2000nodpi = findViewById(R.id.btn_2000_nodpi);
        btn5000nodpi = findViewById(R.id.btn_5000_nodpi);

    }


    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btn_100_draw:
                setImage(R.drawable.pic_100x100_drawable);
                break;
            case R.id.btn_300_draw:
                setImage(R.drawable.pic_300x300_drawable);
                break;
            case R.id.btn_600_draw:
                setImage(R.drawable.pic_600x600_drawable);
                break;
            case R.id.btn_900_draw:
                setImage(R.drawable.pic_900x900_drawable);
                break;
            case R.id.btn_1200_draw:
                setImage(R.drawable.pic_1200x1200_drawable);
                break;
            case R.id.btn_2000_draw:
                setImage(R.drawable.pic_2000x2000_drawable);
                break;
            case R.id.btn_5000_draw:
                setImage(R.drawable.pic_5000x5000_drawable);
                break;
            //******************
            //*****XHDPI********
            //******************
            case R.id.btn_100_xhdpi:
                setImage(R.drawable.pic_100x100_xhdpi);
                break;
            case R.id.btn_300_xhdpi:
                setImage(R.drawable.pic_300x300_xhdpi);
                break;
            case R.id.btn_600_xhdpi:
                setImage(R.drawable.pic_600x600_xhdpi);
                break;
            case R.id.btn_900_xhdpi:
                setImage(R.drawable.pic_900x900_xhdpi);
                break;
            case R.id.btn_1200_xhdpi:
                setImage(R.drawable.pic_1200x1200_xhdpi);
                break;
            case R.id.btn_2000_xhdpi:
                setImage(R.drawable.pic_2000x2000_xhdpi);
                break;
            case R.id.btn_5000_xhdpi:
                setImage(R.drawable.pic_5000x5000_xhdpi);
                break;
            //******************
            //*****XXHDPI********
            //******************
            case R.id.btn_1200_xxhdpi:
                setImage(R.drawable.pic_1200x1200_xxhdpi);
                break;
            case R.id.btn_2000_xxhdpi:
                setImage(R.drawable.pic_2000x2000_xxhdpi);
                break;
            case R.id.btn_5000_xxhdpi:
                setImage(R.drawable.pic_5000x5000_xxhdpi);
                break;
            //******************
            //*****XXXHDPI********
            //******************
            case R.id.btn_900_xxxhdpi:
                setImage(R.drawable.pic_900x900_xxxhdpi);
                break;
            case R.id.btn_1200_xxxhdpi:
                setImage(R.drawable.pic_1200x1200_xxxhdpi);
                break;
            case R.id.btn_2000_xxxhdpi:
                setImage(R.drawable.pic_2000x2000_xxxhdpi);
                break;
            case R.id.btn_5000_xxxhdpi:
                setImage(R.drawable.pic_5000x5000_xxxhdpi);
                break;
            case R.id.btn_10000_xxxhdpi:
                setImage(R.drawable.pic_10000x10000_xxxhdpi);
                break;
            //******************
            //*****NODPI********
            //******************
            case R.id.btn_100_nodpi:
                setImage(R.drawable.pic_100x100_nodpi);
                break;
            case R.id.btn_300_nodpi:
                setImage(R.drawable.pic_300x300_nodpi);
                break;
            case R.id.btn_600_nodpi:
                setImage(R.drawable.pic_600x600_nodpi);
                break;
            case R.id.btn_900_nodpi:
                setImage(R.drawable.pic_900x900_nodpi);
                break;
            case R.id.btn_1200_nodpi:
                setImage(R.drawable.pic_1200x1200_nodpi);
                break;
            case R.id.btn_2000_nodpi:
                setImage(R.drawable.pic_2000x2000_nodpi);
                break;
            case R.id.btn_5000_nodpi:
                setImage(R.drawable.pic_5000x5000_nodpi);
                break;
        }
    }

    private void setImage(int drawableId) {
        Picasso.get().load(drawableId).error(R.drawable.error_pic).into(imageView);
    }
}