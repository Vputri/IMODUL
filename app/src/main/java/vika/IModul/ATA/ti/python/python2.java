package vika.IModul.ATA.ti.python;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class python2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.python2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpy2);
        pdfView.fromAsset("M02Python.pdf").load();
    }
}