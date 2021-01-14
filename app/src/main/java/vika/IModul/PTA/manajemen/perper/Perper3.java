package vika.IModul.PTA.manajemen.perper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class Perper3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perper3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewperper3);
        pdfView.fromAsset("Perper3.pdf").load();
    }
}