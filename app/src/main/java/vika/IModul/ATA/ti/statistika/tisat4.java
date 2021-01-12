package vika.IModul.ATA.ti.statistika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class tisat4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tisat4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewst4);
        pdfView.fromAsset("stat4.pdf").load();
    }
}