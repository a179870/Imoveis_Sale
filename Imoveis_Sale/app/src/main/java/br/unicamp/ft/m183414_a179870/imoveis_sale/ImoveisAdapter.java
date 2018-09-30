package br.unicamp.ft.m183414_a179870.imoveis_sale;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.widget.Toast;

import br.unicamp.ft.m183414_a179870.imoveis_sale.Imoveis;

public class ImoveisAdapter extends RecyclerView.Adapter {


    private ArrayList<Imovel> imoveis;
//    private MyOnLongItemClickListener myOnLongItemClickListener;


    public ImoveisAdapter(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }


    public ArrayList<Imovel> getAlunos() {
        return imoveis;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.adapter_imoveis_layout, viewGroup, false);

//        v.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                if (myOnLongItemClickListener != null) {
//                    Toast.makeText(v.getContext(), "Biografia", Toast.LENGTH_SHORT).show();
//
//
//                }
//                return true;
//            }
//
//
//        });

        return new ImoveisViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ((ImoveisViewHolder)viewHolder).bind(imoveis.get(i));
    }

    @Override
    public int getItemCount() {
        return this.imoveis.size();
    }

    public class ImoveisViewHolder extends ViewHolder {
        private ImageView foto;
        private TextView nome;
        private TextView endereco;
        private TextView contato;
        private TextView valor;


        public ImoveisViewHolder(View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.foto);
            nome = itemView.findViewById(R.id.nome);
            endereco = itemView.findViewById(R.id.endereco);
            contato = itemView.findViewById(R.id.contato);
            valor = itemView.findViewById(R.id.valor);
        }

        public void bind(final Imovel imovel) {
            foto.setImageResource(imovel.getFoto());
            nome.setText(imovel.getNome());
            endereco.setText(imovel.getEndereco());
            contato.setText(imovel.getContato());
            valor.setText("R$ " + String.format ("%.2f", imovel.getValor()));

        }
    }

//    public interface MyOnLongItemClickListener {
//        void MyOnLongItemClick(int position);
//    }
//
//
//    public void setMyOnLongItemClickListener(MyOnLongItemClickListener myOnLongItemClickListener) {
//        this.myOnLongItemClickListener = myOnLongItemClickListener;
//    }
}
