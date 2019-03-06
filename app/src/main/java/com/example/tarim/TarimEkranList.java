package com.example.tarim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TarimEkranList extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarim_ekran_list);
        Intent intent = getIntent();
        String il = intent.getStringExtra("il");
        double pH = getIntent().getExtras().getDouble("pH");

        listView = findViewById(R.id.listView);
        final ArrayList<String> urunlerList = new ArrayList<>();
        final Map<String, String> urunler = new HashMap<String, String>();
        urunler.put("Yonca", "Yonca");
        urunler.put("Elma", "Elma");
        urunler.put("Arpa", "Arpa");
        urunler.put("Lahana", "Lahana");
        urunler.put("Havuç", "Havuç");
        urunler.put("Mısır", "Mısır");
        urunler.put("Pamuk", "Pamuk");
        urunler.put("Salatalık", "Salatalık");
        urunler.put("Marul", "Marul");
        urunler.put("Yulaf", "Yulaf");
        urunler.put("Soğan", "Soğan");
        urunler.put("Bezelye", "Bezelye");
        urunler.put("Biber", "Biber");
        urunler.put("Ispanak", "Ispanak");
        urunler.put("Kabak", "Kabak");
        urunler.put("Çilek", "Çilek");
        urunler.put("Tütün", "Tütün");
        urunler.put("Domates", "Domates");
        urunler.put("Buğday", "Buğday");
        urunler.put("Pancar", "Pancar");

        for (int i = 0; i < 3; i++) {
            Toast.makeText(getApplicationContext(), "Anız yakımı, atmosfere karbondioksit salarak küresel ısınmaya da katkıda bulunmaktadır." +
                    " Yaban hayatı açısından da anız yakmanın ciddi etkileri vardır.", Toast.LENGTH_LONG).show();


        }
        for (int i = 0; i < 3; i++) {

            Toast.makeText(getApplicationContext(), "Ekin biçilirken yere düşen taneciklerden birçok evcil ve yabani hayvan beslenmektedir. Anız yakılırken bu tanecikler de yandıkları için, " +
                    "yaban hayatı bir besin kaynağını kaybetmiş ve belki de onu bekleyen kışı daha zor geçirmeye mahkum edilmiş olmaktadır.", Toast.LENGTH_LONG).show();
        }

        for (int i = 0; i < 3; i++) {
            Toast.makeText(getApplicationContext(), "Anızı yakma neticesinde gerek tarımsal ekosistem ve gerekse doğal ekosistem tahrip edilmektedir. Özellikle topraktaki Karbon (C) ve Azot (N) dengesi yok olmakta ve tarlalar verimsizleşmektedir." +
                    " Anız yakmanın neden olduğu olumsuzluklar aşağıda belirtilmiştir.", Toast.LENGTH_LONG).show();


        }


        try {


            if (il.equals("Adana")) {

                if (pH >= 5.0 && pH < 5.5) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Mısır"));
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Tütün"));
                    urunlerList.add(urunler.get("Çilek"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 5.5 && pH < 6.0) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Pamuk"));
                    urunlerList.add(urunler.get("Mısır"));
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Domates"));
                    urunlerList.add(urunler.get("Kabak"));
                    urunlerList.add(urunler.get("Biber"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 6.0 && pH < 6.5) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Mısır"));
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Kabak"));
                    urunlerList.add(urunler.get("Yonca"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 6.5 && pH < 7.0) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Mısır"));
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Yonca"));
                    urunlerList.add(urunler.get("Pancar"));

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 7.0 && pH <= 7.5) {
                    urunlerList.clear();

                    urunlerList.add(urunler.get("Yonca"));
                    urunlerList.add(urunler.get("Elma"));
                    urunlerList.add(urunler.get("Domates"));
                    ;
                    urunlerList.add(urunler.get("Biber"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                }


            } else if (il.equals("Malatya")) {
                if (pH >= 5.0 && pH < 5.5) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Lahana"));
                    urunlerList.add(urunler.get("Arpa"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 5.5 && pH < 6.0) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Yulaf"));
                    urunlerList.add(urunler.get("Mısır"));
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Ispanak"));
                    urunlerList.add(urunler.get("Domates"));
                    ;
                    urunlerList.add(urunler.get("Biber"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 6.0 && pH < 6.5) {
                    urunlerList.clear();

                    urunlerList.add(urunler.get("Domates"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Havuç"));
                    urunlerList.add(urunler.get("Yonca"));
                    urunlerList.add(urunler.get("Kabak"));
                    urunlerList.add(urunler.get("Biber"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 6.5 && pH < 7.0) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Salatalık"));
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Yonca"));
                    urunlerList.add(urunler.get("Pancar"));

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 7.0 && pH <= 7.5) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Bezelye"));
                    urunlerList.add(urunler.get("Mısır"));
                    urunlerList.add(urunler.get("Yonca"));
                    urunlerList.add(urunler.get("Elma"));

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                }


            } else if (il.equals("Konya")) {

                if (pH >= 5.0 && pH < 5.5) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Arpa"));

                    urunlerList.add(urunler.get("Yonca"));
                    urunlerList.add(urunler.get("Mısır"));
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Kabak"));
                    urunlerList.add(urunler.get("Biber"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 5.5 && pH < 6.0) {
                    urunlerList.clear();

                    urunlerList.add(urunler.get("Yulaf"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Pamuk"));
                    urunlerList.add(urunler.get("Soğan"));
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Kabak"));

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 6.0 && pH < 6.5) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Biber"));
                    urunlerList.add(urunler.get("Mısır"));
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Kabak"));
                    urunlerList.add(urunler.get("Yonca"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 6.5 && pH < 7.0) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Tütün"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Yonca"));
                    urunlerList.add(urunler.get("Pancar"));

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 7.0 && pH <= 7.5) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Yulaf"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Yonca"));
                    urunlerList.add(urunler.get("Elma"));

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                }

            } else if (il.equals("Batman")) {
                if (pH >= 5.0 && pH < 5.5) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Kabak"));
                    urunlerList.add(urunler.get("Ispanak"));
                    urunlerList.add(urunler.get("Tütün"));
                    urunlerList.add(urunler.get("Çilek"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 5.5 && pH < 6.0) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Marul"));
                    urunlerList.add(urunler.get("Mısır"));
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Domates"));
                    urunlerList.add(urunler.get("Kabak"));
                    urunlerList.add(urunler.get("Biber"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 6.0 && pH < 6.5) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Mısır"));
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Kabak"));
                    urunlerList.add(urunler.get("Yonca"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 6.5 && pH < 7.0) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Marul"));
                    urunlerList.add(urunler.get("Biber"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Yonca"));
                    urunlerList.add(urunler.get("Pancar"));

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 7.0 && pH <= 7.5) {
                    urunlerList.clear();

                    urunlerList.add(urunler.get("Yulaf"));
                    urunlerList.add(urunler.get("Marul"));
                    urunlerList.add(urunler.get("Arpa"));

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                }


            } else if (il.equals("Van")) {
                if (pH >= 5.0 && pH < 5.5) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Tütün"));
                    urunlerList.add(urunler.get("Çilek"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 5.5 && pH < 6.0) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Marul"));
                    urunlerList.add(urunler.get("Mısır"));

                    urunlerList.add(urunler.get("Domates"));
                    urunlerList.add(urunler.get("Kabak"));
                    urunlerList.add(urunler.get("Biber"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 6.0 && pH < 6.5) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Mısır"));
                    urunlerList.add(urunler.get("Çilek"));
                    urunlerList.add(urunler.get("Arpa"));
                    urunlerList.add(urunler.get("Kabak"));
                    urunlerList.add(urunler.get("Yonca"));
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 6.5 && pH < 7.0) {
                    urunlerList.clear();
                    urunlerList.add(urunler.get("Salatalık"));
                    urunlerList.add(urunler.get("Soğan"));
                    urunlerList.add(urunler.get("Kabak"));
                    urunlerList.add(urunler.get("Ispanak"));
                    urunlerList.add(urunler.get("Elma"));
                    urunlerList.add(urunler.get("Yonca"));

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                } else if (pH >= 7.0 && pH <= 7.5) {
                    urunlerList.clear();

                    urunlerList.add(urunler.get("Buğday"));
                    urunlerList.add(urunler.get("Ispanak"));
                    urunlerList.add(urunler.get("Pancar"));

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, urunlerList);
                    listView.setAdapter(arrayAdapter);

                }


            }


        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
