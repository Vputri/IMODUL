package vika.IModul.ATA.ti.pascal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pascal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pascal2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpa2);
        pdfView.fromAsset("M2- PASCAL.pdf").load();
    }
}