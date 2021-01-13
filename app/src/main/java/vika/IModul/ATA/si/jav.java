package vika.IModul.ATA.si;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class jav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jav);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewjav);
        pdfView.fromAsset("Java_2DB.pdf").load();
    }
}