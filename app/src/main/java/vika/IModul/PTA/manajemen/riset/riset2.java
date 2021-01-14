package vika.IModul.PTA.manajemen.riset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class riset2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riset2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewriset2);
        pdfView.fromAsset("Riset2.pdf").load();
    }
}