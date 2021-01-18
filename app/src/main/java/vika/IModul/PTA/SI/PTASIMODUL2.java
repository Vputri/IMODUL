package vika.IModul.PTA.SI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.PTA.Komunikasi_Psikolog.PTA_MA;
import vika.IModul.PTA.SI.COBOL.cobol;
import vika.IModul.PTA.SI.Java.JAVA;
import vika.IModul.PTA.SI.matif.matif;
import vika.IModul.PTA.SI.matlan.matlan;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class PTASIMODUL2 extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptasimodul2);
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

    public void TPT(View view) {
        Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();
    }
    public void PPOB(View view) { redirectActivity(this, cobol.class);}
    public void MI(View view) { redirectActivity(this, matif.class);}
    public void ML(View view) { redirectActivity(this, matlan.class);}
    public void AP(View view) {redirectActivity(this, JAVA.class);}
    public void LA(View view) { redirectActivity(this, LogikaAlgoritma.class);}
    public void TPT1(View view) {
        Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();
    }
    public void ODS(View view) {
        redirectActivity(this, PTA_MA.class);
    }
    public void Sta(View view) {
        redirectActivity(this, PTA_MA.class);
    }
}