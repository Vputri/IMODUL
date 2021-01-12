package vika.IModul.ATA.ti.fortan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class fortan3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fortan3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewF3);
        pdfView.fromAsset("Fortran3.pdf").load();
    }
}