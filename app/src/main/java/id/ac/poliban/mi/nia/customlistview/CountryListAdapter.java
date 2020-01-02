package id.ac.poliban.mi.nia.customlistview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class CountryListAdapter extends BaseAdapter {
    private List<Country> data = new ArrayList<>();

    public CountryListAdapter(List<Country> data) {
        this.data = data;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgFlag;
        TextView tvCountryName;
        TextView tvCountryDetail;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_country_list, parent, false);

        imgFlag = convertView.findViewById(R.id.img_country_flag);
        tvCountryName = convertView.findViewById(R.id.tv_country_name);
        tvCountryDetail = convertView.findViewById(R.id.tv_country_detail);

        Glide.with(parent.getContext())
                .load(data.get(position).getFlag())
                .apply(new RequestOptions().override(90, 55))
                .into(imgFlag);
        tvCountryName.setText(data.get(position).getCountryName());
        tvCountryDetail.setText("Klick For More Information");

        return convertView;
    }
}


