package vika.IModul.ATA.ti.statistika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class tisat3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tisat3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewst3);
        pdfView.fromAsset("stat3.pdf").load();
    }
}