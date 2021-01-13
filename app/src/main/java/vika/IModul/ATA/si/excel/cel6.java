package vika.IModul.ATA.si.excel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cel6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cel6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewcel6);
        pdfView.fromAsset("M6-excel.pdf").load();
    }
}