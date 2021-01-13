package vika.IModul.ATA.si.pascal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pas2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pas2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpas2);
        pdfView.fromAsset("M2_pascal.pdf").load();
    }
}