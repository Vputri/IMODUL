package vika.IModul.ATA.akuntansi.anp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class anp3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anp3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewanp3);
        pdfView.fromAsset("anp3.pdf").load();
    }
}