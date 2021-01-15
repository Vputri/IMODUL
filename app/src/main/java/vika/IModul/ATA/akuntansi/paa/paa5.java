package vika.IModul.ATA.akuntansi.paa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class paa5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paa5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpaa5);
        pdfView.fromAsset("paa5.pdf").load();
    }
}