package vika.IModul.ATA.si.pascal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pas4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pas4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpas4);
        pdfView.fromAsset("M4_pascal.pdf").load();
    }
}