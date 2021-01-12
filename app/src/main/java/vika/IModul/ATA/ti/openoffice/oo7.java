package vika.IModul.ATA.ti.openoffice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class oo7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oo7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewO7);
        pdfView.fromAsset("ofM7.pdf").load();
    }
}