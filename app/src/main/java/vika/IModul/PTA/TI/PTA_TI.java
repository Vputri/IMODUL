package vika.IModul.PTA.TI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import vika.IModul.MainActivity;
import vika.IModul.PTA.SI.Java.JAVA;
import vika.IModul.PTA.SI.Qbasic.PTA_AP;
import vika.IModul.PTA.SI.Windows.PTAWin;
import vika.IModul.PTA.SI.matif.matif;
import vika.IModul.PTA.TI.SO.SO;
import vika.IModul.PTA.TI.Tekkom.Tekkom;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class PTA_TI extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptati);
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

    public void TI1(View view) { redirectActivity(this, JAVA.class);}
    public void TI2(View view) { redirectActivity(this, matif.class);}
    public void TI3(View view) { redirectActivity(this, PTAWin.class);}
    public void TI4(View view) { redirectActivity(this, PTA_AP.class);}
    public void TI5(View view) { redirectActivity(this, PTA_AP.class);}
    public void TI6(View view) { redirectActivity(this, PTAWin.class);}
    public void TI7(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void TI8(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void TI9(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void TI10(View view) { redirectActivity(this, SO.class);}
    public void TI11(View view) { redirectActivity(this, Tekkom.class);}
}