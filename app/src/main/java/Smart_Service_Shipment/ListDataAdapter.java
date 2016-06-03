package Smart_Service_Shipment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.nalini.navi1.R;

import java.util.ArrayList;
import java.util.List;


public class ListDataAdapter extends ArrayAdapter {

    List list=new ArrayList();
    public ListDataAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class LayoutHandler
    {
        TextView NAME,MOB,EMAIL,PADDRESS,TADDRESS;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row=convertView;
        LayoutHandler layoutHandler;
        if(row==null)
        {

            LayoutInflater layoutInflater=(LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            row=layoutInflater.inflate(R.layout.row_layout,parent,false);
            layoutHandler=new LayoutHandler();
            layoutHandler.NAME=(TextView)row.findViewById(R.id.text_name);
            layoutHandler.MOB=(TextView)row.findViewById(R.id.text_mob);
            layoutHandler.EMAIL=(TextView)row.findViewById(R.id.text_email);
            layoutHandler.PADDRESS=(TextView)row.findViewById(R.id.text_paddress);
            layoutHandler.TADDRESS=(TextView)row.findViewById(R.id.text_taddress);



            row.setTag(layoutHandler);

        }
        else {
            layoutHandler=(LayoutHandler)row.getTag();


        }

        DataProvider dataProvider=(DataProvider)this.getItem(position);
        layoutHandler.NAME.setText(dataProvider.getName());
        layoutHandler.MOB.setText(dataProvider.getMob());
        layoutHandler.EMAIL.setText(dataProvider.getEmail());
        layoutHandler.PADDRESS.setText(dataProvider.getPaddress());
        layoutHandler.TADDRESS.setText(dataProvider.getTaddress());





        return row;
    }
}
