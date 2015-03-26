package br.com.example.tarefa;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class TelaToggleButton extends Activity {

	private TextView textView;
	private ToggleButton toggleButton;
	
	public void Voltar (View v) {
		finish();
	}
	
	public void clickToggleButton (View v) {
		
		String str = "ToggleButton = "+ toggleButton.isChecked();
		
		textView.setText(str);
		
		Toast.makeText( getApplicationContext()
			      , str
			      , Toast.LENGTH_LONG  ).show();
		
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_toggle_button);
		
		textView     = (TextView)    findViewById(R.id.textView3);
		toggleButton = (ToggleButton)findViewById(R.id.toggleButton1);
		
		clickToggleButton(this.getCurrentFocus());
	}
}
