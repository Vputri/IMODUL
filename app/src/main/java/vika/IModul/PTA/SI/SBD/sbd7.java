package vika.IModul.PTA.SI.SBD;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class sbd7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbd7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView70);
        pdfView.fromAsset("SBD7.pdf").load();
    }
}