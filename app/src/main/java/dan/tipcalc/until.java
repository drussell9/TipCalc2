package dan.tipcalc;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Calendar;


public class until extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        String totalbill = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        int daysLeft = left(month, day);

        String daysUntil = Integer.toString(daysLeft);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(daysUntil);
        setContentView(textView);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_until, menu);
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

    public static int left(int num1, int num2) {

        int feb = 28, mar = 31, apr = 30, may = 2;
        int daysLeftFeb = 0, daysLeftMar = 0, daysLeftApr = 0, daysLeftMay = 0, daysUntilGrad = 0;

        int month = num1, day = num2;

        switch (month) {
            case 1:
                daysLeftFeb = feb - day;
                daysUntilGrad = daysLeftFeb + mar + apr + may;
                break;
            case 2:
                daysLeftMar = mar - day;
                daysUntilGrad = daysLeftMar + apr + may;
                break;
            case 3:
                daysLeftApr = apr - day;
                daysUntilGrad = daysLeftApr + may;
                break;
            case 4:
                daysLeftMay = may - day;
                daysUntilGrad = daysLeftMay;
                break;
        }

        return daysUntilGrad;

    }
}
