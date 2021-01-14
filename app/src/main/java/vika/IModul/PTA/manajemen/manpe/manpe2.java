package vika.IModul.PTA.manajemen.manpe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class manpe2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manpe2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewmanpe2);
        pdfView.fromAsset("Manpe2.pdf").load();
    }
}