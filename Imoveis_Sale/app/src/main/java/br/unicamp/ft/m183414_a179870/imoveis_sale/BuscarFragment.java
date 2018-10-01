package br.unicamp.ft.m183414_a179870.imoveis_sale;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BuscarFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BuscarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BuscarFragment extends Fragment {

    View view;
    Spinner spinnerValor;
    Spinner spinnerTipoImovel;
    RadioGroup radio;
    EditText lugar;
    CheckBox che1;
    CheckBox che2;
    CheckBox che3;
    CheckBox che4;

    private OnFragmentInteractionListener mListener;

    public BuscarFragment() {
        // Required empty public constructor
    }

    public static BuscarFragment newInstance(String param1, String param2) {
        BuscarFragment fragment = new BuscarFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public void onRadioButtonClick(View view){
        String text = ((RadioButton)view).getText().toString();
        Toast.makeText(this.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view == null){
            view = inflater.inflate(R.layout.fragment_buscar, container, false);
        }

        spinnerValor = view.findViewById(R.id.spinnerValor);
        spinnerTipoImovel = view.findViewById(R.id.spinnerTipoImovel);
        //radio = (RadioGroup) view.findViewById(R.id.radioGroup);
        lugar = view.findViewById(R.id.editLugar);
        che1 = view.findViewById(R.id.check1);
        che2 = view.findViewById(R.id.check2);
        che3 = view.findViewById(R.id.check3);
        che4 = view.findViewById(R.id.check4);

        che1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "1 Quarto", Toast.LENGTH_SHORT).show();
            }
        });

        che2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "2 Quartos", Toast.LENGTH_SHORT).show();
            }
        });

        che3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "3 Quartos", Toast.LENGTH_SHORT).show();
            }
        });

        che4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "4 Quartos", Toast.LENGTH_SHORT).show();
            }
        });


        radio = (RadioGroup) view.findViewById(R.id.radioGroup);
        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch(checkedId)
                {
                    case R.id.radioAlugar:
                        Toast.makeText(getContext(), "Alugar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioComprar:
                        Toast.makeText(getContext(), "Comprar", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

        

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View selectedItemView, int position, long id) {
                String txt = ((TextView)selectedItemView).getText().toString();
//                Toast.makeText(view,getContext(), txt, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };



        spinnerValor.setOnItemSelectedListener(itemSelectedListener);
        spinnerValor.setOnItemSelectedListener(itemSelectedListener);


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buscar, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    public void onCheckBox(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()){
            case R.id.check1:
                if(checked){
                    Toast.makeText(getContext(), "1 Quarto", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.check2:
                if(checked) {
                    Toast.makeText(getContext(), "2 Quartos", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }



//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
