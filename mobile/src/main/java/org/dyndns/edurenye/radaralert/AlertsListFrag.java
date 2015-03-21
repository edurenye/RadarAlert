package org.dyndns.edurenye.radaralert;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class AlertsListFrag extends android.support.v4.app.ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String[] values = new String[] { "Radar1", "Radar2", "Alerta1",
                "Alerta2" };
        String[] desciptions = new String[] { "", "", "Camió volcat",
                "Retencions per obres" };
        AlertArrayAdapter<String> adapter = new AlertArrayAdapter<String>(getActivity(),
                R.layout.alert_list_item, values, desciptions);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // do something with the data
    }

}

