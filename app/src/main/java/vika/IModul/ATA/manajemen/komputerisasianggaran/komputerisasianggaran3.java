package vika.IModul.ATA.manajemen.komputerisasianggaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class komputerisasianggaran3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.komputerisasianggaran3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewkomputerisasianggaran3);
        pdfView.fromAsset("komputerisasianggaran7.pdf").load();
    }
}