package com.practice.ayrash.alchackerthon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalPrice = 0;
    int orange_price, egg_price, apple_price, pineapple_price, coconut_price, watermelon_price,
    guava_price, banana_price, grape_price, dates_price, pawpaw_price, carrot_price, cucumber_price,
    strawberry_price, tangerine_price;
    int orange_quantity, egg_quantity, apple_quantity, pineapple_quantity, coconut_quantity,
    watermelon_quantity, guava_quantity, banana_quantity, grape_quantity, dates_quantity,
    pawpaw_quantity, carrot_quantity, cucumber_quantity, strawberry_quantity, tangerine_quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void orderNow(View view){

        Intent intent = new Intent(this, DisplaySummaryActivity.class);
        startActivity(intent);

        CheckBox orange = (CheckBox) findViewById(R.id.orange);
            if (orange.isChecked()){
                totalPrice += (orange_quantity * orange_price);
            }
        CheckBox egg = (CheckBox) findViewById(R.id.egg);
        CheckBox apple = (CheckBox) findViewById(R.id.apple);
        CheckBox pineapple = (CheckBox) findViewById(R.id.pineapple);
        CheckBox coconut = (CheckBox) findViewById(R.id.coconut);
        CheckBox waterMelon = (CheckBox) findViewById(R.id.water_melon);
        CheckBox guava = (CheckBox) findViewById(R.id.guava);
        CheckBox banana = (CheckBox) findViewById(R.id.banana);
        CheckBox grape = (CheckBox) findViewById(R.id.grape);
        CheckBox dates = (CheckBox) findViewById(R.id.dates);
        CheckBox pawPaw = (CheckBox) findViewById(R.id.paw_paw);
        CheckBox carrot = (CheckBox) findViewById(R.id.carrot);
        CheckBox cucumber = (CheckBox) findViewById(R.id.cucumber);
        CheckBox strawberry = (CheckBox) findViewById(R.id.strawberry);
        CheckBox tangerine = (CheckBox) findViewById(R.id.tangerine);

        TextView orangePrice = (TextView) findViewById(R.id.orange_price);
        orange_price = Integer.parseInt(orangePrice.getText().toString());
        TextView eggPrice = (TextView) findViewById(R.id.egg_price);
        egg_price = Integer.parseInt(eggPrice.getText().toString());
        TextView applePrice = (TextView) findViewById(R.id.apple_price);
        TextView pineapplePrice = (TextView) findViewById(R.id.pineapple_price);
        TextView coconutPrice = (TextView) findViewById(R.id.coconut_price);
        TextView waterMelonPrice = (TextView) findViewById(R.id.water_melon_price);
        TextView guavaPrice = (TextView) findViewById(R.id.guava_price);
        TextView bananaPrice = (TextView) findViewById(R.id.banana_price);
        TextView grapePrice = (TextView) findViewById(R.id.grape_price);
        TextView datesPrice = (TextView) findViewById(R.id.dates_price);
        TextView pawpawPrice = (TextView) findViewById(R.id.paw_paw_price);
        TextView carrotPrice = (TextView) findViewById(R.id.carrot_price);
        TextView cucumberPrice = (TextView) findViewById(R.id.cucumber_price);
        TextView strawberryPrice = (TextView) findViewById(R.id.strawberry_price);
        TextView tangerinePrice = (TextView) findViewById(R.id.tangerine_price);

        EditText orangeQuantity = (EditText) findViewById(R.id.orange_quantity);
        orange_quantity = Integer.parseInt(orangeQuantity.getText().toString());
        EditText eggQuantity = (EditText) findViewById(R.id.egg_quantity);
        EditText appleQuantity = (EditText) findViewById(R.id.apple_quantity);
        EditText pineappleQuantity = (EditText) findViewById(R.id.pineapple_quantity);
        EditText coconutQuantity = (EditText) findViewById(R.id.coconut_quantity);
        EditText waterMelonQuantity = (EditText) findViewById(R.id.water_melon_quantity);
        EditText guavaQuantity = (EditText) findViewById(R.id.guava_quantity);
        EditText bananaQuanity = (EditText) findViewById(R.id.banana_quantity);
        EditText grapeQuantity = (EditText) findViewById(R.id.grape_quantity);
        EditText datesQuantity = (EditText) findViewById(R.id.dates_quantity);
        EditText pawpawQuantity = (EditText) findViewById(R.id.paw_paw_quantity);
        EditText carrotQuantity = (EditText) findViewById(R.id.carrot_quantity);
        EditText cucumberQuantity = (EditText) findViewById(R.id.cucumber_quantity);
        EditText strawberryQuantity = (EditText) findViewById(R.id.strawberry_quantity);
        EditText tangerineQuantity = (EditText) findViewById(R.id.tangerine_quantity);


    }


}
