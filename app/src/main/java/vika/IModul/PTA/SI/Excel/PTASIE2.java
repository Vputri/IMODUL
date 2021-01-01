package vika.IModul.PTA.SI.Excel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class PTASIE2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptasie2);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView20);
        pdfView.fromAsset("PTA_E2.pdf").load();
    }
}