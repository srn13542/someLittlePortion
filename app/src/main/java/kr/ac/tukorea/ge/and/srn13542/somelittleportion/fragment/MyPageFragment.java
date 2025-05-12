package kr.ac.tukorea.ge.and.srn13542.somelittleportion.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kr.ac.tukorea.ge.and.srn13542.somelittleportion.databinding.FragmentMyPageBinding;


public class MyPageFragment extends Fragment {
    private FragmentMyPageBinding binding;

    public MyPageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMyPageBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; // ViewBinding 참조 해제 (메모리 누수 방지)
    }
}