package kr.ac.tukorea.ge.and.srn13542.somelittleportion.dialog;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import org.jetbrains.annotations.Nullable;

import kr.ac.tukorea.ge.and.srn13542.somelittleportion.R;
import kr.ac.tukorea.ge.and.srn13542.somelittleportion.data.ToolItem;

public class ToolDialogFragment extends DialogFragment {

    // 도구 목록
    private final ToolItem[] toolItems = new ToolItem[]{
            new ToolItem("돋보기", 0),
            new ToolItem("망치", 0),
            new ToolItem("지도", 0),
            new ToolItem("랜턴", 0),
            new ToolItem("시계", 0),  // 아이콘 없음
            new ToolItem("열쇠", 0),
            new ToolItem("망원경", 0) // 아이콘 없음
    };

    // interface 정의
    public interface OnToolSelectedListener {
        void onToolSelected(String toolName);
    }

    private OnToolSelectedListener listener;

    public void setOnToolSelectedListener(OnToolSelectedListener listener) {
        this.listener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // 배경 투명화 처리
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }

        View view = inflater.inflate(R.layout.tool_custom_dialog, container, false);

        // 닫기 버튼 클릭 시 다이얼로그 닫기
        ImageButton closeBtn = view.findViewById(R.id.closeBtn);
        closeBtn.setOnClickListener(v -> dismiss());

        TableLayout tableLayout = view.findViewById(R.id.toolTableLayout);
        final int MAX_PER_ROW = 4;  // 한 줄에 최대 4개 버튼
        TableRow currentRow = null;

        for (int i = 0; i < toolItems.length; i++) {
            ToolItem tool = toolItems[i];

            // 새로운 row가 필요할 때마다 생성
            if (i % MAX_PER_ROW == 0) {
                // 이전 row가 있다면 마지막에 빈 뷰를 추가해서 채워주기
                if (currentRow != null && currentRow.getChildCount() < MAX_PER_ROW) {
                    int emptyViewsNeeded = MAX_PER_ROW - currentRow.getChildCount();
                    for (int j = 0; j < emptyViewsNeeded; j++) {
                        View emptyView = new View(getContext());
                        TableRow.LayoutParams emptyParams = new TableRow.LayoutParams(
                                0, TableRow.LayoutParams.WRAP_CONTENT, 1f
                        );
                        currentRow.addView(emptyView, emptyParams);
                    }
                }

                currentRow = new TableRow(getContext());
                TableLayout.LayoutParams rowParams = new TableLayout.LayoutParams(
                        TableLayout.LayoutParams.MATCH_PARENT,
                        TableLayout.LayoutParams.WRAP_CONTENT
                );
                rowParams.gravity = Gravity.START;  // 왼쪽 정렬
                currentRow.setLayoutParams(rowParams);
                tableLayout.addView(currentRow);
            }

            // 도구 뷰: LinearLayout (세로 방향, 아이콘 + 텍스트)
            LinearLayout toolLayout = new LinearLayout(getContext());
            toolLayout.setOrientation(LinearLayout.VERTICAL);
            toolLayout.setGravity(Gravity.CENTER);
            toolLayout.setPadding(8, 8, 8, 8);

            // 아이콘
            ImageButton imageButton = new ImageButton(getContext());
            int iconId = tool.iconResId != 0 ? tool.iconResId : R.drawable.default_image;
            imageButton.setImageResource(iconId);
            imageButton.setBackgroundColor(Color.TRANSPARENT);  // 배경 제거
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setAdjustViewBounds(true);
            imageButton.setLayoutParams(new LinearLayout.LayoutParams(120, 120));  // 크기 조절

            // 텍스트
            TextView textView = new TextView(getContext());
            textView.setText(tool.name);
            textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            textView.setTextSize(12);
            textView.setPadding(0, 4, 0, 0);

            // 클릭 리스너
            imageButton.setOnClickListener(v -> {
                Log.d("ToolDialog", "선택된 도구: " + tool.name);

                // 콜백으로 선택된 도구 이름 전달
                if (listener != null) {
                    listener.onToolSelected(tool.name);
                }

                dismiss();
            });

            // 구성
            toolLayout.addView(imageButton);
            toolLayout.addView(textView);

            // 레이아웃 parameter 설정
            TableRow.LayoutParams params = new TableRow.LayoutParams(
                    0, TableRow.LayoutParams.WRAP_CONTENT, 1f
            );
            params.setMargins(8, 8, 8, 8);
            toolLayout.setLayoutParams(params);

            currentRow.addView(toolLayout);
        }

        // 마지막 row의 빈 칸 채우기
        if (currentRow != null && currentRow.getChildCount() < MAX_PER_ROW) {
            int emptyViewsNeeded = MAX_PER_ROW - currentRow.getChildCount();
            for (int j = 0; j < emptyViewsNeeded; j++) {
                View emptyView = new View(getContext());
                TableRow.LayoutParams emptyParams = new TableRow.LayoutParams(
                        0, TableRow.LayoutParams.WRAP_CONTENT, 1f
                );
                currentRow.addView(emptyView, emptyParams);
            }
        }

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        // 다이얼로그 크기 및 여백 설정
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().setLayout(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );

            // 여백(Padding) 설정
            View decorView = getDialog().getWindow().getDecorView();
            float density = getResources().getDisplayMetrics().density;

            int paddingHorizontal = (int) (40 * density);  // 40dp
            int paddingVertical = (int) (80 * density);    // 80dp

            decorView.setPadding(
                    paddingHorizontal,
                    paddingVertical,
                    paddingHorizontal,
                    paddingVertical
            );
        }
    }
}
