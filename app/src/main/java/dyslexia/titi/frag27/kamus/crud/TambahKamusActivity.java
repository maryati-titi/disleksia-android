package dyslexia.titi.frag27.kamus.crud;

import androidx.appcompat.app.AppCompatActivity;
import dyslexia.titi.frag27.R;
import dyslexia.titi.frag27.kamus.database.DatabaseDictionary;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class TambahKamusActivity extends AppCompatActivity {

    //inisilisasi elemen-elemen pada layout
    private Button buttonSubmit;
    private EditText edWord;
    private EditText edType;
    //inisialisasi kontroller/Data Source
    private DatabaseDictionary databaseDictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_kamus);
//
//        buttonSubmit = (Button) findViewById(R.id.buttom_submit);
//        buttonSubmit.setOnClickListener((View.OnClickListener) this);
//        edWord = (EditText) findViewById(R.id.et_word);
//        edType = (EditText) findViewById(R.id.et_type);

        // instanstiasi kelas DBDataSource
//        DatabaseDictionary databaseDictionary = new DatabaseDictionary(this);
//
//        //membuat sambungan baru ke database
//        databaseDictionary.open();

    }
//    public void onClik(View v){
//        String word;
//        String type;
//        Dictionary dictionary = null;
//
//        if(edWord.getText()==null && edType.getText()==null )
//        {
//            Toast.makeText(this, "Data Kosong\n" , Toast.LENGTH_LONG).show();
//        }
//        else if(edWord.getText()!=null && edType.getText()!=null )
//        {
//            /* jika field nama, merk, dan harga tidak kosong
//             * maka masukkan ke dalam data barang*/
//            word = edWord.getText().toString().trim();
//            type = edType.getText().toString().trim();
//            switch(v.getId())
//            {
//                case R.id.buttom_submit:
//                    // insert data barang baru
//                    dictionary =databaseDictionary.insert(word, type);
//
//                    //konfirmasi kesuksesan
//                    Toast.makeText(this, "masuk KATA\n" +
//                            "KATA" + dictionary.getWord() +
//                            "TIPE" + dictionary.getType(), Toast.LENGTH_LONG).show();
//                    break;
//            }
//        }
//
//
//
//
//    }
}
