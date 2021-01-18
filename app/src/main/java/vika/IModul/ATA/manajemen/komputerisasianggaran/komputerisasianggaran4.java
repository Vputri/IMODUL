package vika.IModul.ATA.manajemen.komputerisasianggaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class komputerisasianggaran4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.komputerisasianggaran4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewkomputerisasianggaran4);
        pdfView.fromAsset("komputerisasianggaran8.pdf").load();
    }
}