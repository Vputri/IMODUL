package vika.IModul.PTA.SI.Java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class JAVA extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
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

    public void Pert1(View view) { redirectActivity(this, java1.class);}
    public void Pert2(View view) { redirectActivity(this, java2.class);}
    public void Pert3(View view) { redirectActivity(this, java3.class);}
    public void Pert4(View view) { redirectActivity(this, java4.class);}
    public void Pert5(View view) { redirectActivity(this, java5.class);}
    public void Pert6(View view) { redirectActivity(this, java6.class);}
    public void Pert7(View view) { redirectActivity(this, Java7.class);}
    public void Pert8(View view) { redirectActivity(this, Java8.class);}
    public void Pert9(View view) { redirectActivity(this, java9.class);}
    public void Pert10(View view) { redirectActivity(this, java10.class);}
    public void Pert11(View view) { redirectActivity(this, java11.class);}
    public void Pert12(View view) { redirectActivity(this, java12.class);}
    public void Pert13(View view) { redirectActivity(this, java13.class);}

}