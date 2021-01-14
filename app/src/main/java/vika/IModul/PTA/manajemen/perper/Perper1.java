package vika.IModul.PTA.manajemen.perper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class Perper1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perper1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewperper1);
        pdfView.fromAsset("Perper1.pdf").load();
    }
}