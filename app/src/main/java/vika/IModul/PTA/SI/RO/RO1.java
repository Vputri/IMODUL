package vika.IModul.PTA.SI.RO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class RO1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ro1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView71);
        pdfView.fromAsset("PTA_RO1.pdf").load();
    }
}