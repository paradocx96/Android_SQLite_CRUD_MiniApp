package com.sliit.madtutorial5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button selectAll, add, delete, update, signIn;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectAll = (Button) findViewById(R.id.btn_selectAll);
        add = (Button) findViewById(R.id.btn_add);
        delete = (Button) findViewById(R.id.btn_delete);
        update = (Button) findViewById(R.id.btn_update);
        signIn = (Button) findViewById(R.id.btn_signIn);
        username = (EditText) findViewById(R.id.input_username);
        password = (EditText) findViewById(R.id.input_password);
    }
}