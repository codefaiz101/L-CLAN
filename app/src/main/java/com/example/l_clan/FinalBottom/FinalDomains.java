package com.example.l_clan.FinalBottom;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.l_clan.Adapter.DomainAdapter;
import com.example.l_clan.Classes.RecyclerItemClickListener;
import com.example.l_clan.Domains.AndroidDevelopment.Android_Development_Activity;
import com.example.l_clan.Domains.DomainsPartActivity;
import com.example.l_clan.Domains.WebDevelopment.WebActivity;
import com.example.l_clan.Models.DomainModels;
import com.example.l_clan.OtherActivities.MainActivity2;
import com.example.l_clan.R;

import java.util.ArrayList;


public class FinalDomains extends Fragment {


    public FinalDomains() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_final_domains, container, false);



           recyclerView = view.findViewById(R.id.recyclerview);


            ArrayList<DomainModels> list = new ArrayList<>();
//          list.add(new DomainModels("WEB APPLICATION DEVELOPMENT"),R.drawable.webdevelopment);
            list.add(new DomainModels("WEB DEVELOPMENT", R.drawable.webdevelopment));
            list.add(new DomainModels("MOBILE APPICATION DEVELOPMENT", R.drawable.appdevelopment));
            list.add(new DomainModels("CLOUD DEVELOPMENT", R.drawable.clouddevelopment));
            list.add(new DomainModels("CYBER SECURITY DEVELOPMENT", R.drawable.cybersecurity));
            list.add(new DomainModels("BLOCKCHAIN DEVELOPMENT", R.drawable.blockchiandevelopment));
            list.add(new DomainModels("ARTIFICIAL INTELLEGENCE DEVELOPMENT", R.drawable.aidevelopment));
            list.add(new DomainModels("DATABASE DEVELOPMENT", R.drawable.databasedevelopment));
            DomainAdapter adapter = new DomainAdapter(list , getContext());
            recyclerView.setAdapter(adapter);
            LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(layoutManager);


            recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                    getContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    switch (position){
                        case 0:
                            Intent intent = new Intent(getContext(), WebActivity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(getContext(), Android_Development_Activity.class);
                            startActivity(intent1);
                            break;

                        case 2:
                            Intent intent2 = new Intent(getContext(), MainActivity2.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(getContext(),MainActivity2.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(getContext(),MainActivity2.class);
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(getContext(),MainActivity2.class);
                            startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6 = new Intent(getContext(),MainActivity2.class);
                            startActivity(intent6);
                            break;
                        case 7:
                            Intent intent7 = new Intent(getContext(),MainActivity2.class);
                            startActivity(intent7);
                            break;
                        default:
                            Intent intent8 = new Intent(getContext(), DomainsPartActivity.class);
                    }
                }

                @Override
                public void onLongItemClick(View view, int position) {

                }
            }));

        return  view;
    }
}