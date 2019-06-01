package com.example.listacontato.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.listacontato.R;
import com.example.listacontato.adapter.ContactAdapter;
import com.example.listacontato.model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView listContactsRecyclerView;
    ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listContactsRecyclerView = findViewById(R.id.listContactsRecyclerView);
        contactAdapter = new ContactAdapter(contactsList());

        listContactsRecyclerView.setAdapter(contactAdapter);
        listContactsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Contacts> contactsList(){
        List<Contacts> contacts = new ArrayList<>();

        contacts.add(new Contacts("User A", "(11)99999-99999"));
        contacts.add(new Contacts("User B", "(11)99999-99999"));
        contacts.add(new Contacts("User C", "(11)99999-99999"));
        contacts.add(new Contacts("User D", "(11)99999-99999"));
        contacts.add(new Contacts("User E", "(11)99999-99999"));
        contacts.add(new Contacts("User F", "(11)99999-99999"));
        contacts.add(new Contacts("User G", "(11)99999-99999"));
        contacts.add(new Contacts("User H", "(11)99999-99999"));
        contacts.add(new Contacts("User I", "(11)99999-99999"));
        contacts.add(new Contacts("User J", "(11)99999-99999"));

        return contacts;

    }
}
