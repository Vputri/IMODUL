package vika.IModul.PTA.manajemen.riset;

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

public class riset extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riset);
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

    public void riset1(View view) { redirectActivity(this, riset1.class);}
    public void riset2(View view) { redirectActivity(this, riset2.class);}
    public void riset3(View view) { redirectActivity(this, riset3.class);}
    public void riset4(View view) { redirectActivity(this, riset4.class);}
    public void riset5(View view) { redirectActivity(this, riset5.class);}
    public void riset6(View view) { redirectActivity(this, riset6.class);}
    public void riset7(View view) { redirectActivity(this, riset7.class);}
}