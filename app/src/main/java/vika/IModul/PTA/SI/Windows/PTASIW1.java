package vika.IModul.PTA.SI.Windows;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class PTASIW1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptasiw1);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView12);
        pdfView.fromAsset("PTASIW_1.pdf").load();
    }
}