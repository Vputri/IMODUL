package vika.IModul.ATA.akuntansi.komper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class komper4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.komper4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewkomper4);
        pdfView.fromAsset("komper4.pdf").load();
    }
}