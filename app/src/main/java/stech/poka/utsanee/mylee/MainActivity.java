package stech.poka.utsanee.mylee;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Explicit เพื่อประกาศตัวแปร
    // Access(public private)  Type(int str dub bul)  Name
    private EditText userEditText,passwordEditText;
    private TextView textView;
    private Button button;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initial View คือการผูกตัวแปร กับ View ที่อยู่ Activity
        intialView();
        // Crate Controller
        controller();


    } //Main Method

    private void controller() {
        textView.setOnClickListener(MainActivity.this);
        button.setOnClickListener(MainActivity.this);

    }


    private void intialView() {

        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtRegister);
        button = (Button) findViewById(R.id.btnLogin);
      }

    @Override
    public void onClick(View v) {
        String tag = "SriwattanaV1";

        //For TextView
        if (v == textView) {
            Log.d(tag, "You Click TextView");
                    }
        if (v == button) {
            Log.d(tag, "You Click Button");
            
        }

    }       //  onClick

}   //Main Class นี่คิอ คลาสหลัก


