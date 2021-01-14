package vika.IModul.PTA.akuntansi.pajak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class pajak4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pajak4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewpajak4);
        pdfView.fromAsset("pajak4.pdf").load();
    }
}