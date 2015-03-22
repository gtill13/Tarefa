package br.com.example.tarefa;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TelaSpinner extends Activity {

	private Spinner spinner;
	private List<String> nomes;
	private TextView textView;
	
	public void Voltar (View v) {
		finish();
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_spinner);
		
		spinner  = (Spinner) findViewById(R.id.spinner1);
		textView = (TextView)findViewById(R.id.textView1);
		
		nomes = new ArrayList<String>();
		nomes.add("Opcao 1");
		nomes.add("Opcao 2");
		nomes.add("Opcao 3");
		nomes.add("Opcao 4");
		nomes.add("Opcao 5");
		
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, nomes);
		ArrayAdapter<String> spinnerArrayAdapter = arrayAdapter;
		
		spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
		
		spinner.setAdapter(spinnerArrayAdapter);
		 
		//Método do Spinner para capturar o item selecionado
		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v, int posicao, long id) {
				//pega nome pela posição
				String nome = parent.getItemAtPosition(posicao).toString();
				//imprime um Toast na tela com o nome que foi selecionado
				Toast.makeText(getApplicationContext(), "Nome Selecionado: " + nome, Toast.LENGTH_LONG).show();
				
				clickSpinner(v);
			}
 
			@Override
			public void onNothingSelected(AdapterView<?> parent) {
 
			}
		});
 
		
		clickSpinner(textView.getRootView());
	}
	
	public void clickSpinner(View v) {
		
		String str = "Spinner = " + spinner.getSelectedItem();
		
		textView.setText(str);
	}
}
