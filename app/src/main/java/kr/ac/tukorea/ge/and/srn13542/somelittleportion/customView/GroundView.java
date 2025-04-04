package kr.ac.tukorea.ge.and.srn13542.somelittleportion.customView;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import kr.ac.tukorea.ge.and.srn13542.somelittleportion.R;

public class GroundView extends View {

    private String mExampleString;

    private float mExampleDimension = 0;

    private Drawable mExampleDrawable;

    public GroundView(Context context) {
        super(context);
        init(null, 0);
    }
    public GroundView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }
    public GroundView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }
    public void init(AttributeSet attrs, int defStyle) {
        //Load attributes
        mExampleDrawable = getContext().getDrawable(R.drawable.background_night);
        if (mExampleDrawable != null) {
            invalidate();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // Draw the exampleDrawable if it exists
        if (mExampleDrawable != null) {
            // Set bounds for the drawable
            mExampleDrawable.setBounds(0, 0, getWidth(), getHeight());

            // Draw the drawable onto the canvas
            mExampleDrawable.draw(canvas);
        }
    }
}
