package vika.IModul.PTA.akuntansi.akbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akbi5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akbi5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakbi5);
        pdfView.fromAsset("akbi5.pdf").load();
    }
}