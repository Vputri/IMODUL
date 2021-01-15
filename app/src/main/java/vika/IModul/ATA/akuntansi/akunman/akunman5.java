package vika.IModul.ATA.akuntansi.akunman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akunman5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akunman5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakunman5);
        pdfView.fromAsset("akunman5.pdf").load();
    }
}