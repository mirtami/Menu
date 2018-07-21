package com.mirta.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){

        menu.add("Помощь");
        menu.add("О приложении");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        TextView infoTextView = (TextView) findViewById(R.id.TextView);
        // Операции для выбранного пункта меню
        switch (item.getItemId()){
            case R.id.add:
                infoTextView.setText("Добавить");
                return true;
            case R.id.delete:
                infoTextView.setText("Удалить");
                return true;
            case R.id.info:
                infoTextView.setText("Информация");
                return true;
        }
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        return false;
    }
}
