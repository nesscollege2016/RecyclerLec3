package ness.tomerbu.edu.recyclerlec3;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.ArrayList;

/**
 * Created by android on 06/06/2016.
 */
public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {

    Context context;
    LayoutInflater inflater;
    ArrayList<Animal> animals;

    //Constructor:
    public AnimalAdapter(Context context, LayoutInflater inflater, ArrayList<Animal> animals) {
        this.context = context;
        this.inflater = inflater;
        this.animals = animals;
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.animal_layout, parent, false);
        return new AnimalViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        Animal a = animals.get(position);
        holder.ivAnimal.setImageResource(a.imageResId);
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    class AnimalViewHolder extends RecyclerView.ViewHolder{
        ImageButton ivAnimal;

        //Constructor:
        public AnimalViewHolder(View itemView) {
            super(itemView);
            ivAnimal = (ImageButton)itemView.findViewById(R.id.ivAnimal);

            ivAnimal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    Animal a = animals.get(position);
                    MediaPlayer player = MediaPlayer.create(context, a.soundResId);
                    player.start();
                }
            });
        }
    }
}
