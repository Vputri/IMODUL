package vika.IModul.ATA.ti.pascal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pascal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pascal1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpa1);
        pdfView.fromAsset("M1- PASCAL.pdf").load();
    }
}