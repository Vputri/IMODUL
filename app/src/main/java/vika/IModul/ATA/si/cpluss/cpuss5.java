package vika.IModul.ATA.si.cpluss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cpuss5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpuss5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewcpus5);
        pdfView.fromAsset("M5_C++.pdf").load();
    }
}