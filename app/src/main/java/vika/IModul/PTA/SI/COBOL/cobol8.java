package vika.IModul.PTA.SI.COBOL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cobol8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobol8);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView45);
        pdfView.fromAsset("Cobol8.pdf").load();
    }
}