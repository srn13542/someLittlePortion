package kr.ac.tukorea.ge.and.srn13542.somelittleportion;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import kr.ac.tukorea.ge.and.srn13542.somelittleportion.databinding.ActivityMainBinding;
import kr.ac.tukorea.ge.and.srn13542.somelittleportion.fragment.FarmingFragment;
import kr.ac.tukorea.ge.and.srn13542.somelittleportion.fragment.InventoryFragment;
import kr.ac.tukorea.ge.and.srn13542.somelittleportion.fragment.MyPageFragment;
import kr.ac.tukorea.ge.and.srn13542.somelittleportion.fragment.SettingFragment;
import kr.ac.tukorea.ge.and.srn13542.somelittleportion.fragment.StoreFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private final FragmentManager fragmentManager = getSupportFragmentManager();

    private SparseArray<Fragment> fragmentSparseArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Fragment 메뉴 ID를 맵핑
        fragmentSparseArray = new SparseArray<>();
        fragmentSparseArray.put(R.id.myPageViewBtn, new MyPageFragment());
        fragmentSparseArray.put(R.id.inventoryViewBtn, new InventoryFragment());
        fragmentSparseArray.put(R.id.farmingViewBtn, new FarmingFragment());
        fragmentSparseArray.put(R.id.storeViewBtn, new StoreFragment());
        fragmentSparseArray.put(R.id.settingViewBtn, new SettingFragment());

        // 초기 fragment 설정
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentSparseArray.get(R.id.farmingViewBtn)).commit();

        // navigation 바 설정
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = fragmentSparseArray.get(item.getItemId());
            if (selectedFragment != null) {
                fragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, selectedFragment)
                        .commit();
                return true;
            }
            return false;
        });
    }
}