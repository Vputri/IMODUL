package vika.IModul.ATA.ti.fortan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.ATA.ti.C.cper1;
import vika.IModul.ATA.ti.C.cper2;
import vika.IModul.ATA.ti.C.cper3;
import vika.IModul.ATA.ti.C.cper4;
import vika.IModul.ATA.ti.C.cper5;
import vika.IModul.ATA.ti.C.cper6;
import vika.IModul.ATA.ti.C.cper7;
import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class fortan extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fortan);
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
    protected void onPause(){
        super.onPause();
        closeDrawer(drawerLayout);
    }
    public void ClickAbout(View view){
        redirectActivity(this, AboutActivity.class);
    }
    public void fpert1(View view) { redirectActivity(this, fortan1.class);}
    public void fpert2(View view) { redirectActivity(this, fortan2.class);}
    public void fpert3(View view) { redirectActivity(this, fortan3.class);}
    public void fpert4(View view) { redirectActivity(this, fortan4.class);}
    public void fpert5(View view) { redirectActivity(this, fortan5.class);}
    public void fpert6(View view) { redirectActivity(this, fortan6.class);}
    public void fpert7(View view) { redirectActivity(this, fortan7.class);}
}