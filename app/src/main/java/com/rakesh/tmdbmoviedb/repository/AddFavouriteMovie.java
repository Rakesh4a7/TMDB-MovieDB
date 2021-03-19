package com.rakesh.tmdbmoviedb.repository;


import android.os.AsyncTask;

import com.rakesh.tmdbmoviedb.db.FavouriteMoviesDAO;
import com.rakesh.tmdbmoviedb.model.tmdb.Movie;

public class AddFavouriteMovie extends AsyncTask<Movie, Void, Void> {
    private FavouriteMoviesDAO favouriteMoviesDAO;

    public AddFavouriteMovie(FavouriteMoviesDAO favouriteMoviesDAO) {
        this.favouriteMoviesDAO = favouriteMoviesDAO;
    }

    @Override
    protected Void doInBackground(Movie... movies) {
        favouriteMoviesDAO.insertFMovie(movies[0]);
        return null;
    }
}
