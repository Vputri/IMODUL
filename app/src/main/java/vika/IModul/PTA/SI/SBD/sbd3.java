package vika.IModul.PTA.SI.SBD;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class sbd3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbd3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView66);
        pdfView.fromAsset("SBD3.pdf").load();
    }
}