package vika.IModul.ATA.si.excel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cel4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cel4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewcel4);
        pdfView.fromAsset("M4-excel.pdf").load();
    }
}