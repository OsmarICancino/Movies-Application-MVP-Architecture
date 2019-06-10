package com.example.dalvikmovies.movie_list;

import com.example.dalvikmovies.model.Movie;

import java.util.List;

public interface MovieListContract {

    interface Model {
        interface OnFinishedListener {
            void onFinished(List<Movie> movieArrayList);
            void onFailure(Throwable t);
        }

        void getMovieList(OnFinishedListener onFinihedListener, int pageNo);
    }

    interface View {
        void showProgress();
        void hideProgress();
        void setDataToRecyclerView(List<Movie> movieArrayList);
        void onResponseFailure(Throwable throwable);
    }

    interface Presenter {
        void onDestroy();
        void getMoreData(int pageNo);
        void requestDataFromServer();
    }
}
