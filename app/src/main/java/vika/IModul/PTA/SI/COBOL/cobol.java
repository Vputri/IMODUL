package vika.IModul.PTA.SI.COBOL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import vika.IModul.PTA.SI.Java.Java7;
import vika.IModul.PTA.SI.Java.Java8;
import vika.IModul.PTA.SI.Java.java1;
import vika.IModul.PTA.SI.Java.java10;
import vika.IModul.PTA.SI.Java.java11;
import vika.IModul.PTA.SI.Java.java12;
import vika.IModul.PTA.SI.Java.java13;
import vika.IModul.PTA.SI.Java.java2;
import vika.IModul.PTA.SI.Java.java3;
import vika.IModul.PTA.SI.Java.java4;
import vika.IModul.PTA.SI.Java.java5;
import vika.IModul.PTA.SI.Java.java6;
import vika.IModul.PTA.SI.Java.java9;
import vika.IModul.R;

import static vika.IModul.MainActivity.redirectActivity;

public class cobol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobol);
    }
    public void Pert1(View view) { redirectActivity(this, cobol1.class);}
    public void Pert2(View view) { redirectActivity(this, cobol2.class);}
    public void Pert3(View view) { redirectActivity(this, cobol3.class);}
    public void Pert4(View view) { redirectActivity(this, cobol4.class);}
    public void Pert5(View view) { redirectActivity(this, cobol5.class);}
    public void Pert6(View view) { redirectActivity(this, cobol6.class);}
    public void Pert7(View view) { redirectActivity(this, cobol7.class);}
    public void Pert8(View view) { redirectActivity(this, cobol8.class);}
    public void Pert9(View view) { redirectActivity(this, cobol9.class);}
    public void Pert10(View view) { redirectActivity(this, cobol10.class);}
    public void Pert11(View view) { redirectActivity(this, cobol11.class);}
    public void Pert12(View view) { redirectActivity(this, cobol12.class);}

}