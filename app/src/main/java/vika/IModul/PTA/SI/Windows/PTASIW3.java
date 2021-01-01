package vika.IModul.PTA.SI.Windows;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class PTASIW3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptasiw3);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView14);
        pdfView.fromAsset("PTASIW_3.pdf").load();
    }
}