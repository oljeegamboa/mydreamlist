package com.example.oljee.mydreamlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class DreamDescriptionActivity extends AppCompatActivity {

    public static final String KEY_DREAM_DESC = "dream";

    EditText descriptionEditView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dream_description);

        descriptionEditView = (EditText) findViewById(R.id.addDreamEditView);


    }

    public void addDreamToBucket(View view){

        String dreamDescription = descriptionEditView.getText().toString();

        if(!dreamDescription.isEmpty()){

            Intent result = new Intent();
            result.putExtra(KEY_DREAM_DESC,dreamDescription);
            setResult(RESULT_OK, result);
        }
        else{
            setResult(RESULT_CANCELED);
        }
        finish();
    }
}
