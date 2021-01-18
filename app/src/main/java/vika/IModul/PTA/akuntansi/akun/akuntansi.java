package vika.IModul.PTA.akuntansi.akun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class akuntansi extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akuntansi);
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

    public void akun1(View view) { redirectActivity(this, akuntansi1.class);}
    public void akun2(View view) { redirectActivity(this, akuntansi2.class);}
    public void akun3(View view) { redirectActivity(this, akuntansi3.class);}
    public void akun4(View view) { redirectActivity(this, akuntansi4.class);}
    public void akun5(View view) { redirectActivity(this, akuntansi5.class);}
    public void akun6(View view) { redirectActivity(this, akuntansi6.class);}
    public void akun7(View view) { redirectActivity(this, akuntansi7.class);}
    public void akun8(View view) { redirectActivity(this, akuntansi8.class);}
}