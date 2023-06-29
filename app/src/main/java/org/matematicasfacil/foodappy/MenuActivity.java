package org.matematicasfacil.foodappy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import org.matematicasfacil.foodappy.databinding.ActivityMainBinding;
import org.matematicasfacil.foodappy.databinding.ActivityMenuBinding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMenuBinding binding = ActivityMenuBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        List<String> listaDeMenus = new ArrayList<>();

        listaDeMenus.add("Puré de calabacín");
        listaDeMenus.add("Tortilla de patatas");
        listaDeMenus.add("Albóndigas de pollo");
        listaDeMenus.add("Ensalada de tomate");
        listaDeMenus.add("Leche, pan con aceite y fruta");
        listaDeMenus.add("Lentejas vegetales");
        listaDeMenus.add("Croquetas de atún");
        listaDeMenus.add("Menestra de verduras");
        listaDeMenus.add("Sardinas al horno");
        listaDeMenus.add("Leche, pan con aceite y fruta");
        listaDeMenus.add("Macarrones con verduras");
        listaDeMenus.add("Pollo al jugo");
        listaDeMenus.add("Sopa juliana");
        listaDeMenus.add("Corvina al ajillo");
        listaDeMenus.add("Leche, pan con aceite y fruta");
        listaDeMenus.add("Pollo a la braza");
        listaDeMenus.add("Sopa Huantan");
        listaDeMenus.add("Cebiche");
        listaDeMenus.add("Papa a la Huancaina");

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listaDeMenus);
        binding.ListViewMenu.setAdapter(adapter);
    }
}