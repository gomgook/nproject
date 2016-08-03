package com.stewhouse.nproject.util;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

import com.stewhouse.nproject.NBaseResultAdapter;

/**
 * Created by Gomguk on 2016-07-11.
 */
public class GSwipeRefreshLayout extends SwipeRefreshLayout {

    private ListView mListView = null;
    private NBaseResultAdapter mListAdapter = null;

    private View mFooterLoadingView = null;

    public GSwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ListView getListView() {
        return mListView;
    }

    public void setListView(ListView listView) {
        mListView = listView;
    }

    public NBaseResultAdapter getAdapter() {
        return mListAdapter;
    }

    public void setAdapter(NBaseResultAdapter adapter) {
        mListAdapter = adapter;
    }

    public void setFooterLoadingView(View footerLoadingView) {
        mFooterLoadingView = footerLoadingView;
    }

    public void addLoadingFooter() {
        if (mListView != null && mFooterLoadingView != null) {
            removeLoadingFooter();
            mListView.addFooterView(mFooterLoadingView);
        }
    }

    public void removeLoadingFooter() {
        if (mListView != null && mFooterLoadingView != null) {
            while (mListView.getFooterViewsCount() != 0) {
                mListView.removeFooterView(mFooterLoadingView);
            }
        }
    }
}