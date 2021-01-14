package vika.IModul.ATA.akuntansi.komper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class komper7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.komper7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewkomper7);
        pdfView.fromAsset("komper7.pdf").load();
    }
}