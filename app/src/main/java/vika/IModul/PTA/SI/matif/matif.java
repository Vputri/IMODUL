package vika.IModul.PTA.SI.matif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import vika.IModul.PTA.SI.Windows.PTASIW1;
import vika.IModul.PTA.SI.Windows.PTASIW2;
import vika.IModul.PTA.SI.Windows.PTASIW3;
import vika.IModul.PTA.SI.Windows.PTASIW4;
import vika.IModul.PTA.SI.Windows.PTASIW6;
import vika.IModul.PTA.SI.Windows.PTASIW7;
import vika.IModul.R;

import static vika.IModul.MainActivity.redirectActivity;

public class matif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matif);
    }


    public void Pert1(View view) { redirectActivity(this, matif1.class); }
    public void Pert2(View view)   {
        redirectActivity(this, matif2.class);
    }
    public void Pert3(View view)   {
        redirectActivity(this, matif3.class);
    }
    public void Pert4(View view)   {
        redirectActivity(this, matif4.class);
    }
    public void Pert5(View view)   {
        redirectActivity(this, matif4.class);
    }
    public void Pert6(View view)   {
        redirectActivity(this, matif6.class);
    }
}