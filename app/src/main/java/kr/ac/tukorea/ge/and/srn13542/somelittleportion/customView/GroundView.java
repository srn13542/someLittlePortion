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
        mExampleDrawable = getContext().getDrawable(R.drawable.ground1);
        if (mExampleDrawable != null) {
            invalidate();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Padding 값을 가져옴
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();

        // 실제 그리기 영역을 padding을 고려하여 계산
        int left = paddingLeft;
        int top = paddingTop;
        int right = getWidth() - paddingRight;
        int bottom = getHeight() - paddingBottom;

        // 존재할 때 그리기
        if (mExampleDrawable != null) {
            // 그려질 영역 정의에 사용
            mExampleDrawable.setBounds(left, top, right, bottom);
            mExampleDrawable.draw(canvas);
            /*java코드에서 padding 설정 희망 시
            GroundView groundView = findViewById(R.id.ground_view);
            groundView.setPadding(20, 20, 20, 20); // 좌, 상, 우, 하 패딩 값 설정
            이 가능하다고 함 */
        }
    }
}
