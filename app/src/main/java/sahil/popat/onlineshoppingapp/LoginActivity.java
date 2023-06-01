package sahil.popat.onlineshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    TextView register;
    EditText email, pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.password);
        setText();
        login=findViewById(R.id.loginBtn);
        login.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this,
                ShopActivity.class)));

        register=findViewById(R.id.registerNow);
        register.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this,
                RegisterActivity.class)));
    }

    private void setText() {
        try {
            String mail=email.getText().toString();


        } catch (NullPointerException e){
            Toast.makeText(this, "Input field is empty", Toast.LENGTH_SHORT).show();
        }
    }
}