package vika.IModul.ATA.akuntansi.pengakun2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pengakun7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengakun7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpengakun7);
        pdfView.fromAsset("pengakun7.pdf").load();
    }
}