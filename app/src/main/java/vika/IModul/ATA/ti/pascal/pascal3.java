package vika.IModul.ATA.ti.pascal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pascal3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pascal3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpa3);
        pdfView.fromAsset("M3- PASCAL.pdf").load();
    }
}