package vika.IModul.PTA.SI.RO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class RO6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ro6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView76);
        pdfView.fromAsset("PTA_RO6.pdf").load();
    }
}