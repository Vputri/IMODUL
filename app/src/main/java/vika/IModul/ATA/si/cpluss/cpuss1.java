package vika.IModul.ATA.si.cpluss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cpuss1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpuss1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewcpus1);
        pdfView.fromAsset("M1_C++.pdf").load();
    }
}