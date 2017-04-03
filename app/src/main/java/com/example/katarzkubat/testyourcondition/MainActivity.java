package com.example.katarzkubat.testyourcondition;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View next = (Button) findViewById(R.id.button_next);

        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent summaryIntent = new Intent(MainActivity.this, SummaryActivity.class);
                summaryIntent.putExtra(SummaryActivity.RESULT, result);
                startActivity(summaryIntent);
                reset();
            }
        });
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
                points6 == 0 || points7 == 0) {

            Toast.makeText(this, communicate, Toast.LENGTH_LONG).show();
            return;
        }

        result = points1 + points2 + points3 + points4 + points5 +
                points6 + points7 + points8 + points9 + points10 + points11;

        if (result >= 7) {
            ((Button) findViewById(R.id.button_next)).setVisibility(View.VISIBLE);
            ((TextView) findViewById(R.id.text_comment)).setVisibility(View.VISIBLE);
        }
    }

    private void reset() {
        points1 = points2 = points3 = points4 = points5 =
                points6 = points7 = points8 = points9 = points10 = points11 = 0;
        ((RadioButton) findViewById(R.id.answer1_1)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer1_2)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer1_3)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer1_4)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer2_1)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer2_2)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer2_3)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer2_4)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer3_1)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer3_2)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer3_3)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer3_4)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer4_1)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer4_2)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer4_3)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer4_4)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer5_1)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer5_2)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer5_3)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer5_4)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer6_1)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer6_2)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer6_3)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer6_4)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer7_1)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer7_2)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer7_3)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer7_4)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox1)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox2)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox3)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox4)).setChecked(false);

        ((Button) findViewById(R.id.button_next)).setVisibility(View.INVISIBLE);
        ((TextView) findViewById(R.id.text_comment)).setVisibility(View.INVISIBLE);

    }
}


