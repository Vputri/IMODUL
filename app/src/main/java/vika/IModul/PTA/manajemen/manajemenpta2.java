package vika.IModul.PTA.manajemen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.PTA.Komunikasi_Psikolog.PTA_MA;
import vika.IModul.PTA.SI.RO.RO;
import vika.IModul.PTA.manajemen.anggaran.anggaran;
import vika.IModul.PTA.manajemen.manke.manke;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class manajemenpta2 extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manajemenpta2);
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

    public void ED(View view) { redirectActivity(this, PTA_MA.class);}
    public void EA(View view) { redirectActivity(this, PTA_MA.class);}
    public void DA(View view) { redirectActivity(this, PTA_MA.class);}
    public void DD(View view) { redirectActivity(this, PTA_MA.class);}
    public void DF(View view) { redirectActivity(this, PTA_MA.class);}
    public void DD1(View view) { redirectActivity(this, anggaran.class);}
    public void DF1(View view) { redirectActivity(this, anggaran.class);}
    public void DA1(View view) { redirectActivity(this, anggaran.class);}
    public void EA1(View view) { redirectActivity(this, RO.class);}
    public void DA2(View view) { redirectActivity(this, manke.class);}
    public void DD2(View view) { redirectActivity(this, manke.class);}
    public void DF2(View view) { redirectActivity(this, manke.class);}
}