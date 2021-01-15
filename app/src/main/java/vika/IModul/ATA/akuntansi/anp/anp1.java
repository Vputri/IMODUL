package vika.IModul.ATA.akuntansi.anp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class anp1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anp1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewanp1);
        pdfView.fromAsset("anp1.pdf").load();
    }
}