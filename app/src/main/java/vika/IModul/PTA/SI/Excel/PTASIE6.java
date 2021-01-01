package vika.IModul.PTA.SI.Excel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class PTASIE6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptasie6);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView24);
        pdfView.fromAsset("PTA_E6.pdf").load();
    }
}