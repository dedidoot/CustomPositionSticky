package com.yuk.stickysimple.Kedua;

import android.content.Context;

import com.yuk.stickysimple.ketiga.stickyheaders.StickyLayoutManager;
import com.yuk.stickysimple.ketiga.stickyheaders.exposed.StickyHeaderHandler;


public final class TopSnappedStickyLayoutManager extends StickyLayoutManager {

    TopSnappedStickyLayoutManager(Context context, StickyHeaderHandler headerHandler) {
        super(context, headerHandler);
    }

    @Override public void scrollToPosition(int position) {
        super.scrollToPositionWithOffset(position, 0);
    }
}
