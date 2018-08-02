package com.framework.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import org.springframework.web.multipart.MultipartFile;

import com.framework.utils.StringUtil;

public class FileService {

	public void fileChannelCopy(File s, File t) {

		FileInputStream fi = null;

		FileOutputStream fo = null;

		FileChannel in = null;

		FileChannel out = null;

		try {

			fi = new FileInputStream(s);

			fo = new FileOutputStream(t);

			in = fi.getChannel();// 得到对应的文件通道

			out = fo.getChannel();// 得到对应的文件通道

			in.transferTo(0, in.size(), out);// 连接两个通道，并且从in通道读取，然后写入out通道

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				fi.close();

				in.close();

				fo.close();

				out.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

	}

	public String upload(MultipartFile file, String localPath,String netPath){

		if (file != null) {
			// 取得当前上传文件的文件名称
			String realFileName = file.getOriginalFilename();
			// 如果名称不为“”,说明该文件存在，否则说明该文件不存在
			if (realFileName.trim() != "") {
				// 重命名上传后的文件名
				String prefix = "." + realFileName.substring(realFileName.lastIndexOf(".") + 1);
				String fileName = StringUtil.getRandomName() + StringUtil.getRandomString() + prefix;
				// 定义上传路径
				String path = localPath + fileName;
				String networkPath = netPath + fileName;
				File localFile = new File(path);
				try {
					file.transferTo(localFile);
					return networkPath;
				} catch (Exception e) {
					e.printStackTrace();
					return "";
				}
			}
		}
		return "";
	}
}
