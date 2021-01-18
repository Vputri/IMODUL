package vika.IModul.PTA.manajemen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

public class manajemenpta extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Button btntingkatt1, btntingkatt2, btntingkatt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manajemenpta);
        drawerLayout = findViewById(R.id.drawer_layout);
        btntingkatt2 = (Button) findViewById(R.id.tingkatt2);
        btntingkatt1 = (Button) findViewById(R.id.tingkatt1);
        btntingkatt3 = (Button) findViewById(R.id.tingkatt3);
        btntingkatt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(manajemenpta.this, manajemenpta2.class);
                startActivity(i);
                finish();
            }
        });

        btntingkatt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(manajemenpta.this, manajemenpta3.class);
                startActivity(i);
                finish();
            }
        });

        btntingkatt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(manajemenpta.this, manajemenpta4.class);
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
}