package vika.IModul.ATA.akuntansi.pemograkun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pemograkun5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemograkun5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpemograkun5);
        pdfView.fromAsset("pemograkun5.pdf").load();
    }
}