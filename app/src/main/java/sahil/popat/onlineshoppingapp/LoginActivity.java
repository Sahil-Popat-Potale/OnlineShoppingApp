package sahil.popat.onlineshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText email, pass;
    Button login;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.password);
        login=findViewById(R.id.loginBtn);

        db= openOrCreateDatabase("LoginDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS login(rollno VARCHAR,name VARCHAR,marks VARCHAR);");
    }
}