package vika.IModul.ATA.si.openoffice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class openoffice5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openoffice5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewof5);
        pdfView.fromAsset("M5_oo.pdf").load();
    }
}