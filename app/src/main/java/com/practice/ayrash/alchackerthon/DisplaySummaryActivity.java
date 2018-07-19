package com.practice.ayrash.alchackerthon;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import static android.R.id.message;
import static com.practice.ayrash.alchackerthon.MainActivity.OrderDetails;
import static com.practice.ayrash.alchackerthon.R.id.orange;

public class DisplaySummaryActivity extends AppCompatActivity implements View.OnClickListener{

    int totalPrice = 0;
    String name = "";
    File myFile;

    private static final String TAG = DisplaySummaryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_summary);

        Intent intent = getIntent();
        totalPrice = intent.getIntExtra(OrderDetails, 0);
        name = name + totalPrice;
    }

    /*public void generateSummary(View view){

        //To get the text from editfield
        EditText nameField = (EditText) findViewById(R.id.customer_name);
        Editable nameEditable = nameField.getText();
        name = nameEditable.toString();

        String message = createOrderSummary(name);
        displaySummary(message);

        Toast.makeText(this, "Your total is " + totalPrice, Toast.LENGTH_SHORT).show();

    }*/

    public void displaySummary(String message){

        TextView textView = (TextView) findViewById(R.id.display_summary);
        textView.setText(message);

    }

    public String createOrderSummary(String name){
        String summaryMessage = "Thank You! " + name;
        return summaryMessage;
    }

    private void createPdf() throws FileNotFoundException, DocumentException {

        File pdfFolder = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "pdfdemo");

        if (!pdfFolder.exists()){
            pdfFolder.mkdir();
            Log.i(TAG, "Pdf Directory created");
        }

        // Create time stamp
        Date date = new Date();

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(date);

        myFile = new File(pdfFolder + timestamp + ".pdf");

        OutputStream outputStream = new FileOutputStream(myFile);

        Rectangle pagesize = new Rectangle(216f, 720f);
//        Document document = new Document(pagesize, 36f, 72f, 108f, 180f);
        Document document = new Document(PageSize.LETTER);

        PdfWriter.getInstance(document, outputStream);

        document.open();

        document.add(new Paragraph(name));
        document.add(new Paragraph(name));

        document.close();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.generate_summary:
                try {
                    createPdf();
                } catch (FileNotFoundException e) {
                    Log.d(TAG, "Message: " + e.getMessage());
                    e.printStackTrace();
                } catch (DocumentException e) {
                    Log.d(TAG, "Message: " + e.getMessage());
                    e.printStackTrace();
                }
                break;
            case R.id.read_summary:
                viewPdf();

                break;
        }
    }

    private void viewPdf(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.fromFile(myFile), "application/pdf");
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
    }
}
