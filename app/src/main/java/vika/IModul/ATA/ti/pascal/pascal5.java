package vika.IModul.ATA.ti.pascal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pascal5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pascal5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpa5);
        pdfView.fromAsset("M5- PASCAL.pdf").load();
    }
}