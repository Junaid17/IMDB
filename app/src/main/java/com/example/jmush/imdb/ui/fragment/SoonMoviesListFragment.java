package com.example.jmush.imdb.ui.fragment;

import com.example.jmush.imdb.ui.fragment.common.MovieListableFragment;
import com.example.jmush.imdb.ui.presenter.SoonMoviesListPresenter;
import com.example.jmush.imdb.ui.presenter.base.IPresenter;

/**
 * Soon movies fragment
 */
public class SoonMoviesListFragment extends MovieListableFragment {

    @Override
    protected IPresenter createPresenter() {
        return new SoonMoviesListPresenter(this);
    }
}
