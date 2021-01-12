package vika.IModul.ATA.ti.pascal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pascal6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pascal6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpa6);
        pdfView.fromAsset("M6- PASCAL.pdf").load();
    }
}