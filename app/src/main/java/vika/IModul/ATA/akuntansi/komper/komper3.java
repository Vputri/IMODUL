package vika.IModul.ATA.akuntansi.komper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class komper3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.komper3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewkomper3);
        pdfView.fromAsset("komper3.pdf").load();
    }
}