package com.example.assesmenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "Text Entry App";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enterButton = (Button) findViewById(R.id.enterButton);
        enterButton.setTransformationMethod(null); 
    }

    public void sendMessage (View aView)
    {
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}