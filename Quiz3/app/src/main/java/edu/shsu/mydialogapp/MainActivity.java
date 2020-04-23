package edu.shsu.mydialogapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openDialog();
            }
        });
    }

    public void openDialog(){
        MyDialog myDialog = new MyDialog();
        myDialog.show(getSupportFragmentManager(), "Quiz 3");
    }
}
