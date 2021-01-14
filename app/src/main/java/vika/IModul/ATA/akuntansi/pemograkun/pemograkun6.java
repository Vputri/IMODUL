package vika.IModul.ATA.akuntansi.pemograkun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pemograkun6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemograkun6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpemograkun6);
        pdfView.fromAsset("pemograkun6.pdf").load();
    }
}