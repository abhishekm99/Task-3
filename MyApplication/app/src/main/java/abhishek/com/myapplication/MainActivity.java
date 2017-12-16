package abhishek.com.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        CharSequence text= "Application Has Started!";
        int Duration= Toast.LENGTH_SHORT;

        Toast toast= Toast.makeText(context,text,Duration);
        toast.show();

        Button btn = (Button) findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }



}
