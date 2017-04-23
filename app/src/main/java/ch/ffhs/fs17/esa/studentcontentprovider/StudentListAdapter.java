package ch.ffhs.fs17.esa.studentcontentprovider;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleCursorAdapter;

/**
 * Created by cheey on 23.04.2017.
 */

public class StudentListAdapter extends SimpleCursorAdapter {
    public StudentListAdapter(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
        super(context, layout, c, from, to, flags);

        // TODO: initialize content resolver
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        return inflater.inflate(R.layout.activity_student_list, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // TODO: use cursor to bind to specific elements of the view.

    }
}
