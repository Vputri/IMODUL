package vika.IModul.PTA.SI.matlan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.PTA.Komunikasi_Psikolog.MA_Pert1;
import vika.IModul.PTA.Komunikasi_Psikolog.MA_Pert2;
import vika.IModul.PTA.Komunikasi_Psikolog.MA_Pert3;
import vika.IModul.PTA.Komunikasi_Psikolog.MA_pert4;
import vika.IModul.PTA.Komunikasi_Psikolog.MA_pert5;
import vika.IModul.PTA.Komunikasi_Psikolog.MA_pert6;
import vika.IModul.PTA.Komunikasi_Psikolog.MA_pert7;
import vika.IModul.PTA.SI.matif.matif1;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class matlan extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matlan);
        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view){
        openDrawer(drawerLayout);
    }

    public void ClickLogo(View view){
        closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){
        redirectActivity(this, MainActivity.class);
    }

    public void ClickFeedBack(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"ilab@gunadarma.ac.id"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "FeedBack I-Modul App");
        try {
            startActivity(Intent.createChooser(intent, "How to send mail?"));
        }
        catch (android.content.ActivityNotFoundException ex) { }
    }

    public void ClickAbout(View view){
        redirectActivity(this, AboutActivity.class);
    }

    protected void onPause(){
        super.onPause();
        closeDrawer(drawerLayout);
    }

    public void matlanPert1(View view) { redirectActivity(this, matlan1.class); }
    public void matlanPert2(View view) { redirectActivity(this, matlan2.class); }
    public void matlanPert3(View view) { redirectActivity(this, matlan3.class); }
    public void matlanPert4(View view) { redirectActivity(this, matlan4.class); }
    public void matlanPert5(View view) { redirectActivity(this, matlan5.class); }
    public void matlanPert6(View view) { redirectActivity(this, matlan6.class); }
    public void matlanPert7(View view) { redirectActivity(this, matlan7.class); }
}