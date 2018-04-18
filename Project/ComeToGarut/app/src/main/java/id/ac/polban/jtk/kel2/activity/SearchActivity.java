package id.ac.polban.jtk.kel2.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import id.ac.polban.jtk.kel2.adapter.SearchListAdapter;
import id.ac.polban.jtk.kel2.controllers.SearchController;
import id.ac.polban.jtk.kel2.models.TempatWisata;

public class SearchActivity extends AppCompatActivity
{
    // Log Tag
    private static final String TAG = SearchActivity.class.getSimpleName();

    // JSON Url dari Internet
    private static final String URL = "http://feduniverse.com/index.php/api/";

    private ProgressDialog progressDialog;

    private List<TempatWisata> listTempatWisata;

    private void hideProgressDialog()
    {
        if(this.progressDialog != null)
        {
            this.progressDialog.dismiss();
            this.progressDialog = null;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pencarian);

        this.listTempatWisata = new ArrayList<>();

        ListView listView = findViewById(R.id.list_search_result);

        SearchListAdapter listAdapterTWisata = new SearchListAdapter(this, this.listTempatWisata);

        listView.setAdapter(listAdapterTWisata);

        Button searchBtn = findViewById(R.id.search_btn);

        this.progressDialog = new ProgressDialog(this);

        this.progressDialog.setMessage("Loading...");

        this.progressDialog.show();

        JSONArray param = new JSONArray();

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.POST, URL, param, new Response.Listener<JSONArray>() {

            @Override
            public void onResponse(JSONArray response)
            {
                Log.d(TAG, response.toString());
                hideProgressDialog();

                for(int i=0; i<response.length(); i++)
                {
                    try
                    {
                        JSONObject jsonObject = response.getJSONObject(i);
                        TempatWisata tempatWisata = new TempatWisata();

                        tempatWisata.setNama_tempat(jsonObject.getString("nama_tempat"));
                        tempatWisata.setAlamat(jsonObject.getString("alamat"));
                        tempatWisata.setDeskripsi(jsonObject.getString("deskripsi"));

                        listTempatWisata.add(tempatWisata);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }

            }

        }, new Response.ErrorListener(){

            @Override
            public void onErrorResponse(VolleyError error)
            {
                VolleyLog.d(TAG, "Error : " + error);
                Toast.makeText(SearchActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
                hideProgressDialog();
            }

        });

        SearchController.getInstance().addToRequestQueue(jsonArrayRequest);

        searchBtn.setOnClickListener(new View.OnClickListener()
        {
            EditText itemSearchV = findViewById(R.id.search_title);
            String itemSearch = itemSearchV.getText().toString();

            @Override
            public void onClick(View view)
            {
                progressDialog.show();

                JSONArray param = new JSONArray();

                JsonArrayRequest searchRequest = new JsonArrayRequest(Request.Method.POST, URL.concat("get/").concat(itemSearch), param, new Response.Listener<JSONArray>() {

                    @Override
                    public void onResponse(JSONArray searchResponse)
                    {
                        Log.d(TAG, searchResponse.toString());
                        hideProgressDialog();

                        for(int i=0; i<searchResponse.length(); i++)
                        {
                            try
                            {
                                JSONObject jsonObject = searchResponse.getJSONObject(i);
                                TempatWisata wisata = new TempatWisata();

                                wisata.setNama_tempat(jsonObject.getString("nama_tempat"));
                                wisata.setAlamat(jsonObject.getString("alamat"));
                                wisata.setDeskripsi(jsonObject.getString("deskripsi"));

                                listTempatWisata.add(wisata);
                            }
                            catch (Exception e)
                            {
                                e.printStackTrace();
                            }
                        }

                    }

                }, new Response.ErrorListener(){

                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                        VolleyLog.d(TAG, "Error : " + error);
                        Toast.makeText(SearchActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
                        hideProgressDialog();
                    }

                });

                SearchController.getInstance().addToRequestQueue(searchRequest);
            }
        });

    }
}
