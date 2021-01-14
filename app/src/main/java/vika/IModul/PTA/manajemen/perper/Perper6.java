package vika.IModul.PTA.manajemen.perper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class Perper6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perper6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewperper6);
        pdfView.fromAsset("Perper6.pdf").load();
    }
}