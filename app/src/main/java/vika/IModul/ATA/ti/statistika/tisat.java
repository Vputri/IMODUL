package vika.IModul.ATA.ti.statistika;

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

public class tisat extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tisat);
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
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"ilab@gunadarma.ac.id"});
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
    public void stpert1(View view) { redirectActivity(this, tisat1.class);}
    public void stpert2(View view) { redirectActivity(this, tisat2.class);}
    public void stpert3(View view) { redirectActivity(this, tisat3.class);}
    public void stpert4(View view) { redirectActivity(this, tisat4.class);}
    public void stpert5(View view) { redirectActivity(this, tisat5.class);}
    public void stpert6(View view) { redirectActivity(this, tisat6.class);}
    public void stpert7(View view) { redirectActivity(this, tisat7.class);}
}