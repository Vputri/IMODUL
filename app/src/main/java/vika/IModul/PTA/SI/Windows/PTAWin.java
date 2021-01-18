package vika.IModul.PTA.SI.Windows;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.PTA.SI.Qbasic.APPert1;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class PTAWin extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptawin);
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
    public void winPert1(View view)  {
        redirectActivity(this, PTASIW1.class);
    }
    public void winPert2(View view)   {
        redirectActivity(this, PTASIW2.class);
    }
    public void winPert3(View view)   {
        redirectActivity(this, PTASIW3.class);
    }
    public void winPert4(View view)   {
        redirectActivity(this, PTASIW4.class);
    }
    public void winPert5(View view)   {
        redirectActivity(this, PTASIW4.class);
    }
    public void winPert6(View view)   {
        redirectActivity(this, PTASIW6.class);
    }
    public void winPert7(View view)   {
        redirectActivity(this, PTASIW7.class);
    }
}