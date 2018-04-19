package id.ac.polban.jtk.kel2.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

import id.ac.polban.jtk.kel2.activity.PlaceActivity;
import id.ac.polban.jtk.kel2.activity.R;
import id.ac.polban.jtk.kel2.controllers.SearchController;
import id.ac.polban.jtk.kel2.models.TempatWisata;

public class SearchListAdapter extends ArrayAdapter<TempatWisata>
{

    public SearchListAdapter(@NonNull Context context, @NonNull List<TempatWisata> objects)
    {
        super(context, 0, objects);
    }

    @Nullable
    @Override
    public TempatWisata getItem(int position)
    {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup)
    {
        TempatWisata data = getItem(position);

        if (view == null)
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_search, viewGroup, false);

        TextView title = view.findViewById(R.id.item_title);
        TextView desc = view.findViewById(R.id.item_description);
        NetworkImageView photo = view.findViewById(R.id.item_photo);

        title.setText(data.getNama_tempat());
        desc.setText(data.getDeskripsi());

        photo.setImageUrl(data.getUrl_photo().toString(), SearchController.getInstance().getImageLoader());

        LinearLayout itemList = view.findViewById(R.id.item_search);

        itemList.setOnClickListener(view1 -> {
            TextView titleV = view1.findViewById(R.id.item_title);
            Intent intent = new Intent(super.getContext(), PlaceActivity.class);

            intent.putExtra("Title",titleV.getText());

            super.getContext().startActivity(intent);
        });

        return view;
    }

}