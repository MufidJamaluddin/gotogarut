package id.ac.polban.jtk.kel2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.NetworkImageView;

import org.json.JSONArray;
import org.json.JSONObject;

import id.ac.polban.jtk.kel2.controllers.SearchController;

public class PlaceActivity extends AppCompatActivity
{
    private static final String TAG = PlaceActivity.class.getSimpleName();

    private static final String URL = "http://cometogarut.feduniverse.com/index.php/api/get/";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informasi_wisata);

        Integer id_tempat = super.getIntent().getIntExtra("id_tempat",1);
        String nama_tempat = super.getIntent().getStringExtra("Title");

        NetworkImageView photoV = super.findViewById(R.id.photo);
        TextView titleV = super.findViewById(R.id.item_title);
        TextView addressV = super.findViewById(R.id.address);
        TextView priceV = super.findViewById(R.id.price);
        TextView timeV = super.findViewById(R.id.time);
        TextView facilityV = super.findViewById(R.id.facility);
        TextView description = super.findViewById(R.id.description);
        TextView contactV = super.findViewById(R.id.contact);

        Button showGallery = super.findViewById(R.id.show_gallery);
        Button showReview = super.findViewById(R.id.show_rating);
        Button showMasukkan = super.findViewById(R.id.show_masukkan);

        /*showGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(PlaceActivity.this, );
            }
        });
        */

        showReview.setOnClickListener(view -> {
            Intent intent = new Intent(PlaceActivity.this, RatingActivity.class);
            intent.putExtra("id_tempat", id_tempat);
            PlaceActivity.this.startActivity(intent);
        });

        showMasukkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlaceActivity.this, MasukkanActivity.class);
                intent.putExtra("id_tempat", id_tempat);
                PlaceActivity.this.startActivity(intent);
            }
        });

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, URL.concat(nama_tempat.replace(" ", "%")), new JSONArray(), (JSONArray response) -> {
            Log.d(TAG, response.toString());
            try
            {
                JSONObject jsonObject = response.getJSONObject(0);

                titleV.setText(jsonObject.getString("nama_tempat"));
                addressV.setText(jsonObject.getString("alamat"));
                priceV.setText(jsonObject.getString("harga"));
                timeV.setText(jsonObject.getString("jam_kunjungan"));
                description.setText(jsonObject.getString("deskripsi"));
                contactV.setText(jsonObject.getString("kontak"));
                facilityV.setText(jsonObject.getString("fasilitas"));
                //detailTempatWisata.setLatitude(jsonObject.getString("latitude"));
                //detailTempatWisata.setLongitude(jsonObject.getString("longitude"));
                photoV.setImageUrl(jsonObject.getString("link_photo"), SearchController.getInstance().getImageLoader());
            }
            catch(Exception e)
            {
                Log.d(TAG, e.getMessage());
            }

        }, error -> {
            Log.d(TAG,error.getMessage());
            Toast.makeText(PlaceActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
        });

        SearchController.getInstance().addToRequestQueue(jsonArrayRequest);

    }
}
