package edu.shsu.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GetName extends Activity implements android.view.View.OnClickListener{

    android.widget.EditText name;
    android.widget.Button button;

    public void onClick(View arg0) {
        Intent myIntent = new Intent(this,Lab1Activity.class);
        myIntent.putExtra("uname",name.getText().toString());
        this.startActivity(myIntent);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.name_getter);
        name = this.findViewById(R.id.nameInst);
        button = this.findViewById(R.id.nameSubmit);
        button.setOnClickListener(this);
    }


}
