package vika.IModul.PTA.SI.matlan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class matlan5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matlan5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView61);
        pdfView.fromAsset("Matlan5.pdf").load();
    }
}