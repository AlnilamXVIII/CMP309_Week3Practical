package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Go To Website Event Handler
        final Button goWebsite = findViewById(R.id.goWebsite);      //Instantiate button object called goWebsite that references the goWebsite id in the layout
        goWebsite.setOnClickListener(new View.OnClickListener() {   //Create an onClick listener
            @Override
            public void onClick(View v) {
                startBrowserActivity();                             //Call startBrowserActivity(); after clicking the button, this is why we need the event handler
            }
        });

        //Dial Contact Event Handler
        final Button dialContact = findViewById(R.id.dialContact);
        dialContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBrowserActivity();
            }
        });

        //Get Contact Event Handler
        final Button getContact = findViewById(R.id.getContact);
        getContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBrowserActivity();
            }
        });
    }

//    public void handleButtons(View button){
//        switch (button.getId()) {
//            case R.id.goWebsite: startBrowserActivity(); break;
//            case R.id.dialContact: ; break;
//            case R.id.getContact: ; break;
//        }
//    }

    private void startBrowserActivity(){
        //1. Create explicit intent from this activity to BrowserActivity
        Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
        //2. Get URL from Edit Text field; this is an extra
        String url = ((EditText)findViewById(R.id.editTextInput)).getText().toString();
        //3. Put extra into the intent
        intent.putExtra("URL", url);
        startActivity(intent);
    }
}