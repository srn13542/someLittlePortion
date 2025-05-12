package kr.ac.tukorea.ge.and.srn13542.somelittleportion;

import android.os.Bundle;
import android.util.Log;

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
    private ActivityMainBinding binding;
    private final FragmentManager fragmentManager = getSupportFragmentManager();
    private Fragment activeFragment;

    // Fragment 재사용을 위한 멤버 변수
    private final Fragment myPageFragment = new MyPageFragment();
    private final Fragment inventoryFragment = new InventoryFragment();
    private final Fragment farmingFragment = new FarmingFragment();
    private final Fragment storeFragment = new StoreFragment();
    private final Fragment settingFragment = new SettingFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 초기 화면
        showFragment(farmingFragment);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.myPageViewBtn) {
                showFragment(myPageFragment);
                return true;
            } else if (id == R.id.inventoryViewBtn) {
                showFragment(inventoryFragment);
                return true;
            } else if (id == R.id.farmingViewBtn) {
                showFragment(farmingFragment);
                return true;
            } else if (id == R.id.storeViewBtn) {
                showFragment(storeFragment);
                return true;
            } else if (id == R.id.settingViewBtn) {
                showFragment(settingFragment);
                return true;
            } else {
                return false;
            }
        });
    }


    private void showFragment(Fragment targetFragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        // 처음 추가하는 Fragment인 경우 add
        if (!targetFragment.isAdded()) {
            transaction.add(R.id.relativeLayoutMain, targetFragment);}

        // 기존에 표시된 Fragment는 숨김
        if (activeFragment != null && activeFragment != targetFragment) {
            transaction.hide(activeFragment);}

        // 새로운 Fragment는 보여줌
        transaction.show(targetFragment);
        transaction.commit();

        // 현재 표시 중인 Fragment 갱신
        activeFragment = targetFragment;
    }
}