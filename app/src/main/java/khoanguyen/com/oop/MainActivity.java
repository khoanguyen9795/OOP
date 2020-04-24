package khoanguyen.com.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Animal meo = new Animal("con heo",2);
//        meo.name = "con meo";
//        meo.weight = 2;
        Log.d("BBB",meo.info());
    }
}
