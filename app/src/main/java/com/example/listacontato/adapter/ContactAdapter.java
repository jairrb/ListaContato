package com.example.listacontato.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.listacontato.R;
import com.example.listacontato.model.Contacts;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private List<Contacts> contactslist;

    public ContactAdapter(List<Contacts> contactslist) {
        this.contactslist = contactslist;
    }

    //Metodo responsavel por inflar o layout
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout_contact_contact_item, viewGroup, false);
        return new ViewHolder(view);
    }

    //Cria uma nova instancia e atribui o valor da posição da lista
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Contacts newContact = contactslist.get(i);
        viewHolder.bind(newContact);
    }

    //Retorna o tamanho da lisita
    @Override
    public int getItemCount() {
        return contactslist.size();
    }

    //Class ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView contactName;
        TextView contactPhone;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contactName = itemView.findViewById(R.id.textViewName);
            contactPhone = itemView.findViewById(R.id.textViewPhone);
        }

        public void bind(Contacts contacts) {
            contactName.setText(contacts.getName());
            contactPhone.setText(contacts.getPhone());
        }
    }
}