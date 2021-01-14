package vika.IModul.ATA.akuntansi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import vika.IModul.ATA.akuntansi.komper.komper;
import vika.IModul.ATA.akuntansi.komper.komper1;
import vika.IModul.ATA.akuntansi.pemograkun.pemograkun;
import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class ataakun extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ataakun);
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

    public void ataakun0(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void ataakun1(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void ataakun2(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void ataakun3(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void ataakun4(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show(); }
    public void ataakun5(View view) { redirectActivity(this, pemograkun.class);}
    public void ataakun6(View view) { redirectActivity(this, komper.class);}
    public void ataakun7(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void ataakun8(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void ataakun9(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void ataakun10(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void ataakun11(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
    public void ataakun12(View view) { Toast.makeText(getApplicationContext(), "Mohon maaf, modul tidak tersedia", Toast.LENGTH_LONG).show();}
}