package id.ac.polban.jtk.kel2.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.android.volley.toolbox.ImageLoader;

import java.util.List;

import id.ac.polban.jtk.kel2.activity.R;
import id.ac.polban.jtk.kel2.controllers.SearchController;

public abstract class ListAdapter<T> extends BaseAdapter
{
    protected Activity activity;
    protected LayoutInflater inflater;
    protected List<T> listData;
    protected ImageLoader imageLoader;

    public ListAdapter(Activity activity, List<T> listData)
    {
        this.activity = activity;
        this.listData = listData;
        this.imageLoader = SearchController.getInstance().getImageLoader();
    }

    @Override
    public int getCount()
    {
        return this.listData.size();
    }

    @Override
    public T getItem(int location)
    {
        return this.listData.get(location);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup)
    {
        if(this.inflater == null)
            this.inflater = (LayoutInflater) this.activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null)
            convertView = this.inflater.inflate(R.layout.pencarian, null);

        if(this.imageLoader == null)
            this.imageLoader = SearchController.getInstance().getImageLoader();

        T data = this.listData.get(position);

        this.doItemView(data, convertView);

        return convertView;
    }

    public abstract void doItemView(T data, View view);

}
