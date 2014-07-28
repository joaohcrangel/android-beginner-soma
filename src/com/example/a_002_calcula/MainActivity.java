package com.example.a_002_calcula;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private EditText value1;
	private EditText value2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        value1 = (EditText)findViewById(R.id.editValue1);
        value2 = (EditText)findViewById(R.id.editValue2);
        
    }
    
    public void somar(View v){
    	
    	String svalue1 = value1.getText().toString();
    	String svalue2 = value2.getText().toString();
    	
    	if(!svalue1.equals("") && !svalue2.equals("")){
    	
	    	Integer number1 = null;
	    	Integer number2 = null;
	    	
	    	try{
		    	number1 = Integer.parseInt(svalue1);
		    	number2 = Integer.parseInt(svalue2);
	    	}catch(NumberFormatException e){
	    		
	    		Toast.makeText(getApplicationContext(), "Informe apenas números!", Toast.LENGTH_LONG).show();
	    		
	    	}
	    	
	    	Toast.makeText(getApplicationContext(), "A soma é: "+String.valueOf(number1 + number2), Toast.LENGTH_LONG).show();
	    	
    	}else{
    		
    		Toast.makeText(getApplicationContext(), "Digite os valores!", Toast.LENGTH_LONG).show();
    		
    	}
    }
    
    public void limpar(View v){
    	
    	value1.setText("");
    	value2.setText("");
    	
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
