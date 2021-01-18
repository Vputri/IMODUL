package vika.IModul.PTA.akuntansi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.PTA.akuntansi.akun.akuntansi;
import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class ptaakun1 extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ptaakun1);
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

    public void akun11(View view) { redirectActivity(this, akuntansi.class);}
    public void akun12(View view) { redirectActivity(this, akuntansi.class);}
    public void akun13(View view) { redirectActivity(this, akuntansi.class);}
    public void akun14(View view) { redirectActivity(this, akuntansi.class);}
    public void akun15(View view) { redirectActivity(this, akuntansi.class);}
}