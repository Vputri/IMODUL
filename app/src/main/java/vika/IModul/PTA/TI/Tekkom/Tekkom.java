package vika.IModul.PTA.TI.Tekkom;

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

public class Tekkom extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tekkom);
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


    public void tekkompert1(View view) { redirectActivity(this, Tekkom1.class);}
    public void tekkompert2(View view) { redirectActivity(this, Tekkom2.class);}
    public void tekkompert3(View view) { redirectActivity(this, Tekkom3.class);}
    public void tekkompert4(View view) { redirectActivity(this, Tekkom4.class);}
    public void tekkompert5(View view) { redirectActivity(this, Tekkom5.class);}
    public void tekkompert6(View view) { redirectActivity(this, Tekkom6.class);}
    public void tekkompert7(View view) { redirectActivity(this, Tekkom7.class);}

}