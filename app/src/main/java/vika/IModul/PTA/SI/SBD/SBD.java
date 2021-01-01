package vika.IModul.PTA.SI.SBD;

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

public class SBD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbd);
    }
    public void Pert1(View view)  {
        redirectActivity(this, sbd1.class);
    }
    public void Pert2(View view)   {
        redirectActivity(this, sbd2.class);
    }
    public void Pert3(View view)   {
        redirectActivity(this, sbd3.class);
    }
    public void Pert4(View view)   {
        redirectActivity(this, sbd4.class);
    }
    public void Pert5(View view)   {
        redirectActivity(this, sbd4.class);
    }
    public void Pert6(View view)   {
        redirectActivity(this, sbd6.class);
    }
    public void Pert7(View view)   {
        redirectActivity(this, sbd7.class);
    }
}