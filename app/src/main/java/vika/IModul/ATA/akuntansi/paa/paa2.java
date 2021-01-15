package vika.IModul.ATA.akuntansi.paa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class paa2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paa2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpaa2);
        pdfView.fromAsset("paa2.pdf").load();
    }
}