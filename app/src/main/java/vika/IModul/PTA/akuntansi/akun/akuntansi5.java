package vika.IModul.PTA.akuntansi.akun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akuntansi5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akuntansi5);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakun5);
        pdfView.fromAsset("akun5.pdf").load();
    }
}