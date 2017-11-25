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

    public TextView orangePrice, eggPrice, applePrice, pineapplePrice, coconutPrice, watermelonPrice,
    guavaPrice, bananaPrice, grapePrice, datesPrice, pawpawPrice, carrotPrice, cucumberPrice,
    strawberryPrice, tangerinePrice;
    public EditText orangeQuantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orangePrice = (TextView) findViewById(R.id.orange_price);
        orangeQuantity = (EditText) findViewById(R.id.orange_quantity);
    }

    public void orderNow(View view){

//        Intent intent = new Intent(this, DisplaySummaryActivity.class);
//        startActivity(intent);

//        TextView orangePrice = (TextView) findViewById(R.id.orange_price);
        orange_price = Integer.parseInt(orangePrice.getText().toString());
        TextView eggPrice = (TextView) findViewById(R.id.egg_price);
        egg_price = Integer.parseInt(eggPrice.getText().toString());
        TextView applePrice = (TextView) findViewById(R.id.apple_price);
        apple_price = Integer.parseInt(applePrice.getText().toString());
        TextView pineapplePrice = (TextView) findViewById(R.id.pineapple_price);
        pineapple_price = Integer.parseInt(pineapplePrice.getText().toString());
        TextView coconutPrice = (TextView) findViewById(R.id.coconut_price);
        coconut_price = Integer.parseInt(coconutPrice.getText().toString());
        TextView waterMelonPrice = (TextView) findViewById(R.id.water_melon_price);
        watermelon_price = Integer.parseInt(waterMelonPrice.getText().toString());
        TextView guavaPrice = (TextView) findViewById(R.id.guava_price);
        guava_price = Integer.parseInt(guavaPrice.getText().toString());
        TextView bananaPrice = (TextView) findViewById(R.id.banana_price);
        banana_price = Integer.parseInt(bananaPrice.getText().toString());
        TextView grapePrice = (TextView) findViewById(R.id.grape_price);
        grape_price = Integer.parseInt(grapePrice.getText().toString());
        TextView datesPrice = (TextView) findViewById(R.id.dates_price);
        dates_price = Integer.parseInt(datesPrice.getText().toString());
        TextView pawpawPrice = (TextView) findViewById(R.id.paw_paw_price);
        pawpaw_price = Integer.parseInt(pawpawPrice.getText().toString());
        TextView carrotPrice = (TextView) findViewById(R.id.carrot_price);
        carrot_price = Integer.parseInt(carrotPrice.getText().toString());
        TextView cucumberPrice = (TextView) findViewById(R.id.cucumber_price);
        cucumber_price = Integer.parseInt(cucumberPrice.getText().toString());
        TextView strawberryPrice = (TextView) findViewById(R.id.strawberry_price);
        strawberry_price = Integer.parseInt(strawberryPrice.getText().toString());
        TextView tangerinePrice = (TextView) findViewById(R.id.tangerine_price);
        tangerine_price = Integer.parseInt(tangerinePrice.getText().toString());

//        EditText orangeQuantity = (EditText) findViewById(R.id.orange_quantity);
        orange_quantity = Integer.parseInt(orangeQuantity.getText().toString());
        EditText eggQuantity = (EditText) findViewById(R.id.egg_quantity);
        egg_quantity = Integer.parseInt(eggQuantity.getText().toString());
        EditText appleQuantity = (EditText) findViewById(R.id.apple_quantity);
        apple_quantity = Integer.parseInt(appleQuantity.getText().toString());
        EditText pineappleQuantity = (EditText) findViewById(R.id.pineapple_quantity);
        pineapple_quantity = Integer.parseInt(pineappleQuantity.getText().toString());
        EditText coconutQuantity = (EditText) findViewById(R.id.coconut_quantity);
        coconut_quantity = Integer.parseInt(coconutQuantity.getText().toString());
        EditText waterMelonQuantity = (EditText) findViewById(R.id.water_melon_quantity);
        watermelon_quantity = Integer.parseInt(waterMelonQuantity.getText().toString());
        EditText guavaQuantity = (EditText) findViewById(R.id.guava_quantity);
        guava_quantity = Integer.parseInt(guavaQuantity.getText().toString());
        EditText bananaQuantity = (EditText) findViewById(R.id.banana_quantity);
        banana_quantity = Integer.parseInt(bananaQuantity.getText().toString());
        EditText grapeQuantity = (EditText) findViewById(R.id.grape_quantity);
        grape_quantity = Integer.parseInt(grapeQuantity.getText().toString());
        EditText datesQuantity = (EditText) findViewById(R.id.dates_quantity);
        dates_quantity = Integer.parseInt(datesQuantity.getText().toString());
        EditText pawpawQuantity = (EditText) findViewById(R.id.paw_paw_quantity);
        pawpaw_quantity = Integer.parseInt(pawpawQuantity.getText().toString());
        EditText carrotQuantity = (EditText) findViewById(R.id.carrot_quantity);
        carrot_quantity = Integer.parseInt(carrotQuantity.getText().toString());
        EditText cucumberQuantity = (EditText) findViewById(R.id.cucumber_quantity);
        cucumber_quantity = Integer.parseInt(cucumberQuantity.getText().toString());
        EditText strawberryQuantity = (EditText) findViewById(R.id.strawberry_quantity);
        strawberry_quantity = Integer.parseInt(strawberryQuantity.getText().toString());
        EditText tangerineQuantity = (EditText) findViewById(R.id.tangerine_quantity);
        tangerine_quantity = Integer.parseInt(tangerineQuantity.getText().toString());

        CheckBox orange = (CheckBox) findViewById(R.id.orange);
            if (orange.isChecked()){
                totalPrice += (orange_quantity * orange_price);
            }
        CheckBox egg = (CheckBox) findViewById(R.id.egg);
            if (egg.isChecked()){
                totalPrice += (egg_quantity * egg_price);
            }
        CheckBox apple = (CheckBox) findViewById(R.id.apple);
            if (apple.isChecked()){
                totalPrice += (apple_quantity * apple_price);
            }
        CheckBox pineapple = (CheckBox) findViewById(R.id.pineapple);
            if (pineapple.isChecked()){
                totalPrice += (pineapple_quantity * pineapple_price);
            }
        CheckBox coconut = (CheckBox) findViewById(R.id.coconut);
            if (coconut.isChecked()){
                totalPrice += (coconut_quantity * coconut_price);
            }
        CheckBox waterMelon = (CheckBox) findViewById(R.id.water_melon);
            if (waterMelon.isChecked()){
                totalPrice += (watermelon_quantity * watermelon_price);
            }
        CheckBox guava = (CheckBox) findViewById(R.id.guava);
            if (guava.isChecked()){
                totalPrice += (guava_quantity * guava_price);
            }
        CheckBox banana = (CheckBox) findViewById(R.id.banana);
            if (banana.isChecked()){
                totalPrice += (banana_quantity * banana_price);
            }
        CheckBox grape = (CheckBox) findViewById(R.id.grape);
            if (grape.isChecked()){
                totalPrice += (grape_quantity * grape_price);
            }
        CheckBox dates = (CheckBox) findViewById(R.id.dates);
            if (dates.isChecked()){
                totalPrice += (dates_quantity * dates_price);
            }
        CheckBox pawPaw = (CheckBox) findViewById(R.id.paw_paw);
            if (pawPaw.isChecked()){
                totalPrice += (pawpaw_quantity * pawpaw_price);
            }
        CheckBox carrot = (CheckBox) findViewById(R.id.carrot);
            if (carrot.isChecked()){
                totalPrice += (carrot_quantity * carrot_price);
            }
        CheckBox cucumber = (CheckBox) findViewById(R.id.cucumber);
            if (cucumber.isChecked()){
                totalPrice += (cucumber_quantity * cucumber_price);
            }
        CheckBox strawberry = (CheckBox) findViewById(R.id.strawberry);
            if (strawberry.isChecked()){
                totalPrice += (strawberry_quantity * strawberry_price);
            }
        CheckBox tangerine = (CheckBox) findViewById(R.id.tangerine);
            if (tangerine.isChecked()){
                totalPrice += (tangerine_quantity * tangerine_price);
            }

        Toast.makeText(this, "The total price is " + totalPrice, Toast.LENGTH_SHORT).show();

    }


}
