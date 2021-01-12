package vika.IModul.ATA.ti.fortan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class fortan7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fortan7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewF7);
        pdfView.fromAsset("Fortran7.pdf").load();
    }
}