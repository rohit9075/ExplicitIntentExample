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


        gettingReference();

        String  mName = getIntent().getStringExtra("name");
        String  mEmail = getIntent().getStringExtra("email");


        mTextViewName.setText(mName);
        mTextViewEmail.setText(mEmail);

        Bundle bundle = getIntent().getExtras();
        String bundleName = bundle.getString("bundle_name");
        String bundleEamil = bundle.getString("bundle_email");

        textViewBundleName.setText(bundleName);
        textViewBundleEamil.setText(bundleEamil);


    }

    private void gettingReference() {
        
        mTextViewName = findViewById(R.id.intentName);
        mTextViewEmail = findViewById(R.id.intentEmail);

        textViewBundleName = findViewById(R.id.bundleName);
        textViewBundleEamil = findViewById(R.id.bundleEmail);
    }
}
