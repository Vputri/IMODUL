package vika.IModul.ATA.akuntansi.anp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class anp4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anp4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewanp4);
        pdfView.fromAsset("anp4.pdf").load();
    }
}