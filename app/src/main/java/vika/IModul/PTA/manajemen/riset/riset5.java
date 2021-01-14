package vika.IModul.PTA.manajemen.riset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class riset5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riset5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewriset5);
        pdfView.fromAsset("Riset5.pdf").load();
    }
}