package com.practice.ayrash.alchackerthon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.message;
import static com.practice.ayrash.alchackerthon.R.id.orange;

public class DisplaySummaryActivity extends AppCompatActivity {

    int totalPrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_summary);

        Intent intent = getIntent();
    }

    public void orderNow(View view){

        //To get the text from editfield
        EditText nameField = (EditText) findViewById(R.id.customer_name);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();

        String message = createOrderSummary(name);
        displaySummary(message);



        Toast.makeText(this, "Your total is " + totalPrice, Toast.LENGTH_SHORT).show();

    }

    public void displaySummary(String message){

        TextView textView = (TextView) findViewById(R.id.display_summary);
        textView.setText(message);

    }

    public String createOrderSummary(String name){
        String summaryMessage = "Thank You! " + name;
        return summaryMessage;
    }
}
