package vika.IModul.PTA.akuntansi.aklan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class aklan2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aklan2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewaklan2);
        pdfView.fromAsset("aklan2.pdf").load();
    }
}