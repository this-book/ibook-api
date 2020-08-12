package com.ibook.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.ibook.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hxb
 * @since 2020-07-26
 */
@RestController
@RequestMapping("//chapter")
public class ChapterController {

    private final ChapterService chapterService;

    public ChapterController(ChapterService chapterService) {
        this.chapterService = chapterService;
    }

    /**
     * @描述 通过小说的ID获取对应的章节内容
     * @参数 小说的ID
     * */
    @RequestMapping(value = "/getChapters",method = RequestMethod.GET,produces = "application/json")
    public R getChapters(Integer NovelID){
        return R.ok(chapterService.byNovelID(NovelID));
    }


}
