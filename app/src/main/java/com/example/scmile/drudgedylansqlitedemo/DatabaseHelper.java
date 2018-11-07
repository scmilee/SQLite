package com.example.scmile.drudgedylansqlitedemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.FileReader;


public class DatabaseHelper extends SQLiteOpenHelper {

    public static  final String NAME = "students";
    public static  final String ID = "id";
    public static  final String FIRST = "first";
    public static  final String LAST = "last";
    public static  final String GRADE = "grade";

    public static  final String DATABASE_NAME = "studentBase.db";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase database = this.getWritableDatabase();

    }

    public boolean insertData(String first, String last, String grade){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(FIRST, first);
        values.put(LAST, last);
        values.put(GRADE, grade);

        db.insert(NAME, null, values);
        
        return true;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
