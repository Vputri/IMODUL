package vika.IModul.PTA.akuntansi.pajak;

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

public class pajak extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pajak);
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

    public void pajak1(View view) { redirectActivity(this, pajak1.class);}
    public void pajak2(View view) { redirectActivity(this, pajak2.class);}
    public void pajak3(View view) { redirectActivity(this, pajak3.class);}
    public void pajak4(View view) { redirectActivity(this, pajak4.class);}
    public void pajak5(View view) { redirectActivity(this, pajak5.class);}
    public void pajak6(View view) { redirectActivity(this, pajak6.class);}
    public void pajak7(View view) { redirectActivity(this, pajak7.class);}
    public void pajak8(View view) { redirectActivity(this, pajak8.class);}
    public void pajak9(View view) { redirectActivity(this, pajak9.class);}
    public void pajak10(View view) { redirectActivity(this, pajak10.class);}
    public void pajak11(View view) { redirectActivity(this, pajak11.class);}
    public void pajak12(View view) { redirectActivity(this, pajak12.class);}
}