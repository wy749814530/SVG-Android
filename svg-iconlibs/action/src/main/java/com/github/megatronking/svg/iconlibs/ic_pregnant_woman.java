package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_pregnant_woman extends SVGRenderer {

    public ic_pregnant_woman(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(9.0f, 4.0f);
        mPath.rCubicTo(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        mPath.rCubicTo(1.1099997f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        mPath.rCubicTo(0.0f, 1.1100001f, -0.89f, 2.0f, -2.0f, 2.0f);
        mPath.rCubicTo(-1.1099997f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(9.0f, 4.0f);
        mPath.rMoveTo(7.0f, 9.0f);
        mPath.rCubicTo(-0.01f, -1.34f, -0.83f, -2.51f, -2.0f, -3.0f);
        mPath.rCubicTo(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        mPath.rCubicTo(-1.6599998f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        mPath.rLineTo(0f, 7.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 5.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rLineTo(0f, -5.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rLineTo(0f, -4.0f);
        mPath.close();
        mPath.moveTo(16.0f, 13.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}