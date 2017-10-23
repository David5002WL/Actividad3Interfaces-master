package com.example.a2dam.actividad3;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Principal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    }


    public void onClick(View v){

        TextView textview14 = (TextView) findViewById(R.id.textView14);
        TextView textview15 = (TextView) findViewById(R.id.textView15);
        TextView textview16 = (TextView) findViewById(R.id.textView16);
        TextView textview17 = (TextView) findViewById(R.id.textView17);
        TextView textview18 = (TextView) findViewById(R.id.textView18);
        TextView textview19 = (TextView) findViewById(R.id.textView19);
        TextView textview20 = (TextView) findViewById(R.id.textView20);
        TextView textview21 = (TextView) findViewById(R.id.textView21);


            if (v.getId() == R.id.textView) {
                textview14.setVisibility(View.VISIBLE);
                textview15.setVisibility(View.VISIBLE);
                textview16.setVisibility(View.VISIBLE);
                textview17.setVisibility(View.VISIBLE);
                textview18.setVisibility(View.VISIBLE);
                textview19.setVisibility(View.VISIBLE);
                textview20.setVisibility(View.VISIBLE);
                textview21.setVisibility(View.VISIBLE);
            }
            if (v.getId() == R.id.textView2) {

                textview14.setVisibility(View.VISIBLE);
                textview15.setVisibility(View.VISIBLE);
                textview16.setVisibility(View.VISIBLE);
                textview17.setVisibility(View.GONE);
                textview18.setVisibility(View.GONE);
                textview19.setVisibility(View.GONE);
                textview20.setVisibility(View.GONE);
                textview21.setVisibility(View.GONE);

            }

            if (v.getId() == R.id.textView3) {

                textview14.setVisibility(View.VISIBLE);
                textview15.setVisibility(View.GONE);
                textview16.setVisibility(View.GONE);
                textview17.setVisibility(View.GONE);
                textview18.setVisibility(View.GONE);
                textview19.setVisibility(View.GONE);
                textview20.setVisibility(View.GONE);
                textview21.setVisibility(View.GONE);
            }

            if (v.getId() == R.id.textView4) {

                textview14.setVisibility(View.GONE);
                textview15.setVisibility(View.GONE);
                textview16.setVisibility(View.GONE);
                textview17.setVisibility(View.GONE);
                textview18.setVisibility(View.GONE);
                textview19.setVisibility(View.GONE);
                textview20.setVisibility(View.GONE);
                textview21.setVisibility(View.GONE);
            }

    }

}
