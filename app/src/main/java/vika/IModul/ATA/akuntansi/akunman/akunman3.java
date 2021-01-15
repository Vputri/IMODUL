package vika.IModul.ATA.akuntansi.akunman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akunman3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akunman3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakunman3);
        pdfView.fromAsset("akunman3.pdf").load();

    }
}