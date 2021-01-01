package vika.IModul.PTA.SI.Java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class java10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java10);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView34);
        pdfView.fromAsset("JAVA10.pdf").load();
    }
}