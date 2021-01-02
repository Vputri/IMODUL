package vika.IModul.PTA.TI.SO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class So3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_so3);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView82);
        pdfView.fromAsset("SO3.pdf").load();
    }
}