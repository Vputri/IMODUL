package vika.IModul.ATA.ti.fortan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class fortan5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fortan5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewF5);
        pdfView.fromAsset("Fortran5.pdf").load();
    }
}