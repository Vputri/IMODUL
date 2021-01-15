package vika.IModul.ATA.akuntansi.pengakun2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pengakun5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pengakun5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpengakun5);
        pdfView.fromAsset("pengakun5.pdf").load();
    }
}