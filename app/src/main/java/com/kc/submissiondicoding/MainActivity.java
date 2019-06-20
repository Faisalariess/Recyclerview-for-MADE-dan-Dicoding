package com.kc.submissiondicoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "pesan saya" ;
    //step1
    private RecyclerView rvCategory;
    //step2
    private ArrayList<Club> list = new ArrayList<>();

    final String STATE_TITLE = "state_string";
    final String STATE_LIST = "state_list";
    final String STATE_MODE = "state_mode";
    int mode;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "bekerja");

        //step1
        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();

        //step2
        list.addAll(ClubData.getListData());
        showRecyclerList();
        showRecyclerCardView();
        showRecyclerGrid();
        if (savedInstanceState == null) {
            setActionBarTitle("Mode List");
            list.addAll(ClubData.getListData());
            showRecyclerList();
            mode = R.id.action_list;
        } else {
            String stateTitle = savedInstanceState.getString(STATE_TITLE);
            ArrayList<Club> stateList = savedInstanceState.getParcelableArrayList(STATE_LIST);
            int stateMode = savedInstanceState.getInt(STATE_MODE);
            setActionBarTitle(stateTitle);
            list.addAll(stateList);
            setMode(stateMode);
        }
    }
    private void showSelectedClub(Club club) {
        Log.i(TAG, "bekerja");
        Toast.makeText(this, "Kamu memilih " + club.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DetailClub.class);
        intent.putExtra(DetailClub.EXTRA_NAME, club.getName());
        intent.putExtra(DetailClub.EXTRA_DESC, club.getDetail());
        intent.putExtra(DetailClub.EXTRA_PHOTO, club.getPhoto());
        intent.putExtra(DetailClub.EXTRA_KOTA, club.getRemark());
        startActivity(intent);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.i(TAG, "bekerja");
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE, getSupportActionBar().getTitle().toString());
        outState.putParcelableArrayList(STATE_LIST, list);
        outState.putInt(STATE_MODE, mode);
    }
    private void showRecyclerList() {
        Log.i(TAG, "bekerja");
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListClubAdapter listClubAdapter = new ListClubAdapter(this);
        listClubAdapter.setListClub(list);
        rvCategory.setAdapter(listClubAdapter);
        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedClub(list.get(position));
            }
        });
    }
    private void showRecyclerGrid(){
        Log.i(TAG, "bekerja");
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridClubAdapter gridClubAdapter = new GridClubAdapter(this);
        gridClubAdapter.setListClub(list);
        rvCategory.setAdapter(gridClubAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedClub(list.get(position));
            }
        });
    }
    private void showRecyclerCardView(){
        Log.i(TAG, "bekerja");
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewClubAdapter cardViewClubAdapter = new CardViewClubAdapter(this);
        cardViewClubAdapter.setListClub(list);
        rvCategory.setAdapter(cardViewClubAdapter);
        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedClub(list.get(position));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.i(TAG, "bekerja");
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.i(TAG, "bekerja");
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        Log.i(TAG, "bekerja");
        String title = null;
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                Toast.makeText(this, "Mode List", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                Toast.makeText(this, "Mode Grid", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
                Toast.makeText(this, "Mode CardView", Toast.LENGTH_SHORT).show();
                break;
        }
        mode = selectedMode;
        setActionBarTitle(title);
    }
    private void setActionBarTitle(String title){
        Log.i(TAG, "bekerja");
        getSupportActionBar().setTitle(title);
    }
}
