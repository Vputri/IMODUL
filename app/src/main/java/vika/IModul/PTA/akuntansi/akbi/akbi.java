package vika.IModul.PTA.akuntansi.akbi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.MainActivity;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class akbi extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akbi);
        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view){
        openDrawer(drawerLayout);
    }

    public void ClickLogo(View view){ closeDrawer(drawerLayout); }

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

    public void akbi1(View view) { redirectActivity(this, akbi1.class); }
    public void akbi2(View view) { redirectActivity(this, akbi2.class); }
    public void akbi3(View view) { redirectActivity(this, akbi3.class); }
    public void akbi4(View view) { redirectActivity(this, akbi4.class); }
    public void akbi5(View view) { redirectActivity(this, akbi5.class); }
    public void akbi6(View view) { redirectActivity(this, akbi6.class); }
    public void akbi7(View view) { redirectActivity(this, akbi7.class); }
    public void akbi8(View view) { redirectActivity(this, akbi8.class); }
    public void akbi9(View view) { redirectActivity(this, akbi9.class); }
}