package vika.IModul.PTA.SI.COBOL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cobol1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobol1);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView38);
        pdfView.fromAsset("Cobol1.pdf").load();
    }
}