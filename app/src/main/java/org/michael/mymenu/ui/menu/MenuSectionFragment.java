package org.michael.mymenu.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import org.michael.mymenu.R;
import org.michael.mymenu.databinding.FragmentMenuSectionBinding;

public class MenuSectionFragment extends Fragment {

    private static final String ARG_SECTION_TITLE_RES_ID = "sectionTitleResId";
    private static final String ARG_SECTION_ICON_RES_ID = "sectionIconResId";

    private FragmentMenuSectionBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMenuSectionBinding.inflate(inflater, container, false);

        Bundle args = getArguments();
        int titleResId = args != null
                ? args.getInt(ARG_SECTION_TITLE_RES_ID, R.string.app_name)
                : R.string.app_name;
        int iconResId = args != null
                ? args.getInt(ARG_SECTION_ICON_RES_ID, android.R.drawable.sym_def_app_icon)
                : android.R.drawable.sym_def_app_icon;

        binding.sectionImage.setImageResource(iconResId);
        binding.sectionImage.setContentDescription(getString(titleResId));
        binding.sectionCaption.setText(titleResId);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
