package vika.IModul;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import vika.IModul.ATA.MAStatistika;
import vika.IModul.ATA.akuntansi.ataakun;
import vika.IModul.ATA.manajemen.manajemenata;
import vika.IModul.ATA.si.atasi;
import vika.IModul.ATA.ti.atati;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class ataActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ata);

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

    protected void onPause(){
        super.onPause();
        closeDrawer(drawerLayout);
    }

    public void SI1(View view) { redirectActivity(this, atasi.class);}

    public void TI1(View view) { redirectActivity(this, atati.class);}

    public void Manajemen1(View view) { redirectActivity(this, manajemenata.class);}

    public void Akuntansi1(View view) { redirectActivity(this, ataakun.class);}

    public void Komunikasi1(View view) {
        redirectActivity(this, MAStatistika.class);
    }
}