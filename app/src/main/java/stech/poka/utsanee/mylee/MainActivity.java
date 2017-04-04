package stech.poka.utsanee.mylee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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


    } //Main Method

    private void intialView() {
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtRegister);
        button = (Button) findViewById(R.id.btnLogin);
    }   //Main Class นี่คิอ คลาสหลัก
