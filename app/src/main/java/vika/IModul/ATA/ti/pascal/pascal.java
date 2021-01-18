package vika.IModul.ATA.ti.pascal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.ATA.ti.openoffice.oo1;
import vika.IModul.ATA.ti.openoffice.oo2;
import vika.IModul.ATA.ti.openoffice.oo3;
import vika.IModul.ATA.ti.openoffice.oo4;
import vika.IModul.ATA.ti.openoffice.oo5;
import vika.IModul.ATA.ti.openoffice.oo6;
import vika.IModul.ATA.ti.openoffice.oo7;
import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class pascal extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pascal);
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
    public void ppert1(View view) { redirectActivity(this, pascal1.class);}
    public void ppert2(View view) { redirectActivity(this, pascal2.class);}
    public void ppert3(View view) { redirectActivity(this, pascal3.class);}
    public void ppert4(View view) { redirectActivity(this, pascal4.class);}
    public void ppert5(View view) { redirectActivity(this, pascal5.class);}
    public void ppert6(View view) { redirectActivity(this, pascal6.class);}
    public void ppert7(View view) { redirectActivity(this, pascal7.class);}
}