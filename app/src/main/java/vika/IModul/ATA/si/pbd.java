package vika.IModul.ATA.si;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pbd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pbd);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpbd);
        pdfView.fromAsset("PBD.pdf").load();
    }
}