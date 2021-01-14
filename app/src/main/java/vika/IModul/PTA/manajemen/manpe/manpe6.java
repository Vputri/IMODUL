package vika.IModul.PTA.manajemen.manpe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class manpe6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manpe6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewmanpe6);
        pdfView.fromAsset("Manpe6.pdf").load();
    }
}