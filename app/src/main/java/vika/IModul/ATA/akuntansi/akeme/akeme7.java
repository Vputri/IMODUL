package vika.IModul.ATA.akuntansi.akeme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akeme7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akeme7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakeme7);
        pdfView.fromAsset("Akeme7.pdf").load();
    }
}