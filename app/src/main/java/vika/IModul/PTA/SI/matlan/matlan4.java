package vika.IModul.PTA.SI.matlan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class matlan4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matlan4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView60);
        pdfView.fromAsset("Matlan4.pdf").load();
    }
}