package kr.ac.tukorea.ge.and.srn13542.somelittleportion.customView;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import kr.ac.tukorea.ge.and.srn13542.somelittleportion.R;

public class TreeView extends View {

    private String mExampleString;

    private float mExampleDimension = 0;

    private Drawable mExampleDrawable;

    public TreeView(Context context) {
        super(context);
        init(null, 0);
    }
    public TreeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }
    public TreeView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }
    public void init(AttributeSet attrs, int defStyle) {
        //Load attributes
        mExampleDrawable = getContext().getDrawable(R.drawable.tree2);
        if (mExampleDrawable != null) {
            invalidate();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();

        int left = paddingLeft;
        int top = paddingTop;
        int right = getWidth() - paddingRight;
        int bottom = getHeight() - paddingBottom;

        // 존재할 때 그리기
        if (mExampleDrawable != null) {
            mExampleDrawable.setBounds(left, top, right, bottom);
            mExampleDrawable.draw(canvas);
        }
    }
}
