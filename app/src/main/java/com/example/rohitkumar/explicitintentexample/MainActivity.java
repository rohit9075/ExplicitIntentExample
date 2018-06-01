package com.example.rohitkumar.explicitintentexample;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // global or Instance variables
    private String mName, mEamil;
    private TextInputEditText  mTextInputEditTextName, mTextInputEditTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    // gettingReference method definition
    private void gettingReference() {
        mTextInputEditTextName = findViewById(R.id.name);
        mTextInputEditTextEmail = findViewById(R.id.email);
    }

    // Handling SendByIntent button click using onClick method
    public void sendByIntent(View view) {
        // method call gettingReference()
        gettingReference();
        // method call gettingValue()
        gettingValue();

        // Intent object using parameterize constructor first parameter is context and second is target Activity
        Intent mIntent = new Intent(getApplicationContext(), ReceivingActivity.class);
        // Attaching the data to intent bundle with key value pair
        mIntent.putExtra("name", mName);
        mIntent.putExtra("email", mEamil);

        // starting the Activity
        startActivity(mIntent);
    }

    // gettingValue method definition
    private void gettingValue() {
        mName = mTextInputEditTextName.getText().toString();
        mEamil = mTextInputEditTextEmail.getText().toString();
    }

    public void sendByBundle(View view) {

        // method call gettingReference()
        gettingReference();

        // gettingValue()
        gettingValue();

        // intent object
        Intent mIntent = new Intent(getApplicationContext(), ReceivingActivity.class);

        // bundle object
        Bundle bundle = new Bundle();

        // assigning the key value to the bundle
        bundle.putString("bundle_name", mName);
        bundle.putString("bundle_email", mEamil);

        // attaching the bundle to the intent
        mIntent.putExtras(bundle);

        // starting activity
        startActivity(mIntent);



    }
}
