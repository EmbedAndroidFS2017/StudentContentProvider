package ch.ffhs.fs17.esa.studentcontentprovider;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;

import android.content.ContentValues;
import android.content.CursorLoader;

import android.database.Cursor;

import android.view.Menu;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickAddName(View view) {
        // TODO: Add a new student record - insert values to the uri.
        // TODO: show the uri in a Toast.
    }

    public void onClickRetrieveStudents(View view) {
        // TODO: Retrieve student records from the uri using ContentResolver.
        // TODO: using a Cursor show individual records in a Toast.
    }
}