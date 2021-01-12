package vika.IModul.ATA.ti.matif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class maatif4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maatif4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewM4);
        pdfView.fromAsset("Matif2_4.pdf").load();
    }
}