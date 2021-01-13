package vika.IModul.ATA.si.excel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cel1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cel1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewcel1);
        pdfView.fromAsset("M1-excel.pdf").load();
    }
}