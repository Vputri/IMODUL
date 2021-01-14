package vika.IModul.PTA.akuntansi.pajak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pajak7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pajak7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpajak7);
        pdfView.fromAsset("pajak7.pdf").load();
    }
}