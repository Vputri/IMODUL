package vika.IModul.PTA.manajemen.kompe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class kompe4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kompe4);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewkompe4);
        pdfView.fromAsset("Kompe4.pdf").load();
    }
}