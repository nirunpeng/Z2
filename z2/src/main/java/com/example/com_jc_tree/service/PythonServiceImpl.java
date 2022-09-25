package com.example.com_jc_tree.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class PythonServiceImpl {

    public void faceRecognition() throws IOException {
        //前面一半是本地环境下的python的启动文件地址，后面一半是要执行的python脚本地址
        String[] arguments = new String[] {"C:\\ProgramData\\Python\\python.exe",
                "C:\\Users\\PENG\\IdeaProjects\\demo1\\z2\\src\\main\\resources\\static\\create.py"};
        Process proc;
        try {
            proc = Runtime.getRuntime().exec(arguments);// 执行py文件
            //用输入输出流来截取结果
            FileInputStream errorStream = (FileInputStream)proc.getErrorStream();
            InputStreamReader isr = new InputStreamReader(errorStream,"gbk");//读取
            System.out.println(isr.getEncoding());
            BufferedReader in = new BufferedReader(isr);//缓冲

            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            //waitFor是用来显示脚本是否运行成功，1表示失败，0表示成功，还有其他的表示其他错误
            int re = proc.waitFor();
            System.out.println(re);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
