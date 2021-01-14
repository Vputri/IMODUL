package vika.IModul.ATA.akuntansi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akuntansi3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akuntansi3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakun3);
        pdfView.fromAsset("akun3.pdf").load();
    }
}