package vika.IModul.PTA.SI.Windows;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class PTASIW6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptasiw6);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView17);
        pdfView.fromAsset("PTASIW_6.pdf").load();
    }
}