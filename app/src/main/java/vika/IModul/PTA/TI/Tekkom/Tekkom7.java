package vika.IModul.PTA.TI.Tekkom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class Tekkom7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tekkom7);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView94);
        pdfView.fromAsset("Tekkom7.pdf").load();
    }
}