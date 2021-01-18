package vika.IModul.ATA.manajemen.komputerisasianggaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class komputerisasianggaran2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.komputerisasianggaran2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewkomputerisasianggaran2);
        pdfView.fromAsset("komputerisasianggaran6.pdf").load();
    }
}