package vika.IModul.PTA.manajemen.perper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class Perper8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perper8);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewperper8);
        pdfView.fromAsset("Perper8.pdf").load();
    }
}