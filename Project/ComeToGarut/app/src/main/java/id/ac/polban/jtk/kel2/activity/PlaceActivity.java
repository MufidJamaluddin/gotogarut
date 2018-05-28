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
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.NetworkImageView;

import org.json.JSONObject;

import java.lang.ref.WeakReference;
import java.net.URI;

import id.ac.polban.jtk.kel2.controllers.SearchController;
import id.ac.polban.jtk.kel2.models.DetailTempatWisata;

public class PlaceActivity extends AppCompatActivity
{
    private static final String TAG = PlaceActivity.class.getSimpleName();

    private static final String URL = "http://cometogarut.gaetcita.com/index.php/jsonapi/TempatWisata/";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informasi_wisata);

        Integer id_tempat = super.getIntent().getIntExtra("id_tempat",1);
        String nama_tempat = super.getIntent().getStringExtra("Title");

        DetailTempatWisata detailTempatWisata = new DetailTempatWisata();

        NetworkImageView photoV = super.findViewById(R.id.photo);
        TextView titleV = super.findViewById(R.id.item_title);
        TextView addressV = super.findViewById(R.id.address);
        TextView priceV = super.findViewById(R.id.price);
        //TextView timeV = super.findViewById(R.id.time);
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

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, URL.concat(id_tempat.toString()), new JSONObject(), (JSONObject jsonObject) -> {
            Log.d(TAG, jsonObject.toString());
            try
            {
                detailTempatWisata.setNama_tempat(jsonObject.getString("nama_tempat"));
                detailTempatWisata.setAlamat(jsonObject.getString("alamat"));
                detailTempatWisata.setHarga(jsonObject.getString("harga"));
                detailTempatWisata.setDeskripsi(jsonObject.getString("deskripsi"));
                detailTempatWisata.setKontak(jsonObject.getString("kontak"));
                detailTempatWisata.setFasilitas(jsonObject.getString("fasilitas"));
                detailTempatWisata.setUrl_photo(new URI(jsonObject.getString("link_photo")));

                photoV.setImageUrl(detailTempatWisata.getUrl_photo().toString(), SearchController.getInstance().getImageLoader());
                titleV.setText(detailTempatWisata.getNama_tempat() + "");
                addressV.setText(detailTempatWisata.getAlamat() + "");
                priceV.setText(detailTempatWisata.getHarga() + "");
                facilityV.setText(detailTempatWisata.getFasilitas() + "");
                description.setText(detailTempatWisata.getDeskripsi() + "");
                contactV.setText(detailTempatWisata.getHarga() + "");
            }
            catch(Exception e)
            {
                Log.d(TAG, "Error : " + e.getMessage());
                e.printStackTrace();
            }

        }, error -> {
            Log.d(TAG, "Error : " + error.getMessage());
            Toast.makeText(PlaceActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
        });

        SearchController.getInstance().addToRequestQueue(jsonObjectRequest);

    }
}
