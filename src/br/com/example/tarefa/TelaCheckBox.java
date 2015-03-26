package br.com.example.tarefa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class TelaCheckBox extends Activity {

	private TextView textView;
	private CheckBox checkBox;
	
	public void Voltar (View v) {
		finish();
	}
	
	public void clickCheckBox( View v ) {
		String str = "Check Box = "+ checkBox.isChecked();
		
		textView.setText(str);
		
		Toast.makeText( getApplicationContext()
			      , str
			      , Toast.LENGTH_LONG  ).show();	
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_check_box);
		
		textView = (TextView)findViewById(R.id.textView4);
		checkBox = (CheckBox)findViewById(R.id.checkBox1);
		
		clickCheckBox(this.getCurrentFocus());
	}
}
