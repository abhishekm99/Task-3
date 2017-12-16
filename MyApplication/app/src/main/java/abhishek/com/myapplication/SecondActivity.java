package abhishek.com.myapplication;

import android.support.design.widget.Snackbar;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;




public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Snackbar mySnackbar = Snackbar.make(findViewById(R.id.myCoordinatorLayout),R.string.textView2,Snackbar.LENGTH_SHORT);
        mySnackbar.show();
    }
}
