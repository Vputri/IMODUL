package vika.IModul.PTA.SI.COBOL;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.PTA.SI.Java.Java7;
import vika.IModul.PTA.SI.Java.Java8;
import vika.IModul.PTA.SI.Java.java1;
import vika.IModul.PTA.SI.Java.java10;
import vika.IModul.PTA.SI.Java.java11;
import vika.IModul.PTA.SI.Java.java12;
import vika.IModul.PTA.SI.Java.java13;
import vika.IModul.PTA.SI.Java.java2;
import vika.IModul.PTA.SI.Java.java3;
import vika.IModul.PTA.SI.Java.java4;
import vika.IModul.PTA.SI.Java.java5;
import vika.IModul.PTA.SI.Java.java6;
import vika.IModul.PTA.SI.Java.java9;
import vika.IModul.R;

import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class cobol extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobol);
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

    public void ClickAbout(View view){
        redirectActivity(this, AboutActivity.class);
    }

    protected void onPause(){
        super.onPause();
        closeDrawer(drawerLayout);
    }
    public void cobPert1(View view) { redirectActivity(this, cobol1.class);}
    public void cobPert2(View view) { redirectActivity(this, cobol2.class);}
    public void cobPert3(View view) { redirectActivity(this, cobol3.class);}
    public void cobPert4(View view) { redirectActivity(this, cobol4.class);}
    public void cobPert5(View view) { redirectActivity(this, cobol5.class);}
    public void cobPert6(View view) { redirectActivity(this, cobol6.class);}
    public void cobPert7(View view) { redirectActivity(this, cobol7.class);}
    public void cobPert8(View view) { redirectActivity(this, cobol8.class);}
    public void cobPert9(View view) { redirectActivity(this, cobol9.class);}
    public void cobPert10(View view) { redirectActivity(this, cobol10.class);}
    public void cobPert11(View view) { redirectActivity(this, cobol11.class);}
    public void cobPert12(View view) { redirectActivity(this, cobol12.class);}
}