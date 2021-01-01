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
    public void Pert1(View view)  {
        redirectActivity(this, PTASIW1.class);
    }
    public void Pert2(View view)   {
        redirectActivity(this, PTASIW2.class);
    }
    public void Pert3(View view)   {
        redirectActivity(this, PTASIW3.class);
    }
    public void Pert4(View view)   {
        redirectActivity(this, PTASIW4.class);
    }
    public void Pert5(View view)   {
        redirectActivity(this, PTASIW4.class);
    }
    public void Pert6(View view)   {
        redirectActivity(this, PTASIW6.class);
    }
    public void Pert7(View view)   {
        redirectActivity(this, PTASIW7.class);
    }
}