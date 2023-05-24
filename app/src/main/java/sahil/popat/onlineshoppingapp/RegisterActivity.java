package sahil.popat.onlineshoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.database.sqlite.SQLiteDatabase;

public class RegisterActivity extends AppCompatActivity {
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        db= openOrCreateDatabase("LoginDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS login(name VARCHAR,email VARCHAR,password VARCHAR);");
    }
}