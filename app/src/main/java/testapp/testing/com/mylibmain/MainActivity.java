package testapp.testing.com.mylibmain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import testapp.testing.com.mylibrarymain.MyMethods;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyMethods.callMe(this);

    }
}
