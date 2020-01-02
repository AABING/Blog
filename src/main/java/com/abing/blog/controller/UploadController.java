package com.abing.blog.controller;

import com.abing.blog.pojo.Result;
import com.abing.blog.pojo.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Description: 上传文件
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2020/01/02 16:07
 * @since JDK 1.8
 */
@RestController
@Slf4j
@Api(description = "上传文件")
public class UploadController {
    @Value("${file.imagesPath}")
    private String imagesPath;

    @ApiOperation("上传文件")
    @PostMapping("/upload")
    public Result<String> upload(@RequestParam("firstPicture") MultipartFile file) {
        Result<String> result = new Result<>();
        if (file.isEmpty()) {
            result.setError(ResultCode.ERROR, "上传失败，未选择文件");
        } else {
            String fileName = file.getOriginalFilename();
            File f = new File(imagesPath + fileName);
            try {
                file.transferTo(f);
                log.info(imagesPath + fileName + "上传成功");
                result.setData(imagesPath + fileName + System.currentTimeMillis());
            } catch (IOException e) {
                log.error(e.toString(), e);
                result.setError(ResultCode.ERROR, e.getMessage());
            }
        }
        return result;
    }

    @GetMapping("/upload")
    public ModelAndView upload(ModelAndView mv) {
        mv.setViewName("upload");
        return mv;
    }
}
