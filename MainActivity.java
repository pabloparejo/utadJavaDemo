package com.utad.prueba;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Aquí hacemos las pruebas
        /*String[] arr = {""," "};
        int MAX_LENGTH = new Integer(8);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i == MAX_LENGTH; i++) {
            for (int j=0; j==MAX_LENGTH; j++) {
                if ((i+j) % 2 == 0){
                    sb.append(' ');
                }else{
                    sb.append('');
                }
                sb.append("\r\n");
            }
        }
        Log.v("utad", sb.toString());*/
        
        Person guy = new Person("guy");
        Person lady = new Person("lady");
        Trip hawaiiTrip = new Trip("Hawaii");
        
        hawaiiTrip.addAttendant(guy);
        hawaiiTrip.addAttendant(lady);
        
        hawaiiTrip.printAttendees();
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
