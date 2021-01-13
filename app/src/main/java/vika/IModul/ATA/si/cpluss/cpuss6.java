package vika.IModul.ATA.si.cpluss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cpuss6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpuss6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewcpus6);
        pdfView.fromAsset("M6_C++.pdf").load();
    }
}