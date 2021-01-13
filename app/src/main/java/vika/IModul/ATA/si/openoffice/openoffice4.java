package vika.IModul.ATA.si.openoffice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class openoffice4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openoffice4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewof4);
        pdfView.fromAsset("M4_oo.pdf").load();
    }
}