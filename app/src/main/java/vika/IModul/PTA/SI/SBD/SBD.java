package vika.IModul.PTA.SI.SBD;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.PTA.SI.Windows.PTASIW1;
import vika.IModul.PTA.SI.Windows.PTASIW2;
import vika.IModul.PTA.SI.Windows.PTASIW3;
import vika.IModul.PTA.SI.Windows.PTASIW4;
import vika.IModul.PTA.SI.Windows.PTASIW6;
import vika.IModul.PTA.SI.Windows.PTASIW7;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class SBD extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbd);
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

    public void ClickAbout(View view){
        redirectActivity(this, AboutActivity.class);
    }

    protected void onPause(){
        super.onPause();
        closeDrawer(drawerLayout);
    }
    public void sbdPert1(View view)  {
        redirectActivity(this, sbd1.class);
    }
    public void sbdPert2(View view)   {
        redirectActivity(this, sbd2.class);
    }
    public void sbdPert3(View view)   {
        redirectActivity(this, sbd3.class);
    }
    public void sbdPert4(View view)   {
        redirectActivity(this, sbd4.class);
    }
    public void sbdPert5(View view)   {
        redirectActivity(this, sbd4.class);
    }
    public void sbdPert6(View view)   {
        redirectActivity(this, sbd6.class);
    }
    public void sbdPert7(View view)   {
        redirectActivity(this, sbd7.class);
    }
}