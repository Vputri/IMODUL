package vika.IModul.PTA.akuntansi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.PTA.akuntansi.akbi.akbi;
import vika.IModul.PTA.akuntansi.aklan.aklan;
import vika.IModul.PTA.akuntansi.audit.audit;
import vika.IModul.PTA.akuntansi.pajak.pajak;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class ptaakun3 extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ptaakun3);
        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view){
        openDrawer(drawerLayout);
    }

    public void ClickLogo(View view){
        closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){ redirectActivity(this, MainActivity.class); }

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
    public void akun31(View view) { redirectActivity(this, audit.class);}
    public void akun32(View view) { redirectActivity(this, aklan.class);}
    public void akun33(View view) { redirectActivity(this, akbi.class);}
    public void akun34(View view) { redirectActivity(this, akbi.class);}
    public void akun35(View view) { redirectActivity(this, pajak.class);}

}