package com.database;

import com.model.Users;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLHelper extends SQLiteOpenHelper {

	Context context;
	String dbname;
	
	public SQLHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub\
		this.context = context;
		this.dbname =name;
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
//		db.execSQL(new Users().CREATE_TABLE_USER);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub, abaikan
	}

}
