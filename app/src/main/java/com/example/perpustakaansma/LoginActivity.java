package com.example.perpustakaansma;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends Activity implements View.OnClickListener {

    private TextInputLayout username;
    private TextInputLayout password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.et_user);
        password = findViewById(R.id.et_password);
        login = findViewById(R.id.btn_login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                login();
                break;
        }
    }

    public void login(){
        if (!validateUser() || !validatePassword()){
            return;
        }

        String users = username.getEditText().getText().toString().trim();
        String passwords = password.getEditText().getText().toString().trim();
        if (users.equalsIgnoreCase("imamfh") && passwords.equals("anjay")){
            Toast.makeText(getApplicationContext(), "LOGIN BERHASIL", Toast.LENGTH_SHORT).show();
            Intent in = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(in);
            finish();
        } else{
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
            builder.setMessage("Username atau password anda salah!")
                    .setNegativeButton("Ulang",null).create().show();
        }

    }

    private boolean validateUser(){
        String users = username.getEditText().getText().toString().trim();
        if (users.isEmpty()) {
            username.setError("Username tidak boleh kosong");
            return false;
        } else {
            username.setError(null);
            return true;
        }
    }

    private boolean validatePassword(){
        String passwords = password.getEditText().getText().toString().trim();
        if (passwords.isEmpty()) {
            password.setError("Silahkan isi password");
            return false;
        } else {
            password.setError(null);
            return true;
        }
    }

}