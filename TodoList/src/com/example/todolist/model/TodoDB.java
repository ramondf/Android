package com.example.todolist.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class TodoDB extends SQLiteOpenHelper{

	private static final int VERSION = 2;
	
	public TodoDB(Context context) {
		super(context, "todolist", null, VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE todo"+
				"(_id integer primary key autoincrement,"+
				"texto text not null,"+
				"done integer not null);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		db.execSQL("DROP TABLE IF EXISTS todo");
		onCreate(db);
		
	}

}
