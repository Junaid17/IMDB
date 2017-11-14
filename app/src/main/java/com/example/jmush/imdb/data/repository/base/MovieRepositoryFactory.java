package com.example.jmush.imdb.data.repository.base;


import android.content.Context;

import com.example.jmush.imdb.data.api.TMDbApiSync;
import com.example.jmush.imdb.data.mapper.CursorModelEntitiesDataMapper;
import com.example.jmush.imdb.data.mapper.DTOModelEntitiesDataMapper;
import com.example.jmush.imdb.data.repository.LocalMovieRepository;
import com.example.jmush.imdb.data.repository.TMDbMovieRepository;

/**
 * This class knows how to construct each type of the repositories
 */
public class MovieRepositoryFactory {

    /**
     * Create and return an instance of a TMDbMovieRepository
     * @return
     */
    public static ICloudMovieRepository getCloudRepository() {
        return new TMDbMovieRepository(new TMDbApiSync(), new DTOModelEntitiesDataMapper());
    }

    /**
     * Create and return an instance of a LocalMovieRepository
     * @param ctx
     * @return
     */
    public static ILocalMovieRepository getLocalRepository(Context ctx) {
        return new LocalMovieRepository(ctx, new CursorModelEntitiesDataMapper());
    }

}
