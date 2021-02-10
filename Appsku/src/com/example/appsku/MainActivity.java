package com.example.appsku;

import android.support.v7.app.ActionBarActivity;

import com.database.SQLHelper;
import com.model.Users;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	private Button btnSignin;
	private Button btnSignup;
	private Button btnBackSignin;
	private Button btnBackSignup;
	private Button btnSimpanSignin;
	private Button btnSimpanSignup;
	private EditText txtUsernameSignin;
	private EditText txtUsernameSignup;
	private EditText txtPasswordSignin;
	private EditText txtPasswordSignup;
	private SQLHelper db;
	private LinearLayout laySignin;
	private LinearLayout laySignup;
	private LinearLayout layParent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//komentar tak usah diketik, ini penjelasan bagian saja
		//inisialisasi sqlite
		db = new SQLHelper(MainActivity.this, new Users().Database, null, 1);
		
		//inisialisasi layout]
		layParent = (LinearLayout) findViewById(R.id.layParent);
		laySignin = (LinearLayout) findViewById(R.id.frmSigninLayout);
		laySignup = (LinearLayout) findViewById(R.id.frmSignupLayout);
		
		
		txtUsernameSignin = (EditText) findViewById(R.id.inUsernameSignin);
		txtUsernameSignup = (EditText) findViewById(R.id.inUsernameSignup);
		txtPasswordSignin = (EditText) findViewById(R.id.inPasswordSignin);
	    txtPasswordSignup = (EditText) findViewById(R.id.inPasswordSignup);

		btnSignin = (Button) findViewById(R.id.btnSignin);
		btnSignup = (Button) findViewById(R.id.btnSignup);
		
		btnSimpanSignin = (Button) findViewById(R.id.btnSimpanSignin);
		btnSimpanSignup = (Button) findViewById(R.id.btnSimpanSignup);
		
		btnBackSignin = (Button) findViewById(R.id.btnBackSignin);
		btnBackSignup = (Button) findViewById(R.id.btnBackSignup);
		
		
		
		btnSignin.setOnClickListener(this);
		btnSignup.setOnClickListener(this);	
		
		btnBackSignin.setOnClickListener(this);
		btnBackSignup.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnSignin:
		    layParent.setVisibility(View.GONE);
		    laySignup.setVisibility(View.GONE);
		    laySignin.setVisibility(View.VISIBLE);
			break;
        case R.id.btnSignup:
        	layParent.setVisibility(View.GONE);
		    laySignin.setVisibility(View.GONE);
		    laySignup.setVisibility(View.VISIBLE);
			break;
        case R.id.btnSimpanSignin:
        	layParent.setVisibility(View.VISIBLE);
		    laySignin.setVisibility(View.GONE);
		    laySignup.setVisibility(View.GONE);
			
			break;
        case R.id.btnBackSignup:
        	layParent.setVisibility(View.VISIBLE);
		    laySignin.setVisibility(View.GONE);
		    laySignup.setVisibility(View.GONE);
			break;
			
		default:
			break;
		}
		
	}
}
