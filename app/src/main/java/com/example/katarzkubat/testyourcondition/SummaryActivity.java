package com.example.katarzkubat.testyourcondition;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SummaryActivity extends AppCompatActivity {

    public static String RESULT = "result";
    public static String COMMUNICATE = "communicate";

    private int result;
    private String communicateResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        result = getIntent().getIntExtra(RESULT, 0);

        communicateResult = "Your result: " + result + "points.";

        if (result >= 7 && result <= 14) {
            communicateResult = communicateResult + " Good News! Everything is OK";
        } else if (result > 14 && result <= 22) {
            communicateResult = communicateResult + " It's quite OK";
        } else if (result > 22 && result <= 30) {
            communicateResult = communicateResult + " Alarm! You should change your habits ASAP!";
        } else if (result > 30) {
            communicateResult = communicateResult + " Bad News! You need a specialist!";
        }
        ((TextView)findViewById(R.id.communicate)).setText(communicateResult);
    }

    public void sendMail(View view) {
        EditText nameField = (EditText) findViewById(R.id.mail_field);
        String email = nameField.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + email));

        intent.putExtra(Intent.EXTRA_SUBJECT, "Hello, we have results of your quiz");
        intent.putExtra(Intent.EXTRA_TEXT, communicateResult);

        try {
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(SummaryActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        } finally {

        }
    }



}
