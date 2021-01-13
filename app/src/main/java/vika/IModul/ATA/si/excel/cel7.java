package vika.IModul.ATA.si.excel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cel7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cel7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewcel7);
        pdfView.fromAsset("M7-excel.pdf").load();
    }
}