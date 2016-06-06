package ness.tomerbu.edu.recyclerlec3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rvAnimals);
        assert rv != null;
        rv.setLayoutManager(new GridLayoutManager(this, 2));
        AnimalAdapter adapter = new AnimalAdapter(this, getLayoutInflater(), getAnimals());
        rv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public ArrayList<Animal> getAnimals(){
        ArrayList<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            animals.add(new Animal("Horse", R.drawable.horse, R.raw.horse));
            animals.add(new Animal("Donkey", R.drawable.donkey, R.raw.donkey));
            animals.add(new Animal("Dog", R.drawable.dog, R.raw.dogs));
            animals.add(new Animal("Cat", R.drawable.cat, R.raw.cat));
            animals.add(new Animal("Cow", R.drawable.cow, R.raw.cow));
            animals.add(new Animal("Wolf", R.drawable.wolf, R.raw.wolf));
            animals.add(new Animal("Tiger", R.drawable.tiger, R.raw.tiger));
            animals.add(new Animal("Monkey", R.drawable.monkey, R.raw.monkey));

        }
        return animals;
    }
}
