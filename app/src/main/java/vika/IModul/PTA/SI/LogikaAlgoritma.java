package vika.IModul.PTA.SI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class LogikaAlgoritma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logikaalgoritma);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView50);
        pdfView.fromAsset("Logika.pdf").load();
    }
}