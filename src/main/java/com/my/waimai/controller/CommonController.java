package com.my.waimai.controller;

import com.my.waimai.common.R;
import com.my.waimai.myexception.DelException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/common")
public class CommonController {

//    @Value("${reggie.path}")
    @Value("E:\\tupianPath")
    private String basePath;

    /**
     * 图片上传
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public R<String> Upload(MultipartFile file)
    {
        log.info(file.toString());
        //原始文件名
        String originalFilename = file.getOriginalFilename();
        //原始类型
        String suffix =originalFilename.substring(originalFilename.lastIndexOf("."));
        //取文件名确保唯一
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String date = simpleDateFormat.format(System.currentTimeMillis());
        String filename = UUID.randomUUID().toString()+date+suffix;

        File file1 = new File("basePath");
        if(file1.exists())
        {
            file1.mkdirs();
        }
        try{
            file.transferTo(new File(basePath+"/"+filename));
        }catch (IOException ex)
        {
            ex.printStackTrace();
        }



        return R.success(filename);
    }

    /**
     * 图片下载
     * @param name
     * @param resp
     */
    @GetMapping("/download")
    public void gettupian(String name, HttpServletResponse resp) {

        try {
            InputStream inputStream=new FileInputStream(new File(basePath+"/"+name));
            OutputStream outputStream = resp.getOutputStream();
            int ent=0;
            byte [] bytes=new byte[1024*8];
            while (true)
            {
                int end = inputStream.read(bytes);
                if (end<=0) break;
                outputStream.write(bytes,0,end);

            }
            inputStream.close();
            outputStream.close();


            }catch (Exception e) {
            e.printStackTrace();
            }

    }
}
