package id.ac.polban.jtk.kel2.controllers;

import android.app.Application;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

import id.ac.polban.jtk.kel2.cache.LruBitmapCache;

public class SearchController extends Application
{
    public static final String TAG = SearchController.class.getSimpleName();
    private static SearchController INSTANCE;

    public static synchronized SearchController getInstance()
    {
        return INSTANCE;
    }

    private RequestQueue requestQueue;
    private ImageLoader imageLoader;

    @Override
    public void onCreate()
    {
        super.onCreate();
        INSTANCE = this;
    }

    public RequestQueue getRequestQueue()
    {
        if(this.requestQueue == null)
            this.requestQueue = Volley.newRequestQueue(this.getApplicationContext());

        return this.requestQueue;
    }

    public ImageLoader getImageLoader()
    {
        RequestQueue req = this.getRequestQueue();

        if(this.imageLoader == null)
            this.imageLoader = new ImageLoader(req, new LruBitmapCache());

        return this.imageLoader;
    }

    public <T> void addToRequestQueue(Request<T> request)
    {
        request.setTag(TAG);
        this.getRequestQueue().add(request);
    }

    public <T> void addToRequestQueue(Request<T> request, String tag)
    {
        request.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        this.getRequestQueue().add(request);
    }

    public void cancelPendingRequest(Object tag)
    {
        if(this.requestQueue != null)
            this.requestQueue.cancelAll(tag);
    }

}