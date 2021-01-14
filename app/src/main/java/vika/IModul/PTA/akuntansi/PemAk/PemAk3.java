package vika.IModul.PTA.akuntansi.PemAk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class PemAk3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemak3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpemak3);
        pdfView.fromAsset("pemak3.pdf").load();
    }
}