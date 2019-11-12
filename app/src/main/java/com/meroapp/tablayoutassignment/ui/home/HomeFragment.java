package com.meroapp.tablayoutassignment.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.meroapp.tablayoutassignment.R;
import com.meroapp.tablayoutassignment.adapter.ContactsAdapter;
import com.meroapp.tablayoutassignment.model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=root.findViewById(R.id.recyclerView);
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Bhuwan Kc","980522136",R.drawable.bhuwan));
        contactsList.add(new Contacts("Dayahang Rai","9845225659",R.drawable.dahayang));
        contactsList.add(new Contacts("Saugat Malla","989846546",R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan Kc","980522136",R.drawable.bhuwan));
        contactsList.add(new Contacts("Dayahang Rai","9845225659",R.drawable.dahayang));
        contactsList.add(new Contacts("Saugat Malla","989846546",R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan Kc","980522136",R.drawable.bhuwan));
        contactsList.add(new Contacts("Dayahang Rai","9845225659",R.drawable.dahayang));
        contactsList.add(new Contacts("Saugat Malla","989846546",R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan Kc", "980522136", R.drawable.bhuwan));
        contactsList.add(new Contacts("Dayahang Rai", "9845225659", R.drawable.dahayang));
        contactsList.add(new Contacts("Saugat Malla", "989846546", R.drawable.saugat));

        ContactsAdapter contactsAdapter = new ContactsAdapter(getActivity(),contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;
    }
}