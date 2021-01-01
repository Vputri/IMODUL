package vika.IModul.PTA.SI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.PTA.SI.Excel.PTASIEXCEL;
import vika.IModul.PTA.SI.Qbasic.PTA_AP;
import vika.IModul.PTA.SI.Windows.PTAWin;
import vika.IModul.R;
import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class PTASIMODUL extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptamodulsi);
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

    public void PTSI(View view) {redirectActivity(this, PTAWin.class); }
    public void PTI(View view) {redirectActivity(this, PTAWin.class); }
    public void PSK(View view) {redirectActivity(this, PTAWin.class); }
    public void KK(View view) { redirectActivity(this, PTASIEXCEL.class);}
    public void PAK(View view) { redirectActivity(this, PTASIEXCEL.class);}
    public void PKP(View view) { redirectActivity(this, PTASIEXCEL.class);}
    public void PK(View view) { redirectActivity(this, PTASIEXCEL.class);}
    public void PK1(View view) { redirectActivity(this, PTASIEXCEL.class);}
    public void PAKP(View view) { redirectActivity(this, PTASIEXCEL.class);}
    public void PAK1(View view) { redirectActivity(this, PTASIEXCEL.class);}
    public void AP1(View view) { redirectActivity(this, PTA_AP.class); }
    public void PAP1(View view) { redirectActivity(this, PTA_AP.class);}
    public void PAP2(View view) { redirectActivity(this, PTA_AP.class);}
    public void PAP3(View view) { redirectActivity(this, PTA_AP.class);}
    public void PAP4(View view) { redirectActivity(this, PTA_AP.class);}
}