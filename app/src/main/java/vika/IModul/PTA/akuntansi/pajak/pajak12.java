package vika.IModul.PTA.akuntansi.pajak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pajak12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pajak12);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpajak12);
        pdfView.fromAsset("pajak12.pdf").load();
    }
}