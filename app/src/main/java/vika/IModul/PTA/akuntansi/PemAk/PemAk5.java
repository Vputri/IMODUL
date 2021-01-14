package vika.IModul.PTA.akuntansi.PemAk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class PemAk5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemak5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpemak5);
        pdfView.fromAsset("pemak5.pdf").load();
    }
}