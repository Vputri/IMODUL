package vika.IModul.ATA.akuntansi.anp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class anp7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anp7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewanp7);
        pdfView.fromAsset("anp7.pdf").load();
    }
}