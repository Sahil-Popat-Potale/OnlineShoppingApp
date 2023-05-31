package sahil.popat.onlineshoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    TextView oldUser;
    EditText Name, Email, Pass, ConfirmPass;
    Button Register;
    private String insert;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        oldUser=findViewById(R.id.oldUser);
        oldUser.setOnClickListener(v -> startActivity(new Intent(RegisterActivity.this,
                LoginActivity.class)));

        db= openOrCreateDatabase("LoginDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS login(name VARCHAR,email VARCHAR,password VARCHAR,confirmpass VARCHAR);");

        Register=findViewById(R.id.register);
        Register.setOnClickListener(v -> add());

    }

    private void add() {

    }
}