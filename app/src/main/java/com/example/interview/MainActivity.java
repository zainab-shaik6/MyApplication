package com.example.interview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText number;
    EditText email;
    Button submit;
    List<EmailNumber> emailNumbers = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.number);
        email = findViewById(R.id.email);
        submit  = findViewById(R.id.submit);


        submit.setOnClickListener(v->{
                emailValidator();
                System.out.println(emailNumbers+"emai");
        });
    }

    public void emailValidator(){

        String emailValidation = email.getText().toString();
        String numberValidation =  number.getText().toString();

        if (!emailValidation.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailValidation).matches() && !numberValidation.isEmpty() && Patterns.PHONE.matcher(numberValidation).matches()) {

            EmailNumber data = new EmailNumber();
            data.setEmail(email.getText().toString());
            data.setNumber(number.getText().toString());
            emailNumbers.add(data);

            Intent intent = new Intent(MainActivity.this, resultActivity.class);
            intent.putParcelableArrayListExtra("emailNumbers", (ArrayList<? extends Parcelable>) emailNumbers);
            startActivity(intent);
        } else {
            Toast.makeText(this, "There are some errors in the form", Toast.LENGTH_SHORT).show();
        }
    }

}