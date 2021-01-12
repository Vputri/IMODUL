package vika.IModul.ATA.ti.statistika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class tisat1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tisat1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewst1);
        pdfView.fromAsset("stat1.pdf").load();
    }
}