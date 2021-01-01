package vika.IModul.PTA.SI.SBD;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class sbd6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbd6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView69);
        pdfView.fromAsset("SBD6.pdf").load();
    }
}