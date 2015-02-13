package dan.tipcalc;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Calc20 extends ActionBarActivity {

    private double num1;
    private String tipS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc20);

        Intent intent = getIntent();
        String totalbill = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        double num = Double.parseDouble(totalbill);
        double tip = calc(num);
        tipS = Double.toString(tip);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(tipS);
        setContentView(textView);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calc20, menu);
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

    public static double calc(double num1) {
        double result = 0;

        result = num1 * .20;
        return result;
    }
}
