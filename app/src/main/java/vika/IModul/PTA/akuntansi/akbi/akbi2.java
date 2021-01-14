package vika.IModul.PTA.akuntansi.akbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akbi2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akbi2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakbi2);
        pdfView.fromAsset("akbi2.pdf").load();
    }
}