/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * CREATED BY BISHRAM MUNDA
 * CREATED ON SUNDAY, 12/08/2018
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bishram.jharkhand.tour.R;

import fragments.FragmentOne;
import fragments.FragmentTwo;

public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private final Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FragmentOne();
        } else if (position == 1){
            return new FragmentTwo();
        } else if (position == 2) {
            return new FragmentTwo();
        } else if (position == 3) {
            return new FragmentTwo();
        } else {
            return new FragmentTwo();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String string = "";
        switch (position) {
            case 0:
                string = mContext.getString(R.string.fragment_txt_one);
                break;

            case 1:
                string = mContext.getString(R.string.fragment_txt_two);
                break;

            case 2:
                string = "FRAGMENT THREE";
                break;

            case 3:
                string = "FRAGMENT FOUR";
                break;

            case 4:
                string = "FRAGMENT FIVE";
                break;
        }
        return string;
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }
}