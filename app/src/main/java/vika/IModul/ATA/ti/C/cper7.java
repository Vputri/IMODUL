package vika.IModul.ATA.ti.C;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cper7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cper7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewP7);
        pdfView.fromAsset("M7_C.pdf").load();
    }
}