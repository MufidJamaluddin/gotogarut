package id.ac.polban.jtk.kel2.activity;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import id.ac.polban.jtk.kel2.adapter.ListAdapter;
import id.ac.polban.jtk.kel2.adapter.SearchListAdapter;
import id.ac.polban.jtk.kel2.controllers.SearchController;
import id.ac.polban.jtk.kel2.models.TempatWisata;

public class SearchActivity extends AppCompatActivity
{
    // Log Tag
    private static final String TAG = SearchActivity.class.getSimpleName();

    // JSON Url dari Internet
    private static final String URL = "http://feduniverse.com/api";

    private ProgressDialog progressDialog;
    private ListView listView;
    private Button searchBtn;

    private List<TempatWisata> listTempatWisata;
    private SearchListAdapter listAdapterTWisata;

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

        this.listView = findViewById(R.id.list_search_result);

        this.listAdapterTWisata  = new SearchListAdapter(this, this.listTempatWisata);

        this.listView.setAdapter(this.listAdapterTWisata);

        this.searchBtn = findViewById(R.id.search_btn);

        this.progressDialog = new ProgressDialog(this);

        this.searchBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                progressDialog.setMessage("Loading...");
                progressDialog.show();

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
                        hideProgressDialog();
                    }

                });

                SearchController.getInstance().addToRequestQueue(jsonArrayRequest);
            }
        });

    }
}
