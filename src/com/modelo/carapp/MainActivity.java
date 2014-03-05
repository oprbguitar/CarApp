package com.modelo.carapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
   
	private ListView lv;

	private String title[] = { "Audi", "Chevrolet", "Hyunday", "KIA",
			"Mitsubishi", "Nissan", "Toyota", "Volskwagen" };

	private String desc[] = { "version: 1.5", "version: 1.6",
			"version: 2.0 & 2.1", "version: 2.2", "version: 2.3",
			"version: 3.0", "version: 4.0", "version: 4.1" };

	private int thumb[] = { R.drawable.audi, R.drawable.chevrolet,
			R.drawable.hyunday,R.drawable.kia, R.drawable.mitsubishi, R.drawable.nissan,
			R.drawable.toyota, R.drawable.volkswagen,
			 };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		   
		// initialize the variables:
				lv = (ListView) findViewById(R.id.listView);
				lv.setAdapter(new VersionAdapter(this));
				
			class VersionAdapter extends BaseAdapter {

				private LayoutInflater layoutInflater;
				
				public VersionAdapter(MainActivity activity) {
					// TODO Auto-generated constructor stub
					layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				    
				}
				

				@Override
				public int getCount() {
					// TODO Auto-generated method stub
					return title.length;
				}

				@Override
				public Object getItem(int position) {
					// TODO Auto-generated method stub
					return position;
				}

				@Override
				public long getItemId(int position) {
					// TODO Auto-generated method stub
					return position;
				}

				@Override
				public View getView(int position, View convertView, ViewGroup parent) {
					// TODO Auto-generated method stub

					View listItem = convertView;
					int pos = position;
					if (listItem == null) {
						listItem = layoutInflater.inflate(R.layout.list_item, null);
					}

					// Initialize the views in the layout
					ImageView iv = (ImageView) listItem.findViewById(R.id.thumb);
					TextView tvTitle = (TextView) listItem.findViewById(R.id.title);
					TextView tvDesc = (TextView) listItem.findViewById(R.id.desc);

					// set the views in the layout
					iv.setBackgroundResource(thumb[pos]);
					tvTitle.setText(title[pos]);
					tvDesc.setText(desc[pos]);

					return listItem;
				}
	    }	

}
	


        
    }
	
	
