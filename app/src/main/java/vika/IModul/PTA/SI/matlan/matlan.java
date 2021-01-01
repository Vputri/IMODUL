package vika.IModul.PTA.SI.matlan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import vika.IModul.PTA.Komunikasi_Psikolog.MA_Pert1;
import vika.IModul.PTA.Komunikasi_Psikolog.MA_Pert2;
import vika.IModul.PTA.Komunikasi_Psikolog.MA_Pert3;
import vika.IModul.PTA.Komunikasi_Psikolog.MA_pert4;
import vika.IModul.PTA.Komunikasi_Psikolog.MA_pert5;
import vika.IModul.PTA.Komunikasi_Psikolog.MA_pert6;
import vika.IModul.PTA.Komunikasi_Psikolog.MA_pert7;
import vika.IModul.PTA.SI.matif.matif1;
import vika.IModul.R;

import static vika.IModul.MainActivity.redirectActivity;

public class matlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matlan);
    }

    public void Pert1(View view) { redirectActivity(this, matlan1.class); }
    public void Pert2(View view) { redirectActivity(this, matlan2.class); }
    public void Pert3(View view) { redirectActivity(this, matlan3.class); }
    public void Pert4(View view) { redirectActivity(this, matlan4.class); }
    public void Pert5(View view) { redirectActivity(this, matlan5.class); }
    public void Pert6(View view) { redirectActivity(this, matlan6.class); }
    public void Pert7(View view) { redirectActivity(this, matlan7.class); }
}