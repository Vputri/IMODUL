package vika.IModul.PTA.SI.Excel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class PTASIE3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptasie3);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView21);
        pdfView.fromAsset("PTA_E3.pdf").load();
    }
}