package vika.IModul.ATA.si.openoffice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class openoffice2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openoffice2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewof2);
        pdfView.fromAsset("M2_oo.pdf").load();
    }
}