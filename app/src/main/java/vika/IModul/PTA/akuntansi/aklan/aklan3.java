package vika.IModul.PTA.akuntansi.aklan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class aklan3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aklan3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewaklan3);
        pdfView.fromAsset("aklan3.pdf").load();
    }
}