package vika.IModul.PTA.manajemen.manke;

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

public class manke extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manke);
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

    public void manke1(View view) { redirectActivity(this, manke1.class);}
    public void manke2(View view) { redirectActivity(this, manke2.class);}
    public void manke3(View view) { redirectActivity(this, manke3.class);}
    public void manke4(View view) { redirectActivity(this, manke4.class);}
    public void manke5(View view) { redirectActivity(this, manke5.class);}
    public void manke6(View view) { redirectActivity(this, manke6.class);}
    public void manke7(View view) { redirectActivity(this, manke7.class);}
    public void manke8(View view) { redirectActivity(this, manke8.class);}
    public void manke9(View view) { redirectActivity(this, manke9.class);}
    public void manke10(View view) { redirectActivity(this, manke10.class);}
}