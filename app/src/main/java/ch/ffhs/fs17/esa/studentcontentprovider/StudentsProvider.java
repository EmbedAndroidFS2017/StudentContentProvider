package ch.ffhs.fs17.esa.studentcontentprovider;
import java.util.HashMap;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;

import android.database.Cursor;
import android.database.SQLException;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;

import android.net.Uri;
import android.text.TextUtils;

public class StudentsProvider extends ContentProvider{
    // TODO: Fill details.
    static final String PROVIDER_NAME = "...";
    static final String URL = "content://" + PROVIDER_NAME + "/...";
    static final Uri CONTENT_URI = Uri.parse(URL);

    static final String _ID = "...";
    static final String NAME = "...";
    static final String GRADE = "...";

    private static HashMap<String, String> STUDENTS_PROJECTION_MAP;

    static final int STUDENTS = 1;
    static final int STUDENT_ID = 2;

    static final UriMatcher uriMatcher;
    static {
        uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        uriMatcher.addURI(PROVIDER_NAME, "students", STUDENTS);
        uriMatcher.addURI(PROVIDER_NAME, "students/#", STUDENT_ID);
    }

    /** TODO:
     * Database specific constant declarations
     */

    private SQLiteDatabase mDatabase;
    static final String DATABASE_NAME = "...";
    static final String STUDENTS_TABLE_NAME = "students";
    static final int DATABASE_VERSION = 1;
    static final String CREATE_DB_TABLE = "...";

    /**
     * Helper class that actually creates and manages
     * the provider's underlying data repository.
     */

    private static class DatabaseHelper extends SQLiteOpenHelper {

        DatabaseHelper(Context context){
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            // TODO: Create DB
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // TODO: Drop and call create.
        }
    }

    @Override
    public boolean onCreate() {
        /** TODO:
         * Create a writeable database which will trigger its
         * creation if it doesn't already exist.
         */
        return false;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        /** TODO:
         * Add a new student record
         */
        /** TODO:
         * If record is added successfully, return the uri.
         */

        throw new SQLException("Failed to add a record into " + uri);
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,String[] selectionArgs, String sortOrder) {
        // TODO: Create a cursor c (Page 309)
        Cursor c = null;

        /**
         * register to watch a content URI for changes
         */
        c.setNotificationUri(getContext().getContentResolver(), uri);
        return c;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        int count = 0;
        switch (uriMatcher.match(uri)){
            case STUDENTS:
                // TODO: delete table and return count.
                break;

            case STUDENT_ID:
                // TODO: delete specific id and return count.
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
        // TODO: notify change on the uri.
        return count;
    }

    @Override
    public int update(Uri uri, ContentValues values,
                      String selection, String[] selectionArgs) {
        int count = 0;
        switch (uriMatcher.match(uri)) {
            case STUDENTS:
                // TODO: update table and return count.
                break;

            case STUDENT_ID:
                // TODO: update specific row and return count.
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri );
        }

        // TODO: notify change on the uri.
        return count;
    }

    @Override
    public String getType(Uri uri) {
        switch (uriMatcher.match(uri)){
            /**
             * Get all student records
             */
            case STUDENTS:
                return "bla";
            /**
             * Get a particular student
             */
            case STUDENT_ID:
                return "bla";
            default:
                throw new IllegalArgumentException("Unsupported URI: " + uri);
        }
    }
}