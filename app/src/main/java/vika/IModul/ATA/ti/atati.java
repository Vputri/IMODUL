package vika.IModul.ATA.ti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.ATA.si.jav;
import vika.IModul.ATA.ti.C.c;
import vika.IModul.ATA.ti.TBO.tbo;
import vika.IModul.ATA.ti.fortan.fortan;
import vika.IModul.ATA.ti.matif.maatif;
import vika.IModul.ATA.ti.openoffice.oo;
import vika.IModul.ATA.ti.pascal.pascal;
import vika.IModul.ATA.ti.python.python;
import vika.IModul.ATA.ti.statistika.tisat;
import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class atati extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atati);
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
    public void KTI(View view) { redirectActivity(this, oo.class);}

    public void Daskom(View view) { redirectActivity(this, c.class);}

    public void PDKP(View view) { redirectActivity(this, pascal.class);}

    public void Matif(View view) { redirectActivity(this, maatif.class);}

    public void PAP(View view) { redirectActivity(this, python.class);}

    public void PBOIA(View view) { redirectActivity(this, jav.class);}

    public void statistika(View view) { redirectActivity(this, tisat.class);}

    public void RK(View view) { redirectActivity(this, fortan.class);}

    public void TBO(View view) { redirectActivity(this, tbo.class);}

}