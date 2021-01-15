package vika.IModul.ATA.akuntansi.akeme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akeme4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akeme4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakeme4);
        pdfView.fromAsset("Akeme4.pdf").load();
    }
}