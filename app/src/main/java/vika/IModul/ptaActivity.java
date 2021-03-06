package vika.IModul;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;

import vika.IModul.PTA.akuntansi.ptaakun;
import vika.IModul.PTA.Komunikasi_Psikolog.PTA_MA;
import vika.IModul.PTA.SI.PTASI;
import vika.IModul.PTA.TI.PTA_TI;
import vika.IModul.PTA.manajemen.manajemenpta;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class ptaActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_pta);

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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"imodul@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "FeedBack I-Modul App");
        try {
            startActivity(Intent.createChooser(intent, "How to send mail?"));
        }
        catch (android.content.ActivityNotFoundException ex) { }
    }

    public void ClickAbout(View view){
        redirectActivity(this, AboutActivity.class);
    }
    public void SI(View view) { redirectActivity(this, PTASI.class);}
    public void TI(View view) { redirectActivity(this, PTA_TI.class);}
    public void Manajemen(View view) { redirectActivity(this, manajemenpta.class);}
    public void Akuntansi(View view) { redirectActivity(this, ptaakun.class);}
    public void Psikolog(View view) { redirectActivity(this, PTA_MA.class); }
    public void Komunikasi(View view) { redirectActivity(this, PTA_MA.class); }
}