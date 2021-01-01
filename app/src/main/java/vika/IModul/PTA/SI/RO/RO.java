package vika.IModul.PTA.SI.RO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import vika.IModul.PTA.SI.matlan.matlan1;
import vika.IModul.PTA.SI.matlan.matlan2;
import vika.IModul.PTA.SI.matlan.matlan3;
import vika.IModul.PTA.SI.matlan.matlan4;
import vika.IModul.PTA.SI.matlan.matlan5;
import vika.IModul.PTA.SI.matlan.matlan6;
import vika.IModul.PTA.SI.matlan.matlan7;
import vika.IModul.R;

import static vika.IModul.MainActivity.redirectActivity;

public class RO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ro);
    }
    public void Pert1(View view) { redirectActivity(this, RO1.class); }
    public void Pert2(View view) { redirectActivity(this, RO2.class); }
    public void Pert3(View view) { redirectActivity(this, RO3.class); }
    public void Pert4(View view) { redirectActivity(this, RO4.class); }
    public void Pert5(View view) { redirectActivity(this, RO5.class); }
    public void Pert6(View view) { redirectActivity(this, RO6.class); }
    public void Pert7(View view) { redirectActivity(this, RO7.class); }
    public void Pert8(View view) { redirectActivity(this, RO8.class); }
    public void Pert9(View view) { redirectActivity(this, RO9.class); }
}