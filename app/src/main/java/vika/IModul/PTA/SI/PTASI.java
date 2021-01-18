package vika.IModul.PTA.SI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.R;
import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class PTASI extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Button btntingkat1, btntingkat2, btntingkat3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptasi);

        drawerLayout = findViewById(R.id.drawer_layout);
        btntingkat2 = (Button) findViewById(R.id.tingkat2);
        btntingkat1 = (Button) findViewById(R.id.tingkat1);
        btntingkat3 = (Button) findViewById(R.id.tingkat3);
        btntingkat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PTASI.this, PTASIMODUL.class);
                startActivity(i);
                finish();
            }
        });

        btntingkat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PTASI.this, PTASIMODUL2.class);
                startActivity(i);
                finish();
            }
        });

        btntingkat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PTASI.this, PTASIMODUL3.class);
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