package vika.IModul.PTA.manajemen.perper;

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

public class Perper extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perper);
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


    public void perper1(View view) { redirectActivity(this, Perper1.class);}
    public void perper2(View view) { redirectActivity(this, Perper2.class);}
    public void perper3(View view) { redirectActivity(this, Perper3.class);}
    public void perper4(View view) { redirectActivity(this, Perper4.class);}
    public void perper5(View view) { redirectActivity(this, Perper5.class);}
    public void perper6(View view) { redirectActivity(this, Perper6.class);}
    public void perper7(View view) { redirectActivity(this, Perper7.class);}
    public void perper8(View view) { redirectActivity(this, Perper8.class);}
}