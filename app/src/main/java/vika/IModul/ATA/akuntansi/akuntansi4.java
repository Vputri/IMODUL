package vika.IModul.ATA.akuntansi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akuntansi4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akuntansi4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakun4);
        pdfView.fromAsset("akun4.pdf").load();
    }
}