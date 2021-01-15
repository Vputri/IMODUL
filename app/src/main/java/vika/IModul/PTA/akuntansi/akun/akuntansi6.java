package vika.IModul.PTA.akuntansi.akun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akuntansi6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akuntansi6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakun6);
        pdfView.fromAsset("akun6.pdf").load();
    }
}