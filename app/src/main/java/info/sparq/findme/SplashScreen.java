package info.sparq.findme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import info.sparq.findme.R;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Declare View Variables and assign ID's
        Button btnContinue = (Button) findViewById(R.id.btnSplashContinue);
        View.OnClickListener onlyListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // This is the only "action" that happens from the splash screen
                /*
                Pick up here when you are done with laundry
                 */
            Intent intent = new Intent(info.sparq.find, SelectProfile.class);
            }
        };
        btnContinue.setOnClickListener(onlyListener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.splash_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
