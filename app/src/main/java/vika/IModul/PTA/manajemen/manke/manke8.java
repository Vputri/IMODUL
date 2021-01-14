package vika.IModul.PTA.manajemen.manke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class manke8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manke8);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewmanke8);
        pdfView.fromAsset("Manke8.pdf").load();
    }
}