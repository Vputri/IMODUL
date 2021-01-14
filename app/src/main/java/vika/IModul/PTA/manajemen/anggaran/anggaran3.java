package vika.IModul.PTA.manajemen.anggaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class anggaran3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggaran3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewang3);
        pdfView.fromAsset("anggaran3.pdf").load();
    }
}