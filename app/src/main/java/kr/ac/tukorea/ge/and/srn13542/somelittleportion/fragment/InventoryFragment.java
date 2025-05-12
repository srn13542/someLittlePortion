package kr.ac.tukorea.ge.and.srn13542.somelittleportion.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.ac.tukorea.ge.and.srn13542.somelittleportion.R;
import kr.ac.tukorea.ge.and.srn13542.somelittleportion.databinding.FragmentInventoryBinding;


public class InventoryFragment extends Fragment {
    private FragmentInventoryBinding binding;

    public InventoryFragment() {
        //빈 생성자 없다면 오류 발생
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentInventoryBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; // ViewBinding 참조 해제 (메모리 누수 방지)
    }
}