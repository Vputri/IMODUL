package vika.IModul.ATA.Komunikasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import android.webkit.WebView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import vika.IModul.AboutActivity;
import vika.IModul.MainActivity;
import vika.IModul.R;
import static vika.IModul.MainActivity.closeDrawer;
import static vika.IModul.MainActivity.openDrawer;
import static vika.IModul.MainActivity.redirectActivity;

public class MAActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma);

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


    public void Pert1(View view) {
        WebView wv;
        wv = findViewById(R.id.webview);
        wv.loadUrl("file:///android_asset/chapter1.html");
    }

    public void Pert2(View view) { }

    public void Pert3(View view) { }

    public void Pert4(View view) { }

    public void Pert5(View view) { }

    public void Pert6(View view) { }

    public void Pert7(View view){ }

    public void Pert8(View view) { }
}