package com.rakesh.tmdbmoviedb.repository;

import android.os.AsyncTask;

import com.rakesh.tmdbmoviedb.db.FavouriteMoviesDAO;
import com.rakesh.tmdbmoviedb.model.tmdb.Movie;

public class DeleteFavouriteMovie extends AsyncTask<Movie, Void, Void> {
    private FavouriteMoviesDAO favouriteMoviesDAO;

    public DeleteFavouriteMovie(FavouriteMoviesDAO favouriteMoviesDAO) {
        this.favouriteMoviesDAO = favouriteMoviesDAO;
    }

    @Override
    protected Void doInBackground(Movie... movies) {
        favouriteMoviesDAO.deleteFMovie(movies[0]);
        return null;
    }
}
