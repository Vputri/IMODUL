package vika.IModul.PTA.SI.RO;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.PTA.SI.matlan.matlan1;
import vika.IModul.PTA.SI.matlan.matlan2;
import vika.IModul.PTA.SI.matlan.matlan3;
import vika.IModul.PTA.SI.matlan.matlan4;
import vika.IModul.PTA.SI.matlan.matlan5;
import vika.IModul.PTA.SI.matlan.matlan6;
import vika.IModul.PTA.SI.matlan.matlan7;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class RO extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ro);
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

    protected void onPause(){
        super.onPause();
        closeDrawer(drawerLayout);
    }
    public void roPert1(View view) { redirectActivity(this, RO1.class); }
    public void roPert2(View view) { redirectActivity(this, RO2.class); }
    public void roPert3(View view) { redirectActivity(this, RO3.class); }
    public void roPert4(View view) { redirectActivity(this, RO4.class); }
    public void roPert5(View view) { redirectActivity(this, RO5.class); }
    public void roPert6(View view) { redirectActivity(this, RO6.class); }
    public void roPert7(View view) { redirectActivity(this, RO7.class); }
    public void roPert8(View view) { redirectActivity(this, RO8.class); }
    public void roPert9(View view) { redirectActivity(this, RO9.class); }
}