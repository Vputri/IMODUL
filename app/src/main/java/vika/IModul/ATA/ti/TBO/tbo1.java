package vika.IModul.ATA.ti.TBO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class tbo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tbo1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewtb1);
        pdfView.fromAsset("M01Python.pdf").load();
    }
}