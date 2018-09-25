package dev.milos.actionbarexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        createMenu(menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return menuChoice(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        createMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return menuChoice(item);
    }

    private void createMenu(Menu menu){

        menu.add(0, 0, 0, "Idi na A1");
        menu.add(0,1,1, "Stavka 2");
        menu.add(0,2,2, "Stavka 3");
        menu.add(0,3,3, "Stavka 4");

    }

    private boolean menuChoice(MenuItem item){
        switch (item.getItemId()){
            case 0:
                Intent intent = new Intent(MainActivity.this, Activity1.class);
                startActivity(intent);
                return true;
            case 1:
                Toast.makeText(this, "Izabrali ste: " + item.toString(), Toast.LENGTH_LONG).show();
                return true;
            case 2:
                Toast.makeText(this, "Izabrali ste: " + item.toString(), Toast.LENGTH_LONG).show();
                return true;
            case 3:
                Toast.makeText(this, "Izabrali ste: " + item.toString(), Toast.LENGTH_LONG).show();
                return true;

        }

        return false;
    }
}
