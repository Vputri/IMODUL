package vika.IModul.ATA.ti.C;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cper1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cper1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewP1);
        pdfView.fromAsset("M1_C.pdf").load();
    }
}