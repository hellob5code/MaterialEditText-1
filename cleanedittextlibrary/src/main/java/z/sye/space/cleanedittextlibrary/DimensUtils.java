/**
 * @(#) z.sye.space.cleanedittextlibrary 2016/1/11;
 * <p/>
 * Copyright (c), 2009 深圳孔方兄金融信息服务有限公司（Shenzhen kfxiong
 * Financial Information Service Co. Ltd.）
 * <p/>
 * 著作权人保留一切权利，任何使用需经授权。
 */
package z.sye.space.cleanedittextlibrary;

import android.content.Context;

/**
 * Created by Syehunter on 2016/1/11.
 */
public class DimensUtils {

    /**
     * @Desc: dip转化为px
     */
    public static int dip2px(Context context, int dip) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dip * scale + 0.5f);
    }
}