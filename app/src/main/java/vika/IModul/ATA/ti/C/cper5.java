package vika.IModul.ATA.ti.C;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cper5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cper5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewP5);
        pdfView.fromAsset("M5_C.pdf").load();
    }
}