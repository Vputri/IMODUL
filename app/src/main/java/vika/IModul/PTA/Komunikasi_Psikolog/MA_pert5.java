package vika.IModul.PTA.Komunikasi_Psikolog;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import vika.IModul.R;

public class MA_pert5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapert5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView5);
        pdfView.fromAsset("PTA_MA5.pdf").load();
    }
}