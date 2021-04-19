package com.myduyen.baitap_tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    Intent i;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_01);
        TextView tv = (TextView) findViewById(R.id.tvGia);
        tv.setPaintFlags(tv.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        button = findViewById(R.id.btn_Mau);
        img =(ImageView)findViewById(R.id.imageView);
        img.setImageResource(getIntent().getIntExtra("ImgRe",R.drawable.vsmart_live_xanh1));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);


            }
        });

    }

}