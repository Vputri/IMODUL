package vika.IModul.PTA.manajemen.kompe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class kompe2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kompe2);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewkompe2);
        pdfView.fromAsset("Kompe2.pdf").load();
    }
}