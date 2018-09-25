package dev.milos.actionbarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        ImageView imageView = (ImageView) findViewById(R.id.imageViewDroid);
        Button btnPrikazi = (Button) findViewById(R.id.btnPrikaziPoruku);

        registerForContextMenu(imageView);

        btnPrikazi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( getApplicationContext(), "Kliknuli ste dugme.", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        menu.setHeaderTitle("Opcije:");
        menu.setHeaderIcon(R.drawable.ic_launcher_background);
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.test1:
                Toast.makeText(this, "Kliknuta opcija 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.test2:
                Toast.makeText(this, "Kliknuta opcija 2", Toast.LENGTH_SHORT).show();
                return true;

                default:

                    return false;

        }


    }
}
