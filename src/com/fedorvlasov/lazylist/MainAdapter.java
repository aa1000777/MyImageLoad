package com.fedorvlasov.lazylist;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 ***************************************************** 
 * <hr>
 * <dt><span class="strong">类功能简介:</span></dt>
 * <dd>Coffee</dd>
 * <dt><span class="strong">创建时间:</span></dt>
 * <dd>2015-2-3 上午11:50:53</dd>
 * <dt><span class="strong">公司:</span></dt>
 * <dd>Adapter</dd>
 * 
 * @author aa1000777 - Email:aa1000777@qq.com
 ***************************************************** 
 */

public class MainAdapter extends BaseAdapter {

	private Activity activity;
	private String[] data;
	private static LayoutInflater inflater = null;
	public ImageLoader imageLoader;

	public MainAdapter(Activity a, String[] d) {
		activity = a;
		data = d;
		inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		imageLoader = new ImageLoader(activity.getApplicationContext());
	}

	public int getCount() {
		return data.length;
	}

	public Object getItem(int position) {
		return position;
	}

	public long getItemId(int position) {
		return position;
	}

	@SuppressLint("InflateParams")
	public View getView(int position, View convertView, ViewGroup parent) {
		View vi = convertView;
		if (convertView == null) {
			vi = inflater.inflate(R.layout.item, null);
		}
		ImageView image = (ImageView) vi.findViewById(R.id.image);
		imageLoader.DisplayImage(data[position], image);
		return vi;
	}
}