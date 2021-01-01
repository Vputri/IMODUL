package vika.IModul.PTA.SI.matif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class matif5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matif5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView55);
        pdfView.fromAsset("Matif5.pdf").load();
    }
}