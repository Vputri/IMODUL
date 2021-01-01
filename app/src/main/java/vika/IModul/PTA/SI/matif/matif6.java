package vika.IModul.PTA.SI.matif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class matif6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matif6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView56);
        pdfView.fromAsset("Matif6.pdf").load();
    }
}