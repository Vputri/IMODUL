package vika.IModul.ATA.ti.C;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cper4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cper4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewP4);
        pdfView.fromAsset("M4_C.pdf").load();
    }
}