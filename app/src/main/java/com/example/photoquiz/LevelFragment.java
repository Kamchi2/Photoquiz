package com.example.photoquiz;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.photoquiz.databinding.FragmentLevelBinding;

public class LevelFragment extends Fragment {
    String firstImg = "https://avatars.mds.yandex.net/i?id=e142530ede96dc7409a2cd8435d431ee-5313756-images-thumbs&n=13";
    String secondImg = "https://avatars.mds.yandex.net/i?id=73301029efaa70dbcbb1b0cdd47a55d2-4698038-images-thumbs&n=13";
    String thirdImg = "https://avatars.mds.yandex.net/i?id=eda67ab52a1e5253da5c6875c9f5b772-7018491-images-thumbs&n=13";
    String fourImg = "https://avatars.mds.yandex.net/i?id=f3f3ff7aabf2febd18c2cf1b192b1ec8-5266248-images-thumbs&n=13";
    FragmentLevelBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLevelBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.firstLevelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("first", firstImg);
                bundle.putString("second", secondImg);
                bundle.putString("third", thirdImg);
                bundle.putString("four", fourImg);
                bundle.putString("level", "1 Уровень");
                bundle.putString("hint", "Это инструмент");
                bundle.putString("answer", "Коса");

                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, gameFragment)
                        .commit();
            }
        });
        binding.secondLevelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("first", "https://avatars.mds.yandex.net/i?id=01b1495bd4c4356f1e1843cc7f6a8129-5656190-images-thumbs&n=13");
                bundle.putString("second", "https://avatars.mds.yandex.net/i?id=c073cdf0edfef72466b84dfeb5f68d47-3674804-images-thumbs&n=13");
                bundle.putString("third", "https://avatars.mds.yandex.net/i?id=ad8e6924776dcc355b35bf20d8d46114-3584061-images-thumbs&n=13");
                bundle.putString("four", "https://avatars.mds.yandex.net/i?id=30715e555926bb14027e4139969a2fa0-4809764-images-thumbs&n=13");
                bundle.putString("level", "2 Уровень");
                bundle.putString("hint", "Это основа дома");
                bundle.putString("answer", "Пол");

                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, gameFragment)
                        .commit();
            }
        });
        binding.thirdLevelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("first", "https://avatars.mds.yandex.net/i?id=c78e7f53971af7fb654ed7ab5a51e713-5843546-images-thumbs&n=13");
                bundle.putString("second", "https://avatars.mds.yandex.net/i?id=0b129c3b826ca05b9ae1d0cc8b9e89bd-7014426-images-thumbs&n=13");
                bundle.putString("third", "https://avatars.mds.yandex.net/i?id=4c8d4eeab1a73b9e626029f093a1922a-4572119-images-thumbs&n=13");
                bundle.putString("four", "https://yandex.ru/images/search?text=природа&pos=12&rpt=simage&img_url=https%3A%2F%2Fs1.1zoom.ru%2Fbig3%2F241%2F431666-Kysb.jpg&from=tabbar&lr=10309");
                bundle.putString("level", "3 Уровень");
                bundle.putString("hint", "Мы созданы ей");
                bundle.putString("answer", "Природа");

                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, gameFragment)
                        .commit();
            }
        });
    }
}