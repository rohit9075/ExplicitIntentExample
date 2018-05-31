package com.example.rohitkumar.explicitintentexample;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String mName, mEamil;
    private TextInputEditText  mTextInputEditTextName, mTextInputEditTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void gettingReference() {
        mTextInputEditTextName = findViewById(R.id.name);
        mTextInputEditTextEmail = findViewById(R.id.email);
    }

    public void sendByIntent(View view) {
        gettingReference();
        gettingValue();

        Intent mIntent = new Intent(getApplicationContext(), ReceivingActivity.class);
        mIntent.putExtra("name", mName);
        mIntent.putExtra("email", mEamil);
        startActivity(mIntent);
    }

    private void gettingValue() {
        mName = mTextInputEditTextName.getText().toString();
        mEamil = mTextInputEditTextEmail.getText().toString();
    }

    public void sendByBundle(View view) {
        gettingReference();
        gettingValue();

        Intent mIntent = new Intent(getApplicationContext(), ReceivingActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString("bundle_name", mName);
        bundle.putString("bundle_email", mEamil);

        mIntent.putExtras(bundle);

        startActivity(mIntent);



    }
}
