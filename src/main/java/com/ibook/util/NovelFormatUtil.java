package com.ibook.util;

import com.ibook.entity.Novel;
import com.ibook.entity.NovelNoveltype;
import com.ibook.entity.Noveltype;

import java.util.ArrayList;
import java.util.List;

public class NovelFormatUtil {

    public static List Format(List<Novel> list){

        List<Object> retList = new ArrayList<>();
        Object[] objects = null;
        for (int i = 0; i < list.size(); i++) {

            Novel novel = list.get(i);
            List<Noveltype> noveltypes = novel.getNoveltypes();
            Noveltype noveltype = noveltypes.get(0);
            if (!"其他书籍".equals(noveltype.getNovelTypeName())){
                Noveltype noveltype1 = noveltypes.get(1);
                noveltype.setNovelTypeName(noveltype.getNovelTypeName()+noveltype1.getNovelTypeName());
            }


            if (i%2==0){
                objects = new Object[2];
                objects[0] = novel;
            }else{
                objects[1] = novel;
                retList.add(objects);
            }

        }

        return retList;
    }

}
