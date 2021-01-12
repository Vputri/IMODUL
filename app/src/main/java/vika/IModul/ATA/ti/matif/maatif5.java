package vika.IModul.ATA.ti.matif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class maatif5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maatif5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewM5);
        pdfView.fromAsset("Matif2_5.pdf").load();
    }
}