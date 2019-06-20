package com.kc.submissiondicoding;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class DetailClub extends AppCompatActivity {

    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_DESC = "extra_detail";
    public static String EXTRA_PHOTO = "extra_photo";
    public static String EXTRA_KOTA = "extra_remark";

    private ImageView tvPhoto;
    private TextView tvName, tvDesc, tvKota;
    private Context context;
    private ArrayList<Club> listClub;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_club);

        tvPhoto = (ImageView)findViewById(R.id.img_item_photo);
        if (getIntent().getExtras() != null){
            String imageUrl = getIntent().getExtras().getString(EXTRA_PHOTO);
            Glide.with(this)
                    .load(imageUrl)
                    .into(tvPhoto);
        }

        tvName = (TextView)findViewById(R.id.tv_item_name);
        String name= getIntent().getStringExtra(EXTRA_NAME);
        tvName.setText(name);

        tvDesc = (TextView)findViewById(R.id.detail);
        String desc = getIntent().getStringExtra(EXTRA_DESC);
        tvDesc.setText(desc);

        tvKota = (TextView)findViewById(R.id.tv_item_remark);
        String remark = getIntent().getStringExtra(EXTRA_KOTA);
        tvKota.setText(remark);

    }

}
