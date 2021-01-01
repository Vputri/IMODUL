package vika.IModul.PTA.SI.matif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class matif3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matif3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView53);
        pdfView.fromAsset("Matif3.pdf").load();
    }
}