package com.example.app_led_1;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button_all = null;
    private boolean ledon = false;
    private CheckBox checkBoxLed1;
    private CheckBox checkBoxLed2;
    private CheckBox checkBoxLed3;
    private CheckBox checkBoxLed4;

    class MyButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            button_all = (Button) findViewById(R.id.button);
            button_all.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ledon = !ledon;
                    Log.d("test", "ledon :"+ ledon);
                    if (ledon) {
                        button_all.setText("ALL OFF");
                        checkBoxLed1.setChecked(true);
                        checkBoxLed2.setChecked(true);
                        checkBoxLed3.setChecked(true);
                        checkBoxLed4.setChecked(true);
                    }
                    else {
                        button_all.setText("ALL ON");
                        checkBoxLed1.setChecked(false);
                        checkBoxLed2.setChecked(false);
                        checkBoxLed3.setChecked(false);
                        checkBoxLed4.setChecked(false);
                    }
                }
            });
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_all = (Button) findViewById(R.id.button);
        button_all.setOnClickListener(new MyButtonListener());
        checkBoxLed1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBoxLed2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBoxLed3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBoxLed4 = (CheckBox) findViewById(R.id.checkBox4);

//        button_all.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ledon = !ledon;
//                if (ledon)
//                    button_all.setText("ALL OFF");
//                else
//                    button_all.setText("ALL ON");
//            }
//        });


    }

    public void OnCheckedboxLedClicked(View view){

        boolean checked = ((CheckBox) view).isChecked();
        int id = view.getId();
        if (R.id.checkBox1 == id) {
            Toast.makeText(getApplicationContext(), checked ? "led1 on" : "led1 off", Toast.LENGTH_SHORT).show();
        } else if (R.id.checkBox2 == id) {
            Toast.makeText(getApplicationContext(),  checked ? "led2 on": "led2 off", Toast.LENGTH_SHORT).show();
        } else if (R.id.checkBox3 == id) {
            Toast.makeText(getApplicationContext(), checked ? "led3 on" : "led3 off", Toast.LENGTH_SHORT).show();
        } else if (R.id.checkBox4 == id) {
            Toast.makeText(getApplicationContext(), checked ? "led4 on" : "led4 off", Toast.LENGTH_SHORT).show();
        }

    }


}