package vika.IModul.ATA.si;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class numerik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numerik);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewnum);
        pdfView.fromAsset("numerik.pdf").load();
    }
}