package vika.IModul.PTA.akuntansi.akbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akbi3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akbi3);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakbi3);
        pdfView.fromAsset("akbi3.pdf").load();
    }
}