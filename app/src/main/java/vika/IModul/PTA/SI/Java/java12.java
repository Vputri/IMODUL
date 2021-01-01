package vika.IModul.PTA.SI.Java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class java12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java12);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView36);
        pdfView.fromAsset("JAVA12.pdf").load();
    }
}