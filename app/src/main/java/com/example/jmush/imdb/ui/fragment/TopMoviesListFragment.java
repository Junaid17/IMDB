package com.example.jmush.imdb.ui.fragment;

import com.example.jmush.imdb.ui.fragment.common.MovieListableFragment;
import com.example.jmush.imdb.ui.presenter.TopMoviesListPresenter;
import com.example.jmush.imdb.ui.presenter.base.IPresenter;

/**
 * Top movies fragment
 */
public class TopMoviesListFragment extends MovieListableFragment {

    @Override
    protected IPresenter createPresenter() {
        return new TopMoviesListPresenter(this);
    }
}
