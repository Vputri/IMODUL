package vika.IModul.PTA.TI.SO;

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

public class SO extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_so);
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
    public void sopert1(View view) { redirectActivity(this, So1.class);}
    public void sopert2(View view) { redirectActivity(this, So2.class);}
    public void sopert3(View view) { redirectActivity(this, So3.class);}
    public void sopert4(View view) { redirectActivity(this, So4.class);}
    public void sopert5(View view) { redirectActivity(this, So5.class);}
    public void sopert6(View view) { redirectActivity(this, So6.class);}
    public void sopert7(View view) { redirectActivity(this, So7.class);}
    public void sopert8(View view) { redirectActivity(this, So8.class);}
}