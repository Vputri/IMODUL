package vika.IModul.ATA.ti.statistika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class tisat5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tisat5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewst5);
        pdfView.fromAsset("stat5.pdf").load();
    }
}