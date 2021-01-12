package vika.IModul.ATA.ti.matif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class maatif6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maatif6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewM6);
        pdfView.fromAsset("Matif2_6.pdf").load();
    }
}