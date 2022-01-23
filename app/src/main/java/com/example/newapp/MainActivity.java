package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));
        // User can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });

        // User can tap a button to change the color of the background view
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            findViewById(R.id.Parent).setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        //User can tap a button to change the text string of the label
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        //User can tap on the background view to reset all views to default settings.
        findViewById(R.id.Parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Reset the text to "Hello from Ikraam"
                //((TextView)  findViewById(R.id.text)).setText("Hello from Ikraam")
                textView.setText("Hello from Ikraam");
                //Reset the color of the text to original color (black orig)
                // original text color black , text id @id/text
                textView.setTextColor(getResources().getColor(R.color.black));
                //Reset the background color
                //original background color - R.color.teal
                findViewById(R.id.Parent).setBackgroundColor(getResources().getColor(R.color.teal_200));
            }
        });

        //User can tap the “Change text string” button to update the label with the text from the text field
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change text view to what's in the edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
                textView.setText(userEnteredText);
                //If the text field is empty, update label with default text string
                if(userEnteredText.isEmpty()){
                    textView.setText("Enter your own text");
                }
                else
                {
                    textView.setText(userEnteredText);
                }
            }
        });
    }
}
