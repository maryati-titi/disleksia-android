package dyslexia.titi.frag27.perbaikanKata;
// Created by Arif Ikhsanudin on 9/13/2019.

import android.app.Application;

import java.util.List;

import dyslexia.titi.frag27.kamus.database.DatabaseAdapter;
import dyslexia.titi.frag27.kamus.model.Kamus;

public class Resolver extends Application {

    //    cari di kamus
//    anagram
//    buat kata untuk anagram
//    anagram tidak ketemu
//    cari di jaro winkler

    private static Resolver mContext;

    DatabaseAdapter databaseAdapter;
    List<Kamus> kamusList;
    String initialWord;

    public Resolver(String initialWord) {
        this.initialWord = initialWord;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public void searchInDictionary() {
        databaseAdapter = new DatabaseAdapter(getContext());
        kamusList = databaseAdapter.retrieveKamus("all");
    }

    public static Resolver getContext() {
        return mContext;
    }

}
