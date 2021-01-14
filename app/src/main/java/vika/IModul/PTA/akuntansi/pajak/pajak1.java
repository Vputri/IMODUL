package vika.IModul.PTA.akuntansi.pajak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pajak1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pajak1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpajak1);
        pdfView.fromAsset("pajak1.pdf").load();
    }
}