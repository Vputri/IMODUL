package vika.IModul.ATA.ti.C;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cper3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cper3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewP3);
        pdfView.fromAsset("M3_C.pdf").load();
    }
}