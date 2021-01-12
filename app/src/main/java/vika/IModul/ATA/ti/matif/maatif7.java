package vika.IModul.ATA.ti.matif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class maatif7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maatif7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewM7);
        pdfView.fromAsset("Matif2_7.pdf").load();
    }
}