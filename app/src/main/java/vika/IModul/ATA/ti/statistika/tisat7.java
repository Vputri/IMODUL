package vika.IModul.ATA.ti.statistika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class tisat7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tisat7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewst7);
        pdfView.fromAsset("stat7.pdf").load();
    }
}