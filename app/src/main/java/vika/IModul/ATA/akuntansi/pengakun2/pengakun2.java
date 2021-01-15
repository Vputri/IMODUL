package vika.IModul.ATA.akuntansi.pengakun2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pengakun2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pengakun2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpengakun2);
        pdfView.fromAsset("pengakun2.pdf").load();
    }
}