package com.bluetooth.communicatorexample.tools.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.bluetooth.communicatorexample.R;
import com.bluetooth.communicatorexample.myDbAdapter;

import java.util.jar.Attributes;

public class login extends AppCompatActivity {
    EditText Name, Pass;
    myDbAdapter helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        Name= (EditText) findViewById(R.id.editName);
        Pass= (EditText) findViewById(R.id.password);

        helper = new myDbAdapter(this);
    }
    public void addUser(View view)
    {
        String t1 = Name.getText().toString();
        String t2 = Pass.getText().toString();
        if(t1.isEmpty() || t2.isEmpty())
        {

            Toast.makeText(getApplicationContext(), "Enter Both Name and Password", Toast.LENGTH_SHORT).show();
        }
        else
        {
            long id = helper.insertData(t1,t2);
            if(id<=0)
            {
                Toast.makeText(getApplicationContext(), "Insertion Unsuccessful", Toast.LENGTH_SHORT).show();

                Name.setText("");
                Pass.setText("");
            } else
            {
                Toast.makeText(getApplicationContext(), "Insertion Successful", Toast.LENGTH_SHORT).show();
                Name.setText("");
                Pass.setText("");
            }
        }
    }
}