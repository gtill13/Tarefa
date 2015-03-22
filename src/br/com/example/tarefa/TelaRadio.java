package br.com.example.tarefa;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TelaRadio extends Activity {

	private RadioGroup Radio;
	private TextView textView;
	
	public void Voltar (View v) {
		finish();
	}
	
	public void clickRadio(View v) {
		
		int idRadBut = Radio.getCheckedRadioButtonId();
		RadioButton radButSelec = (RadioButton) findViewById(idRadBut);
		
		String str = "RadioGroup = "+ radButSelec  .getText();
		
		textView.setText(str);
		
		Toast.makeText( getApplicationContext()
			      , "Foi selecionado: " +radButSelec.getText()
			      , Toast.LENGTH_LONG  ).show();
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_radio);
		
		textView = (TextView)findViewById(R.id.textView2);
		Radio = (RadioGroup) findViewById(R.id.radioGroup1);
		
		clickRadio(this.getCurrentFocus());
	}
}
