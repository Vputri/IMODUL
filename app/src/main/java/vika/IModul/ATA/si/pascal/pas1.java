package vika.IModul.ATA.si.pascal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pas1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pas1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpas1);
        pdfView.fromAsset("M1_pascal.pdf").load();
    }
}