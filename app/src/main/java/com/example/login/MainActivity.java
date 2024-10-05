package com.example.login;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText user, pass;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.bt);
        user = (EditText) findViewById(R.id.et1);
        pass = (EditText) findViewById(R.id.ep);
        tv=(TextView) findViewById(R.id.tv4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = user.getText().toString();
                String password = pass.getText().toString();

                if (username.equals("Ankita") && password.equals("Ankita234"))
                {
                    // Successful login, navigate to another activity
                    Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                    startActivity(intent);
                    finish();
                } else
                {
                    // Unsuccessful login
                    Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i1=new Intent(MainActivity.this,MainActivity4.class);
                startActivity(i1);
                finish();
            }
        });
    }

}
