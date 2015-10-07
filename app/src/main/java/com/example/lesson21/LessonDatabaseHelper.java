package com.example.lesson21;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by atsuto.yamada on 2015/10/07.
 */
public class LessonDatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "lesson.db";

    // TODO DBヘルパーの実装が終わったらfalseをtrueにしてください
    public static final boolean LESSON_DONE = false;

    public LessonDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // アプリでこのクラスが初めて使われる時に呼ばれます。
        // TODO create tableしてみましょう
        // TODO create table user (id integer PRIMARY KEY AUTOINCREMENT, name text);


        // TODO ここまで
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // 今回は無視します（DATABASE_VERSIONが上がると呼ばれます）
    }

    public void insert(String name) {
        SQLiteDatabase db = getWritableDatabase();
        // TODO insert してみましょう


        // TODO ここまで
        db.close();
    }

    public List<String> selectAll() {
        List<String> list = new ArrayList<String>();
        SQLiteDatabase db = getWritableDatabase();
        // TODO select all してみましょう (動作確認後、orderByの動作確認も行う）


        // TODO ここまで
        db.close();
        return list;
    }

}
