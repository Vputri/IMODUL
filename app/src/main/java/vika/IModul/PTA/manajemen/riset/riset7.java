package vika.IModul.PTA.manajemen.riset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class riset7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riset7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewriset7);
        pdfView.fromAsset("Riset7.pdf").load();
    }
}