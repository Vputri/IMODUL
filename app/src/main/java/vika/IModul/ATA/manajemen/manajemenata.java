package vika.IModul.ATA.manajemen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import vika.IModul.ATA.MAStatistika;
import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class manajemenata extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manajemenata);
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

    public void KAP(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void KAP1(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void KP(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void statis(View view) { redirectActivity(this, MAStatistika.class);}
    public void statis2(View view) { redirectActivity(this, MAStatistika.class);}
    public void SP(View view) { redirectActivity(this, MAStatistika.class);}
    public void SP2(View view) { redirectActivity(this, MAStatistika.class);}
    public void SP3(View view) { redirectActivity(this, MAStatistika.class);}
    public void RO2(View view) { redirectActivity(this, man_riset2.class);}
    public void RO3(View view) { redirectActivity(this, man_riset3.class);}
}