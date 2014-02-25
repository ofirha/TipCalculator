package il.ac.huji.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
        final EditText billAmount = (EditText) findViewById(R.id.edtBillAmount);
        final CheckBox checkRound = (CheckBox) findViewById(R.id.chkRound);
        final Button calcButton = (Button) findViewById(R.id.btnCalculate);
		final TextView textTip = (TextView) findViewById(R.id.txtTipResult);
		
		calcButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
				double tip = Double.parseDouble(billAmount.getText().toString())*0.12;
				if(checkRound.isChecked()){
					textTip.setText("Tip: $"+(int)Math.round(tip));
				}
				else{
					textTip.setText("Tip: $"+tip);
				}

				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tip_calculator, menu);
        return true;
    }
    
}
