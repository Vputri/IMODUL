package vika.IModul.ATA.manajemen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class man_riset2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.man_riset2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewmanriset2);
        pdfView.fromAsset("man_riset2.pdf").load();
    }
}