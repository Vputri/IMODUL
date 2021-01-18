package vika.IModul.ATA.akuntansi.pemograkun;

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

public class pemograkun extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemograkun);
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

    public void pemograkun1(View view) { redirectActivity(this, pemograkun1.class);}
    public void pemograkun2(View view) { redirectActivity(this, pemograkun2.class);}
    public void pemograkun3(View view) { redirectActivity(this, pemograkun3.class);}
    public void pemograkun4(View view) { redirectActivity(this, pemograkun4.class);}
    public void pemograkun5(View view) { redirectActivity(this, pemograkun5.class);}
    public void pemograkun6(View view) { redirectActivity(this, pemograkun6.class);}
    public void pemograkun7(View view) { redirectActivity(this, pemograkun7.class);}
}