package com.fedorvlasov.lazylist;

import java.io.File;

import android.content.Context;

/**
 ***************************************************** 
 * <hr>
 * <dt><span class="strong">�๦�ܼ��:</span></dt>
 * <dd>Coffee</dd>
 * <dt><span class="strong">����ʱ��:</span></dt>
 * <dd>2015-2-3 ����11:49:30</dd>
 * <dt><span class="strong">��˾:</span></dt>
 * <dd>�ļ�Ŀ¼</dd>
 * 
 * @author aa1000777 - Email:aa1000777@qq.com
 ***************************************************** 
 */

public class FileCache {

	private File cacheDir;

	public FileCache(Context context) {
		// �ҵ���ʡ�����ͼ��Ŀ¼
		if (android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED)) {
			cacheDir = new File(android.os.Environment.getExternalStorageDirectory(), "LazyList");
		} else {
			cacheDir = context.getCacheDir();
		}
		if (!cacheDir.exists()) {
			cacheDir.mkdirs();
		}
	}

	public File getFile(String url) {
		// ��ȷ��ͼƬ��hashCode������һ�������Ľ��������Ϊ��ʾ�á�
		String filename = String.valueOf(url.hashCode());
		// Another possible solution (thanks to grantland)
		// String filename = URLEncoder.encode(url);
		File f = new File(cacheDir, filename);
		System.out.println("�����ļ�����" + f.getParent());
		return f;

	}

	public void clear() {
		File[] files = cacheDir.listFiles();
		if (files == null)
			return;
		for (File f : files)
			f.delete();
	}

}