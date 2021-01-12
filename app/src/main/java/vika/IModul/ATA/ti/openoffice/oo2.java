package vika.IModul.ATA.ti.openoffice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class oo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oo2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewO2);
        pdfView.fromAsset("ofM2.pdf").load();
    }
}