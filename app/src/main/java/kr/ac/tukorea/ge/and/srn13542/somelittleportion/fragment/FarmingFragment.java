package kr.ac.tukorea.ge.and.srn13542.somelittleportion.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import kr.ac.tukorea.ge.and.srn13542.somelittleportion.databinding.FragmentFarmingBinding;


public class FarmingFragment extends Fragment {
    FragmentFarmingBinding binding;


    public FarmingFragment() {
        // Fragment 에 빈 생성자 가 없으면 오류 발생?
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFarmingBinding.inflate(inflater);

        //ToolMenuButton 클릭 시 dialog 출력 되도록 하기 위한 코드
        binding.ToolMenuButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; // ViewBinding 참조 해제 (메모리 누수 방지)
    }
}