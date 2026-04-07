package su.ioplock.mymenu.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import su.ioplock.mymenu.R;
import su.ioplock.mymenu.databinding.FragmentMenuSectionBinding;

public class MenuSectionFragment extends Fragment {

    private static final String ARG_SECTION_TITLE_RES_ID = "sectionTitleResId";
    private static final String ARG_SECTION_DESCRIPTION_RES_ID = "sectionDescriptionResId";

    private FragmentMenuSectionBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMenuSectionBinding.inflate(inflater, container, false);

        Bundle args = getArguments();
        int titleResId = args != null
                ? args.getInt(ARG_SECTION_TITLE_RES_ID, R.string.app_name)
                : R.string.app_name;
        int descriptionResId = args != null
                ? args.getInt(ARG_SECTION_DESCRIPTION_RES_ID, R.string.app_name)
                : R.string.app_name;

        binding.sectionTitle.setText(titleResId);
        binding.sectionDescription.setText(descriptionResId);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
