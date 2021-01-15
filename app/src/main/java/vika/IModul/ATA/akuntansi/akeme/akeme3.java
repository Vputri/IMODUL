package vika.IModul.ATA.akuntansi.akeme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akeme3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akeme3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakeme3);
        pdfView.fromAsset("Akeme3.pdf").load();
    }
}