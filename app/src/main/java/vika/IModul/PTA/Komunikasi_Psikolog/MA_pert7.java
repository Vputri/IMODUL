package vika.IModul.PTA.Komunikasi_Psikolog;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import vika.IModul.R;

public class MA_pert7 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapert7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView7);
        pdfView.fromAsset("PTA_MA7.pdf").load();
    }
}