package vika.IModul.ATA.akuntansi.komper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class komper6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.komper6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewkomper6);
        pdfView.fromAsset("komper6.pdf").load();
    }
}