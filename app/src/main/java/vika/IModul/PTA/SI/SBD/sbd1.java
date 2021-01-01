package vika.IModul.PTA.SI.SBD;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class sbd1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbd1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView64);
        pdfView.fromAsset("SBD1.pdf").load();
    }
}