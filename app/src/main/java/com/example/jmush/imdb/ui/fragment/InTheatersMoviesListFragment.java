package com.example.jmush.imdb.ui.fragment;

import com.example.jmush.imdb.ui.fragment.common.MovieListableFragment;
import com.example.jmush.imdb.ui.presenter.InTheatersMoviesListPresenter;
import com.example.jmush.imdb.ui.presenter.base.IPresenter;

/**
 * Fragment representing the movies list in theaters
 */
public class InTheatersMoviesListFragment extends MovieListableFragment {

    @Override
    protected IPresenter createPresenter() {
        return new InTheatersMoviesListPresenter(this);
    }
}
