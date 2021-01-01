package vika.IModul.PTA.SI.Qbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class APPert1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appert1);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView8);
        pdfView.fromAsset("PTA_MA1.pdf").load();
    }
}