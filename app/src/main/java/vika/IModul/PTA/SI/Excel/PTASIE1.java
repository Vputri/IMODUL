package vika.IModul.PTA.SI.Excel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class PTASIE1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptasie1);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView19);
        pdfView.fromAsset("PTA_E1.pdf").load();
    }
}