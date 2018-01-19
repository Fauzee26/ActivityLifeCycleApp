package fauzi.hilmy.activitylifecycleapp;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CoordinatorLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //onCreate
        Log.d("lifecycle", "proses onCreate");

        //message Pada Android
        //1. Toast (Short, long)
        //2. Snackbar

        Toast.makeText(getApplicationContext(), "Halo ini toast short", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Halo ini toast long", Toast.LENGTH_LONG).show();

        main = (CoordinatorLayout)findViewById(R.id.main);

        //snackbar
        Snackbar snackbar = Snackbar.make(main, "Hello, ini Snackbar", Snackbar.LENGTH_LONG);
        //menampilkan snackbar
        snackbar.show();

    }

    //onStart

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "proses onStart");
    }


    //onResume

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "proses onResume");
    }

    //onPause

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "proses onPause");
    }

    //onRestart

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle", "proses onRestart");
    }


    //onDestroy

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "proses onDestroy");
    }
}
