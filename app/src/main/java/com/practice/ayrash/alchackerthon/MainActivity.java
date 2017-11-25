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

    public EditText orangeQuantity, eggQuantity, appleQuantity, pineappleQuantity, coconutQuantity,
    watermelonQuantity, guavaQuantity, bananaQuantity, grapeQuantity, datesQuantity, pawpawQuantity,
    carrotQuantity, cucumberQuantity, strawberryQuantity, tangerineQuantity;

    public CheckBox orange, egg, apple, pineapple, coconut, watermelon, guava, banana, grape, dates,
    pawpaw, carrot, cucumber, strawberry, tangerine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orangePrice = (TextView) findViewById(R.id.orange_price);
        eggPrice = (TextView) findViewById(R.id.egg_price);
        applePrice = (TextView) findViewById(R.id.apple_price);
        pineapplePrice = (TextView) findViewById(R.id.pineapple_price);
        coconutPrice = (TextView) findViewById(R.id.coconut_price);
        watermelonPrice = (TextView) findViewById(R.id.water_melon_price);
        guavaPrice = (TextView) findViewById(R.id.guava_price);
        bananaPrice = (TextView) findViewById(R.id.banana_price);
        grapePrice = (TextView) findViewById(R.id.grape_price);
        datesPrice = (TextView) findViewById(R.id.dates_price);
        pawpawPrice = (TextView) findViewById(R.id.paw_paw_price);
        carrotPrice = (TextView) findViewById(R.id.carrot_price);
        cucumberPrice = (TextView) findViewById(R.id.cucumber_price);
        strawberryPrice = (TextView) findViewById(R.id.strawberry_price);
        tangerinePrice = (TextView) findViewById(R.id.tangerine_price);

        orangeQuantity = (EditText) findViewById(R.id.orange_quantity);
        eggQuantity = (EditText) findViewById(R.id.egg_quantity);
        appleQuantity = (EditText) findViewById(R.id.apple_quantity);
        pineappleQuantity = (EditText) findViewById(R.id.pineapple_quantity);
        coconutQuantity = (EditText) findViewById(R.id.coconut_quantity);
        watermelonQuantity = (EditText) findViewById(R.id.water_melon_quantity);
        guavaQuantity = (EditText) findViewById(R.id.guava_quantity);
        bananaQuantity = (EditText) findViewById(R.id.banana_quantity);
        grapeQuantity = (EditText) findViewById(R.id.grape_quantity);
        datesQuantity = (EditText) findViewById(R.id.dates_quantity);
        pawpawQuantity = (EditText) findViewById(R.id.paw_paw_quantity);
        carrotQuantity = (EditText) findViewById(R.id.carrot_quantity);
        cucumberQuantity = (EditText) findViewById(R.id.cucumber_quantity);
        strawberryQuantity = (EditText) findViewById(R.id.strawberry_quantity);
        tangerineQuantity = (EditText) findViewById(R.id.tangerine_quantity);

        orange = (CheckBox) findViewById(R.id.orange);
        egg = (CheckBox) findViewById(R.id.egg);
        apple = (CheckBox) findViewById(R.id.apple);
        pineapple = (CheckBox) findViewById(R.id.pineapple);
        coconut = (CheckBox) findViewById(R.id.coconut);
        watermelon = (CheckBox) findViewById(R.id.water_melon);
        guava = (CheckBox) findViewById(R.id.guava);
        banana = (CheckBox) findViewById(R.id.banana);
        grape = (CheckBox) findViewById(R.id.grape);
        dates = (CheckBox) findViewById(R.id.dates);
        pawpaw = (CheckBox) findViewById(R.id.paw_paw);
        carrot = (CheckBox) findViewById(R.id.carrot);
        cucumber = (CheckBox) findViewById(R.id.cucumber);
        strawberry = (CheckBox) findViewById(R.id.strawberry);
        tangerine = (CheckBox) findViewById(R.id.tangerine);

        orange_price = Integer.parseInt(orangePrice.getText().toString());
        egg_price = Integer.parseInt(eggPrice.getText().toString());
        apple_price = Integer.parseInt(applePrice.getText().toString());
        pineapple_price = Integer.parseInt(pineapplePrice.getText().toString());
        coconut_price = Integer.parseInt(coconutPrice.getText().toString());
        watermelon_price = Integer.parseInt(watermelonPrice.getText().toString());
        guava_price = Integer.parseInt(guavaPrice.getText().toString());
        banana_price = Integer.parseInt(bananaPrice.getText().toString());
        grape_price = Integer.parseInt(grapePrice.getText().toString());
        dates_price = Integer.parseInt(datesPrice.getText().toString());
        pawpaw_price = Integer.parseInt(pawpawPrice.getText().toString());
        carrot_price = Integer.parseInt(carrotPrice.getText().toString());
        cucumber_price = Integer.parseInt(cucumberPrice.getText().toString());
        strawberry_price = Integer.parseInt(strawberryPrice.getText().toString());
        tangerine_price = Integer.parseInt(tangerinePrice.getText().toString());

        orange_quantity = Integer.parseInt(orangeQuantity.getText().toString());
        egg_quantity = Integer.parseInt(eggQuantity.getText().toString());
        apple_quantity = Integer.parseInt(appleQuantity.getText().toString());
        pineapple_quantity = Integer.parseInt(pineappleQuantity.getText().toString());
        coconut_quantity = Integer.parseInt(coconutQuantity.getText().toString());
        watermelon_quantity = Integer.parseInt(watermelonQuantity.getText().toString());
        guava_quantity = Integer.parseInt(guavaQuantity.getText().toString());
        banana_quantity = Integer.parseInt(bananaQuantity.getText().toString());
        grape_quantity = Integer.parseInt(grapeQuantity.getText().toString());
        dates_quantity = Integer.parseInt(datesQuantity.getText().toString());
        pawpaw_quantity = Integer.parseInt(pawpawQuantity.getText().toString());
        carrot_quantity = Integer.parseInt(carrotQuantity.getText().toString());
        cucumber_quantity = Integer.parseInt(cucumberQuantity.getText().toString());
        strawberry_quantity = Integer.parseInt(strawberryQuantity.getText().toString());
        tangerine_quantity = Integer.parseInt(tangerineQuantity.getText().toString());
    }

    public void orderNow(View view){

//        Intent intent = new Intent(this, DisplaySummaryActivity.class);
//        startActivity(intent);

        if (orange.isChecked()){
            totalPrice += (orange_quantity * orange_price);
        }

        if (egg.isChecked()){
            totalPrice += (egg_quantity * egg_price);
        }

        if (apple.isChecked()){
            totalPrice += (apple_quantity * apple_price);
        }

        if (pineapple.isChecked()){
            totalPrice += (pineapple_quantity * pineapple_price);
        }

        if (coconut.isChecked()){
            totalPrice += (coconut_quantity * coconut_price);
        }

        if (watermelon.isChecked()){
            totalPrice += (watermelon_quantity * watermelon_price);
        }

        if (guava.isChecked()){
            totalPrice += (guava_quantity * guava_price);
        }

        if (banana.isChecked()){
            totalPrice += (banana_quantity * banana_price);
        }

        if (grape.isChecked()){
            totalPrice += (grape_quantity * grape_price);
        }

        if (dates.isChecked()){
            totalPrice += (dates_quantity * dates_price);
        }

        if (pawpaw.isChecked()){
            totalPrice += (pawpaw_quantity * pawpaw_price);
        }

        if (carrot.isChecked()){
            totalPrice += (carrot_quantity * carrot_price);
        }

        if (cucumber.isChecked()){
            totalPrice += (cucumber_quantity * cucumber_price);
        }

        if (strawberry.isChecked()){
            totalPrice += (strawberry_quantity * strawberry_price);
        }

        if (tangerine.isChecked()){
            totalPrice += (tangerine_quantity * tangerine_price);
        }

        Toast.makeText(this, "The total price is " + totalPrice, Toast.LENGTH_SHORT).show();

    }


}
