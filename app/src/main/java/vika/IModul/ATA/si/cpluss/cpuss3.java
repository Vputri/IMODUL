package vika.IModul.ATA.si.cpluss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cpuss3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpuss3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewcpus3);
        pdfView.fromAsset("M3_C++.pdf").load();
    }
}