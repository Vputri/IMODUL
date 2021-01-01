package vika.IModul.PTA.SI.Java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class java3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView27);
        pdfView.fromAsset("JAVA3.pdf").load();
    }
}