package vika.IModul.ATA.ti.matif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class maatif3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maatif3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewM3);
        pdfView.fromAsset("Matif2_3.pdf").load();
    }
}