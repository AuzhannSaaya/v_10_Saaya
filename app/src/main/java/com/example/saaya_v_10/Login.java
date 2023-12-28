package com.example.saaya_v_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Login extends AppCompatActivity {
    EditText editLogin, editPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    EditText editLogin = findViewById(R.id.editLogin);
    EditText editPass = findViewById(R.id.editPass);

    editLogin.setOnFocusChangeListener(new View.OnFocusChangeListener() {
        @Override
        public void onFocusChange(View view, boolean b) {
            if (b){
                //когда Edit получает фокус
                editLogin.setTextColor(Color.BLACK); // устанавливаем черный цвет текста
            }
            else {
                if (editLogin.getText().length() == 0){
                    editLogin.setTextColor(Color.GRAY);
                }
            }
        }
    });
    }
    public void startPersonalArea(View v){
        Intent intent = new Intent(this, PersonalArea.class);
        startActivity(intent);
    }
}

public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "myapp.db";
    private static final int DATABASE_VERSION = 1;

    // Таблица для отслеживания шагов
    private static final String TABLE_USERS = "users";
    private static final String COLUMN_LOGIN = "login";
    private static final String COLUMN_PASSWORD = "password";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Создание таблицы для отслеживания шагов
        String createTableQuery = "CREATE TABLE " + TABLE_USERS + " (" +
                COLUMN_LOGIN + " TEXT," +
                COLUMN_PASSWORD + " INTEGER)";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        onCreate(db);
    }
}