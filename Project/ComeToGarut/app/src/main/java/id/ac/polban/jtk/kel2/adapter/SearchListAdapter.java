package id.ac.polban.jtk.kel2.adapter;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

import id.ac.polban.jtk.kel2.activity.R;
import id.ac.polban.jtk.kel2.models.TempatWisata;

public class SearchListAdapter extends ListAdapter<TempatWisata>
{

    public SearchListAdapter(Activity activity, List<TempatWisata> listData)
    {
        super(activity, listData);
    }

    @Override
    public void doItemView(TempatWisata data, View view)
    {
        TextView title = view.findViewById(R.id.item_title);
        TextView desc = view.findViewById(R.id.item_description);
        NetworkImageView photo = (NetworkImageView) view.findViewById(R.id.item_photo);

        title.setText(data.getNama_tempat());
        desc.setText(data.getDeskripsi());

        photo.setImageUrl(data.getUrl_photo(), this.imageLoader);

        LinearLayout itemList = view.findViewById(R.id.item_search);

        itemList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {

            }

        });
    }

}