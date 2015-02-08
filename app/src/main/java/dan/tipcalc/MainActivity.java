package dan.tipcalc;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE ="dan.calc.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    // called when user presses the calc button
    // Calculates 20%
    public void calculate20(View view){
        //calculate input
        Intent intent = new Intent(this, Calc20.class);
        EditText totalBill = (EditText)
                findViewById(R.id.total_bill);
        String num = totalBill.getText().toString();

        if(totalBill.getText().toString().equals(null) || totalBill.getText().toString().equals("")){
            Toast.makeText(this,"Please enter something into the text box.", Toast.LENGTH_LONG).show();
        }


        intent.putExtra(EXTRA_MESSAGE, num);
        startActivity(intent);
    }

    public void calculate15(View view){

        Intent intent = new Intent(this, calc15.class);
        EditText totalBill = (EditText)
                    findViewById(R.id.total_bill);
        String num15 = totalBill.getText().toString();

        if(totalBill.getText().toString().equals(null) || totalBill.getText().toString().equals("")){
            Toast.makeText(this,"Please enter something into the text box.", Toast.LENGTH_LONG).show();
        }

        intent.putExtra(EXTRA_MESSAGE, num15);
        startActivity(intent);



    }

    public void calculate10(View view){

        String num10;
        Intent intent = new Intent(this, calc10.class);

            EditText totalBill = (EditText)
                    findViewById(R.id.total_bill);
            num10 = totalBill.getText().toString();

            if (totalBill.getText().toString().equals(null) || totalBill.getText().toString().equals("")) {
                Toast.makeText(this, "Please enter something into the text box.", Toast.LENGTH_LONG).show();
            }
            else {
                intent.putExtra(EXTRA_MESSAGE, num10);
                startActivity(intent);
            }



    }

    public void remain(View view){

        Intent intent = new Intent(this, until.class);
        EditText totalBill = (EditText) findViewById(R.id.total_bill);

        String remain = totalBill.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, remain);
        startActivity(intent);

    }

}
