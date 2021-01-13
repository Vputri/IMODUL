package vika.IModul.ATA.si.pascal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pas3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pas3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpas3);
        pdfView.fromAsset("M3_pascal.pdf").load();
    }
}