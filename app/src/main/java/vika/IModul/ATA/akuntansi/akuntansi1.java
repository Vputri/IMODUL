package vika.IModul.ATA.akuntansi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akuntansi1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akuntansi1);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakun1);
        pdfView.fromAsset("akun1.pdf").load();
    }
}