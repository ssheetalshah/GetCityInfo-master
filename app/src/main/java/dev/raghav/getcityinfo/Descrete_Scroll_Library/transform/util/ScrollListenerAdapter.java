package dev.raghav.getcityinfo.Descrete_Scroll_Library.transform.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import dev.raghav.getcityinfo.Descrete_Scroll_Library.transform.DiscreteScrollView;


public class ScrollListenerAdapter<T extends RecyclerView.ViewHolder> implements DiscreteScrollView.ScrollStateChangeListener<T> {

    private DiscreteScrollView.ScrollListener<T> adaptee;

    public ScrollListenerAdapter(@NonNull DiscreteScrollView.ScrollListener<T> adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void onScrollStart(@NonNull T currentItemHolder, int adapterPosition) {

    }

    @Override
    public void onScrollEnd(@NonNull T currentItemHolder, int adapterPosition) {

    }

    @Override
    public void onScroll(float scrollPosition,
                         int currentIndex, int newIndex,
                         @Nullable T currentHolder, @Nullable T newCurrentHolder) {
        adaptee.onScroll(scrollPosition, currentIndex, newIndex, currentHolder, newCurrentHolder);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof dev.raghav.getcityinfo.Descrete_Scroll_Library.transform.util.ScrollListenerAdapter) {
            return adaptee.equals(((dev.raghav.getcityinfo.Descrete_Scroll_Library.transform.util.ScrollListenerAdapter) obj).adaptee);
        } else {
            return super.equals(obj);
        }
    }
}
