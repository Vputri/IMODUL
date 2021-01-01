package vika.IModul.PTA.SI.SBD;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class sbd4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbd4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView67);
        pdfView.fromAsset("SBD4.pdf").load();
    }
}