package vika.IModul.ATA.manajemen.komputerisasianggaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class komputerisasianggaran1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.komputerisasianggaran1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewkomputerisasianggaran1);
        pdfView.fromAsset("komputerisasianggaran5.pdf").load();
    }
}