package com.example.kt.cha_on.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.kt.cha_on.domain.Program;

import java.sql.SQLException;

/**
 * Created by kt on 2015-11-22.
 */
public class DbOpenHelper {


    private static final String DATABASE_NAME = "chaon.db";
    private static final int DATABASE_VERSION = 1;
    public static SQLiteDatabase mDB;
    private DatabaseHelper mDBHelper;
    private Context mCtx;

    private class DatabaseHelper extends SQLiteOpenHelper {

        // 생성자
        public DatabaseHelper(Context context, String name,
                              SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        // 최초 DB를 만들때 한번만 호출된다.
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(DataBases.CreateProgramDB._CREATE_PROGRAM);
            db.execSQL(DataBases.CreateUserDB._CREATE_USER);

        }

        // 버전이 업데이트 되었을 경우 DB를 다시 만들어 준다.
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS "
                    + DataBases.CreateProgramDB._TABLENAME);
            db.execSQL("DROP TABLE IF EXISTS "
                    + DataBases.CreateUserDB._TABLENAME);
            onCreate(db);
        }
    }

    public DbOpenHelper(Context context) {
        this.mCtx = context;
    }

    public DbOpenHelper open() throws SQLException {
        mDBHelper = new DatabaseHelper(mCtx, DATABASE_NAME, null,
                DATABASE_VERSION);
        mDB = mDBHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        mDB.close();
    }

    // [ FRAME TABLE ]
    // Insert DB
    public long insertProgramColumn(Program program) {
        ContentValues values = new ContentValues();
        values.put(DataBases.CreateProgramDB.CHANNELNAME, program.getChannelName());
        values.put(DataBases.CreateProgramDB.PROGRAMNAME, program.getProgramName());
        values.put(DataBases.CreateProgramDB.PROGRAMID, program.getProgramId());
        values.put(DataBases.CreateProgramDB.CATEGORIE, program.getCategorie());
        //values.put(DataBases.CreateProgramDB.KEYWORDLIST, program.getKeywordList());
        values.put(DataBases.CreateProgramDB.BROADCASTTIME, program.getBroadcastTime());
        values.put(DataBases.CreateProgramDB.LIKECNT, program.getLikeCnt());
        //values.put(DataBases.CreateProgramDB.PROGRAMPRODUCT, program.getProgramProduct());
        values.put(DataBases.CreateProgramDB.ONAIR, program.getOnAir());
        values.put(DataBases.CreateProgramDB.VIEWERCNT, program.getViewerCnt());
        values.put(DataBases.CreateProgramDB.REALVIEWRATE, program.getRealViewRate());
        values.put(DataBases.CreateProgramDB.SERVERVIEWRATE, program.getServerViewRate());
        return mDB.insert(DataBases.CreateProgramDB._TABLENAME, null, values);
    }

    // Select All
    public Cursor getProgramAllColumns() {
        return mDB.query(DataBases.CreateProgramDB._TABLENAME, null, null, null,
                null, null, null);
    }

    // [ CONTENT TABLE ]
    // Insert DB
    public long insertUserColumn(int userId, String username, String preperencechannel, String iptv) {
        ContentValues values = new ContentValues();
        values.put(DataBases.CreateUserDB.USERID, userId);
        values.put(DataBases.CreateUserDB.USERNAME, username);
        values.put(DataBases.CreateUserDB.PREFERENCECHANNEL, preperencechannel);
        values.put(DataBases.CreateUserDB.IPTV, iptv);
        return mDB.insert(DataBases.CreateUserDB._TABLENAME, null, values);
    }

    // Select All
    public Cursor getUserAllColumns() {
        return mDB.query(DataBases.CreateUserDB._TABLENAME, null, null, null,
                null, null, null);
    }



}

