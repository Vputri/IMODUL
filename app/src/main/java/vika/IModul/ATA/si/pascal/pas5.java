package vika.IModul.ATA.si.pascal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pas5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pas5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpas5);
        pdfView.fromAsset("M5_pascal.pdf").load();
    }
}