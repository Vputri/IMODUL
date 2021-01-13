package vika.IModul.ATA.si.cpluss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cpuss2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpuss2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewcpus2);
        pdfView.fromAsset("M2_C++.pdf").load();
    }
}