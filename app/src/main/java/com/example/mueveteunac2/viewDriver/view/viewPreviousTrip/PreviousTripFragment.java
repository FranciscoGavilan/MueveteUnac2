package com.example.mueveteunac2.viewDriver.view.viewPreviousTrip;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.mueveteunac2.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.GeoPoint;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PreviousTripFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PreviousTripFragment extends Fragment {

    Button btnSubirRuta;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PreviousTripFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PreviousTripFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PreviousTripFragment newInstance(String param1, String param2) {
        PreviousTripFragment fragment = new PreviousTripFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_previous_trip, container, false);

        FirebaseFirestore db=FirebaseFirestore.getInstance();

        btnSubirRuta=view.findViewById(R.id.btnSubirRuta);

        btnSubirRuta.setOnClickListener(v -> {
            /*Map<String, Object> data = new HashMap<>();
            data.put("routeId", "R012");
            data.put("routeSchedule", "22:20");
            data.put("tunId", "TN");
            data.put("turn", "Noche");
            data.put("stopId", "S0531");
            data.put("stopName", "Paradero Lima Cargo");
            data.put("stopPosition", new GeoPoint(-12.02863,-77.10254));
            data.put("stopOrder", 11);
            data.put("lineId", "L006");


            db.collection("Route")
                    .add(data)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Toast.makeText(getContext(),"Se agrego correctamente",Toast.LENGTH_SHORT).show();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getContext(),"No se agrego el documento",Toast.LENGTH_SHORT).show();
                        }
                    });*/
        });
        return view;
    }
}