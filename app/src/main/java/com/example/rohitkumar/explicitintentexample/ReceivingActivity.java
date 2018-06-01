package com.example.rohitkumar.explicitintentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ReceivingActivity extends AppCompatActivity {

    private TextView mTextViewName, mTextViewEmail , textViewBundleName, textViewBundleEamil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiving);

       //  gettingReference() method call
        gettingReference();

        //  getting the name and email from textInputLayout
        String  mName = getIntent().getStringExtra("name");
        String  mEmail = getIntent().getStringExtra("email");


        // setting the name and email to the textView
        mTextViewName.setText(mName);
        mTextViewEmail.setText(mEmail);

        // Bundle object
        Bundle bundle = getIntent().getExtras();

        // receiving the name and email from bundle using key and storing in local varialble
        String bundleName = bundle.getString("bundle_name");
        String bundleEamil = bundle.getString("bundle_email");

        // setting the name and email to the textView
        textViewBundleName.setText(bundleName);
        textViewBundleEamil.setText(bundleEamil);


    }

    //  gettingReference() method definition
    private void gettingReference() {

        mTextViewName = findViewById(R.id.intentName);
        mTextViewEmail = findViewById(R.id.intentEmail);

        textViewBundleName = findViewById(R.id.bundleName);
        textViewBundleEamil = findViewById(R.id.bundleEmail);
    }
}
