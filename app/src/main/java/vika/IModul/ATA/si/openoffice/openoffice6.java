package vika.IModul.ATA.si.openoffice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class openoffice6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openoffice6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewof6);
        pdfView.fromAsset("M6_oo.pdf").load();
    }
}