package br.com.example.tarefa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class TelaPrincipal extends Activity {

	public void TelaSpinner( View v ) {
	
		Log.d("TiLL", "TelaPrincipal -> TelaSpinner)");
		
		Intent i = new Intent(getApplicationContext(), TelaSpinner.class);
		startActivity(i);
		
	}
	
	public void TelaRadio( View v ) {
		
		Log.d("TiLL", "TelaPrincipal -> TelaRadio)");
		
		Intent i = new Intent(getApplicationContext(), TelaRadio.class);
		startActivity(i);
		
	}
	
	public void TelaCheckBox( View v ) {
		
		Log.d("TiLL", "TelaPrincipal -> TelaCheckBox)");
		
		Intent i = new Intent(getApplicationContext(), TelaCheckBox.class);
		startActivity(i);
		
	}
	
	public void TelaToggleButton( View v ) {
		
		Log.d("TiLL", "TelaPrincipal -> TelaToggleButton)");
		
		Intent i = new Intent(getApplicationContext(), TelaToggleButton.class);
		startActivity(i);
		
	}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.d("TiLL", "TelaPrincipal -> onCreate(Bundle savedInstanceState)");
		
		setContentView(R.layout.activity_tela_principal);
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d("TiLL", "TelaPrincipal -> onStart)");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d("TiLL", "TelaPrincipal -> onResume");
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d("TiLL", "TelaPrincipal -> onPause");
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d("TiLL", "TelaPrincipal -> onStop");
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d("TiLL", "TelaPrincipal -> onDestroy");
	}
}
