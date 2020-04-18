package fr.wildcodeschool.simpleui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etFirstname = findViewById(R.id.Firstname);
        final EditText etLastname = findViewById(R.id.Lastname);

        Button btSend = findViewById(R.id.Send);
        btSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = etFirstname.getText().toString();
                String lastName = etLastname.getText().toString();

                Toast.makeText(MainActivity.this, "Congratulations " + firstName + " " + lastName, Toast.LENGTH_LONG).show();
            }
        });
    }
}
