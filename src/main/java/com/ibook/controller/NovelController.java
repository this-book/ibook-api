package com.ibook.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.ibook.service.*;
import com.ibook.util.NovelFormatUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hxb
 * @since 2020-07-26
 */
@RestController
@CrossOrigin//跨域
@RequestMapping("//novel")
public class NovelController {

    private final NovelService novelService;

    public NovelController(NovelService novelService) {
        this.novelService = novelService;
    }

    /**
     * @描述 获取全部小说的列表
     * */
    @RequestMapping("/novels")
    public R getList(){
        return R.ok(novelService.list()).setCode(8000);
    }


    /**
     * @描述 获取已经完结小说列表
     * */
    @RequestMapping(value = "/getOverNovels",method = RequestMethod.POST,produces = "application/json")
    public R getOverNovels(){
        return R.ok(novelService.getOverNovels()).setCode(8000);
    }

    /**
     * @描述 获取10个已经完结小说
     * */
    @RequestMapping(value = "/getOverNovelsLimit",method = {RequestMethod.POST,RequestMethod.GET},produces = "application/json")
    public R getOverNovelsLimit(){
        List format = NovelFormatUtil.Format(novelService.getOverNovelsLimit());

        return R.ok(format).setCode(8000);
    }


}
