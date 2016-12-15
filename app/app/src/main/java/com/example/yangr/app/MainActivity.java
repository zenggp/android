package com.example.yangr.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private List<Fruit> fruitList = new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initFruits(){
        Fruit apple = new Fruit("apple",R.drawable.sczw_alliance);
        fruitList.add(apple);
        Fruit Banana = new Fruit("Banana",R.drawable.sczw_alliance);
        fruitList.add(Banana);
        Fruit Orange = new Fruit("Orange",R.drawable.sczw_alliance);
        fruitList.add(Orange);
        Fruit Watermelon = new Fruit("Watermelon",R.drawable.sczw_alliance);
        fruitList.add(Watermelon);
        Fruit Pear = new Fruit("Pear",R.drawable.sczw_alliance);
        fruitList.add(Pear);
        Fruit Grape = new Fruit("Grape",R.drawable.sczw_alliance);
        fruitList.add(Grape);
        Fruit Pineapple = new Fruit("Pineapple",R.drawable.sczw_alliance);
        fruitList.add(Pineapple);
        Fruit Strawberry = new Fruit("Strawberry",R.drawable.sczw_alliance);
        fruitList.add(Strawberry);
        Fruit Cherry = new Fruit("Cherry",R.drawable.sczw_alliance);
        fruitList.add(Cherry);
        Fruit Mango = new Fruit("Mango",R.drawable.sczw_alliance);
        fruitList.add(Mango);
        Fruit Strawberry11 = new Fruit("Strawberry11",R.drawable.sczw_alliance);
        fruitList.add(Strawberry11);
        Fruit Cherry11 = new Fruit("Cherry11",R.drawable.sczw_alliance);
        fruitList.add(Cherry11);
        Fruit Mango11 = new Fruit("Mango11",R.drawable.sczw_alliance);
        fruitList.add(Mango11);
        Fruit Strawberry22 = new Fruit("Strawberry22",R.drawable.sczw_alliance);
        fruitList.add(Strawberry22);
        Fruit Cherry22 = new Fruit("Cherry22",R.drawable.sczw_alliance);
        fruitList.add(Cherry22);
        Fruit Mango22 = new Fruit("Mango22",R.drawable.sczw_alliance);
        fruitList.add(Mango22);
        Fruit Strawberry33 = new Fruit("Strawberry33",R.drawable.sczw_alliance);
        fruitList.add(Strawberry33);
        Fruit Cherry33 = new Fruit("Cherry33",R.drawable.sczw_alliance);
        fruitList.add(Cherry33);
        Fruit Mango33 = new Fruit("Mango33",R.drawable.sczw_alliance);
        fruitList.add(Mango33);
        Fruit Strawberry44 = new Fruit("Strawberry44",R.drawable.sczw_alliance);
        fruitList.add(Strawberry44);
        Fruit Cherry44 = new Fruit("Cherry44",R.drawable.sczw_alliance);
        fruitList.add(Cherry44);
        Fruit Mango44 = new Fruit("Mango44",R.drawable.sczw_alliance);
        fruitList.add(Mango44);
    }
}
