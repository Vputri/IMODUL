package vika.IModul.PTA.SI.RO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class RO3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ro3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView73);
        pdfView.fromAsset("PTA_RO3.pdf").load();
    }
}