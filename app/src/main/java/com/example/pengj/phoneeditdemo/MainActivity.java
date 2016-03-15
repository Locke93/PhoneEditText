package com.example.pengj.phoneeditdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText, phoneText;
    Button paste, btn_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edit_comm);
        phoneText = (EditText) findViewById(R.id.edit_phone);
        paste = (Button) findViewById(R.id.button);
        btn_display = (Button) findViewById(R.id.btn_display);
        btn_display.setOnClickListener(this);
        paste.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                phoneText.setText(editText.getText());
            break;
            case R.id.btn_display:
                Toast.makeText(this,((PhoneEditText)phoneText).getPhone(),Toast.LENGTH_SHORT).show();
            break;
        }

    }
}
