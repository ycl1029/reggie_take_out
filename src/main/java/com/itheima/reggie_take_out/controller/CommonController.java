package com.itheima.reggie_take_out.controller;

import com.itheima.reggie_take_out.common.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

/**
 * Class Name: CommonController
 * Description: 上传图片
 *
 * @Author 原常乐
 * @Create 2023/12/29 18:00
 * @Version 1.0
 */
@RestController
@RequestMapping("/common")
public class CommonController {

    @Value("${reggie.path}")
    private String bashPath;

    @PostMapping("/upload")
    public R<String> upload(MultipartFile file){

        String originalFilename = file.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));

        String  fileName = UUID.randomUUID().toString() + suffix;

        File dir = new File(bashPath);
        if (!dir.exists()){
            dir.mkdirs();
        }

        try {
            file.transferTo(new File(bashPath + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return R.success(fileName);
    }

    //回显上传的图片
    @GetMapping("/download")
    public void download(String name, HttpServletResponse response) throws IOException {

        try {
            //通过输入流读取文件
            FileInputStream fileInputStream = new FileInputStream(new File(bashPath + name));
            //输出流
            ServletOutputStream outputStream = response.getOutputStream();
            response.setContentType("image/jpeg");

            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fileInputStream.read(bytes)) != -1){
                outputStream.write(bytes,0,len);
                outputStream.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
