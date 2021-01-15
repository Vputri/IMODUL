package vika.IModul.ATA.si;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.ATA.si.cpluss.cpuss;
import vika.IModul.ATA.si.excel.cel;
import vika.IModul.ATA.si.openoffice.openoffice;
import vika.IModul.ATA.si.pbd;
import vika.IModul.ATA.ti.pascal.pascal;
import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class atasitingk2 extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atasitingk2);
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
    public void PDB(View view) { redirectActivity(this, pbd.class);}
    public void PKSI(View view) { redirectActivity(this, cel.class);}
    public void PKSI1(View view) { redirectActivity(this, cel.class);}
    public void PKPSI(View view) { redirectActivity(this, cel.class);}
    public void PKPSI1(View view) { redirectActivity(this, cel.class);}
    public void PK2PSI(View view) { redirectActivity(this, cel.class);}
    public void KKSI(View view) { redirectActivity(this, cel.class);}
    public void PAPSI(View view) { redirectActivity(this, cel.class);}
    public void AP2SI(View view) { redirectActivity(this, pascal.class);}
    public void PAPSI1(View view) { redirectActivity(this, pascal.class);}
    public void PAPSI2(View view) { redirectActivity(this, cpuss.class);}
    public void PAPSI3(View view) { redirectActivity(this, pascal.class);}
    public void KTISI(View view) { redirectActivity(this, openoffice.class);}
}