package vika.IModul.ATA.akuntansi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akuntansi8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akuntansi8);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakun8);
        pdfView.fromAsset("akun8.pdf").load();
    }
}