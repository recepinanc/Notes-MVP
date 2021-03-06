package com.recepinanc.notesmvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements NotesView, AdapterView.OnItemClickListener {

    private NotePresenter notePresenter;
    private ListView noteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        noteList = (ListView) findViewById(R.id.notes_listview);
        noteList.setOnItemClickListener(this);
        // We can use since this class implements NotesView it means that it can do anything that
        // We'd expect from NotesView to do
        notePresenter = new NotePresenterImplement(this, new GetNotesInteractionImplement());
    }

    @Override
    protected void onResume() {
        super.onResume();
        notePresenter.onResume();
    }

    @Override
    public void setNotes(List<String> notes) {
        noteList.setAdapter(new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, notes));
    }

    @Override
    public void updateNotes() {
        noteList.getAdapter().notify();
    }

    @Override
    public void showPosition(int position) {
        Toast.makeText(MainActivity.this, "Position : " + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        notePresenter.onClick(position);
    }
}