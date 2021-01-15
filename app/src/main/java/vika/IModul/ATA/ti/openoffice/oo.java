package vika.IModul.ATA.ti.openoffice;

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

public class oo extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oo);
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
    public void tpert1(View view) { redirectActivity(this, oo1.class);}
    public void tpert2(View view) { redirectActivity(this, oo2.class);}
    public void tpert3(View view) { redirectActivity(this, oo3.class);}
    public void tpert4(View view) { redirectActivity(this, oo4.class);}
    public void tpert5(View view) { redirectActivity(this, oo5.class);}
    public void tpert6(View view) { redirectActivity(this, oo6.class);}
    public void tpert7(View view) { redirectActivity(this, oo7.class);}
}