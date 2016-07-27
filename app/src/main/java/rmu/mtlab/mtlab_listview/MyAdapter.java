package rmu.mtlab.mtlab_listview;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by worawith on 7/27/2016.
 */
public class MyAdapter extends BaseAdapter {

    String[] menu;
    int[] pic;
    Context context;
    // Constructor method
    public MyAdapter(String[] menu,int[] pic,Context context){
        this.menu=menu;
        this.pic=pic;
        this.context=context;
    }

    @Override
    public int getCount() {
        return menu.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // ต้องการอ้างหา layout
            view = inflater.inflate(R.layout.layout_item, null);
            // อ้างไปหา view ใน layout
            ImageView img = (ImageView) view.findViewById(R.id.imgPic);
            TextView name = (TextView) view.findViewById(R.id.tvName);
            TextView time = (TextView) view.findViewById(R.id.tvTime);

            // กำหนดค่า ให้กับรูปภาพ และข้อความใน layout
            img.setImageResource(pic[i]);
            name.setText(menu[i]);
            name.setTextColor(Color.BLACK);
            time.setText("*");
            time.setTextColor(Color.RED);

        return view;
    }//method

}//class
