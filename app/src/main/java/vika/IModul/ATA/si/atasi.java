package vika.IModul.ATA.si;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import vika.IModul.ATA.atasitingk1;
import vika.IModul.ATA.atasitingk2;
import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.PTA.SI.PTASI;
import vika.IModul.PTA.SI.PTASIMODUL;
import vika.IModul.PTA.SI.PTASIMODUL2;
import vika.IModul.PTA.SI.PTASIMODUL3;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class atasi extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Button btnkat1, btnkat2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atasi);
        drawerLayout = findViewById(R.id.drawer_layout);
        btnkat2 = (Button) findViewById(R.id.kat2);
        btnkat1 = (Button) findViewById(R.id.kat1);
        btnkat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atasi.this, atasitingk2.class);
                startActivity(i);
                finish();
            }
        });

        btnkat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atasi.this, atasitingk1.class);
                startActivity(i);
                finish();
            }
        });
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
}