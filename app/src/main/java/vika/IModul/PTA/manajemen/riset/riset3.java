package vika.IModul.PTA.manajemen.riset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class riset3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riset3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewriset3);
        pdfView.fromAsset("Riset3.pdf").load();
    }
}