package vika.IModul.PTA.TI.SO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class So5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_so5);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView84);
        pdfView.fromAsset("SO5.pdf").load();
    }
}