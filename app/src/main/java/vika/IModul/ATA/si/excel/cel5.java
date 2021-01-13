package vika.IModul.ATA.si.excel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cel5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cel5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewcel5);
        pdfView.fromAsset("M5-excel.pdf").load();
    }
}