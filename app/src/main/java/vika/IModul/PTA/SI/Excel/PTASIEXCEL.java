package vika.IModul.PTA.SI.Excel;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import vika.IModul.PTA.SI.Windows.PTASIW1;
import vika.IModul.R;

import static vika.IModul.MainActivity.redirectActivity;

public class PTASIEXCEL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptasiexcel);
    }
    public void Pert1(View view)  {
        redirectActivity(this, PTASIE1.class);
    }
    public void Pert2(View view)   {
        redirectActivity(this, PTASIE2.class);
    }
    public void Pert3(View view)   {
        redirectActivity(this, PTASIE3.class);
    }
    public void Pert4(View view)   {
        redirectActivity(this, PTASIE4.class);
    }
    public void Pert5(View view)   {
        redirectActivity(this, PTASIE5.class);
    }
    public void Pert6(View view)   {
        redirectActivity(this, PTASIE6.class);
    }
}