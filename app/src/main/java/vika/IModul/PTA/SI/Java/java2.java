package vika.IModul.PTA.SI.Java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class java2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView26);
        pdfView.fromAsset("JAVA2.pdf").load();
    }
}