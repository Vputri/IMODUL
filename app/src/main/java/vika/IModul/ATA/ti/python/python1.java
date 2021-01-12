package vika.IModul.ATA.ti.python;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class python1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.python1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpy1);
        pdfView.fromAsset("M01Python.pdf").load();
    }
}