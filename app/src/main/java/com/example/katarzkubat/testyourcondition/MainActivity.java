package com.example.katarzkubat.testyourcondition;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private int points1 = 0;
    private int points2 = 0;
    private int points3 = 0;
    private int points4 = 0;
    private int points5 = 0;
    private int points6 = 0;
    private int points7 = 0;
    private int points8 = 0;
    private int points9 = 0;
    private int points10 = 0;
    private int points11 = 0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    public void onRadioButtonClicked(View view) {

    }
    public void onRadioButtonClickedOne(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.answer1_1:
                if (checked) {
                    points1 = 4;
                }
                break;
            case R.id.answer1_2:
                if (checked) {
                    points1 = 3;
                }
                break;
            case R.id.answer1_3:
                if (checked) {
                    points1 = 1;
                }
                break;
            case R.id.answer1_4:
                if (checked) {
                    points1 = 2;
                }
        }
    }

    public void onRadioButtonClickedTwo(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.answer2_1:
                if (checked) {
                    points2 = 4;
                }
                break;
            case R.id.answer2_2:
                if (checked) {
                    points2 = 3;
                }
                break;
            case R.id.answer2_3:
                if (checked) {
                    points2 = 2;
                }
                break;
            case R.id.answer2_4:
                if (checked) {
                    points2 = 1;
                }
        }
    }

    public void onRadioButtonClickedThree(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.answer3_1:
                if (checked) {
                    points3 = 1;
                }
                break;
            case R.id.answer3_2:
                if (checked) {
                    points3 = 2;
                }
                break;
            case R.id.answer3_3:
                if (checked) {
                    points3 = 3;
                }
                break;
            case R.id.answer3_4:
                if (checked) {
                    points3 = 4;
                }
        }
    }

    public void onRadioButtonClickedFour(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.answer4_1:
                if (checked) {
                    points4 = 1;
                }
                break;
            case R.id.answer4_2:
                if (checked) {
                    points4 = 2;
                }
                break;
            case R.id.answer4_3:
                if (checked) {
                    points4 = 3;
                }
                break;
            case R.id.answer4_4:
                if (checked) {
                    points4 = 4;
                }
        }
    }

    public void onRadioButtonClickedFive(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.answer5_1:
                if (checked) {
                    points5 = 4;
                }
                break;
            case R.id.answer5_2:
                if (checked) {
                    points5 = 3;
                }
                break;
            case R.id.answer5_3:
                if (checked) {
                    points5 = 2;
                }
                break;
            case R.id.answer5_4:
                if (checked) {
                    points5 = 1;
                }
        }
    }

    public void onRadioButtonClickedSix(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.answer6_1:
                if (checked) {
                    points6 = 1;
                }
                break;
            case R.id.answer6_2:
                if (checked) {
                    points6 = 2;
                }
                break;
            case R.id.answer6_3:
                if (checked) {
                    points6 = 3;
                }
                break;
            case R.id.answer6_4:
                if (checked) {
                    points6 = 4;
                }
        }
    }

    public void onRadioButtonClickedSeven(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.answer7_1:
                if (checked) {
                    points7 = 1;
                }
                break;
            case R.id.answer7_2:
                if (checked) {
                    points7 = 2;
                }
                break;
            case R.id.answer7_3:
                if (checked) {
                    points7 = 3;
                }
                break;
            case R.id.answer7_4:
                if (checked) {
                    points7 = 4;
                }
        }
    }

    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkbox1:
                if (checked) {
                    points8 = 2;
                } else {
                    points8 = 0;
                }
                break;
            case R.id.checkbox2:
                if (checked) {
                    points9 = 2;
                } else {
                    points9 = 0;
                }
                break;
            case R.id.checkbox3:
                if (checked) {
                    points10 = 2;
                } else {
                    points10 = 0;
                }
                break;
            case R.id.checkbox4:
                if (checked) {
                    points11 = 2;
                } else {
                    points11 = 0;
                }
        }
    }

    public void submit(View view) {
        Log.i("test", "test");
        String communicate = "You probably haven't checked some question. Check it again.";

        if (points1 == 0 || points2 == 0 || points3 == 0 || points4 == 0 || points5 == 0 ||
                points6 == 0 || points7 == 0){

            Toast.makeText(this, communicate, Toast.LENGTH_LONG).show();
            return;
        }
        int result = points1 + points2 + points3 + points4 + points5 +
                        points6 + points7 + points8 + points9 + points10 + points11;

        String communicateResult = "Your result: " + result + "points.";

        if (result >= 7 && result <= 14) {
            communicateResult = communicateResult + " Good News! Everything is OK";
        }else if(result > 14 && result <= 22){
            communicateResult = communicateResult +" It's quite OK";
        }else if (result > 22 && result <= 30){
            communicateResult = communicateResult +" Alarm! You should change your habits ASAP!";
        }else if (result >30) {
            communicateResult = communicateResult + " Bad News! You need a specialist!";
        }
        Toast.makeText(this, communicateResult, Toast.LENGTH_LONG).show();
        if (result >=7){
            ((EditText)findViewById(R.id.mail_field)).setVisibility(View.VISIBLE);
            ((Button)findViewById(R.id.button_send)).setVisibility(View.VISIBLE);
            ((TextView)findViewById(R.id.text_comment)).setVisibility(View.VISIBLE);
        }
    }
    public void sendMail(View view) {
        EditText nameField = (EditText)findViewById(R.id.mail_field);
        String email = nameField.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + email));
        intent.putExtra(Intent.EXTRA_SUBJECT, "subject of email");
        intent.putExtra(Intent.EXTRA_TEXT   , "body of email");
        try {
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        } finally {
            reset();
        }
    }

    private void reset(){
        points1 = points2 = points3 = points4 = points5 =
                points6 = points7 = points8 = points9 = points10 = points11 = 0;
        ((RadioButton)findViewById(R.id.answer1_1)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer1_2)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer1_3)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer1_4)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer2_1)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer2_2)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer2_3)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer2_4)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer3_1)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer3_2)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer3_3)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer3_4)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer4_1)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer4_2)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer4_3)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer4_4)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer5_1)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer5_2)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer5_3)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer5_4)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer6_1)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer6_2)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer6_3)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer6_4)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer7_1)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer7_2)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer7_3)).setChecked(false);
        ((RadioButton)findViewById(R.id.answer7_4)).setChecked(false);
        ((CheckBox)findViewById(R.id.checkbox1)).setChecked(false);
        ((CheckBox)findViewById(R.id.checkbox2)).setChecked(false);
        ((CheckBox)findViewById(R.id.checkbox3)).setChecked(false);
        ((CheckBox)findViewById(R.id.checkbox4)).setChecked(false);

        ((EditText)findViewById(R.id.mail_field)).setVisibility(View.INVISIBLE);
        ((Button)findViewById(R.id.button_send)).setVisibility(View.INVISIBLE);
        ((TextView)findViewById(R.id.text_comment)).setVisibility(View.INVISIBLE);
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
