package com.subhajit.triode.com.listviewwithpopupmenu;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by HawkEye on 11-07-2017.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;
    private String[] myArray;

    public MyAdapter(Context context, String[] myArray) {
        this.context = context;
        this.myArray = myArray;
    }

    @Override
    public int getCount() {
        return myArray.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        if(view==null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.list_item, null, false);
        }
            TextView tv=(TextView)view.findViewById(R.id.tv);
            tv.setText(myArray[i]);

            final ImageButton bt=(ImageButton)view.findViewById(R.id.bt);
            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    PopupMenu popupMenu=new PopupMenu(context,bt);
                    popupMenu.getMenuInflater().inflate(R.menu.my_menu,popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            Toast.makeText(context,menuItem.getTitle()+" of "+myArray[i],Toast.LENGTH_SHORT).show();
                            return true;
                        }
                    });
                    popupMenu.show();
                }
            });
        return view;
    }
}
