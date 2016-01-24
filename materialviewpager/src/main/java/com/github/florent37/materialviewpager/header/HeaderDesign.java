package com.github.florent37.materialviewpager.header;

import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;

/**
 * Created by florentchampigny on 10/06/15.
 */
public class HeaderDesign {
    protected int color;
    protected int colorRes;
    protected String imageUrl;
    protected Drawable drawable;
    protected Drawable logo;

    private HeaderDesign() {
    }

    public static HeaderDesign fromColorAndUrl(@ColorInt int color, String imageUrl, Drawable d) {
        HeaderDesign headerDesign = new HeaderDesign();
        headerDesign.color = color;
        headerDesign.imageUrl = imageUrl;
        headerDesign.logo = d;
        return headerDesign;
    }

    public static HeaderDesign fromColorResAndUrl(@ColorRes int colorRes, String imageUrl, Drawable d) {
        HeaderDesign headerDesign = new HeaderDesign();
        headerDesign.colorRes = colorRes;
        headerDesign.imageUrl = imageUrl;
        headerDesign.logo = d;
        return headerDesign;
    }

    public static HeaderDesign fromColorAndDrawable(@ColorInt int color, Drawable drawable, Drawable d) {
        HeaderDesign headerDesign = new HeaderDesign();
        headerDesign.drawable = drawable;
        headerDesign.color = color;
        headerDesign.logo = d;
        return headerDesign;
    }

    public static HeaderDesign fromColorResAndDrawable(@ColorRes int colorRes, Drawable drawable, Drawable d) {
        HeaderDesign headerDesign = new HeaderDesign();
        headerDesign.colorRes = colorRes;
        headerDesign.drawable = drawable;
        headerDesign.logo = d;
        return headerDesign;
    }

    public int getColor() {
        return color;
    }

    public int getColorRes() {
        return colorRes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public Drawable getLogo() {
        return logo;
    }
}
