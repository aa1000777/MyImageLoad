package com.fedorvlasov.lazylist;

import java.io.InputStream;
import java.io.OutputStream;

/**
 ***************************************************** 
 * <hr>
 * <dt><span class="strong">�๦�ܼ��:</span></dt>
 * <dd>Coffee</dd>
 * <dt><span class="strong">����ʱ��:</span></dt>
 * <dd>2015-2-3 ����11:54:24</dd>
 * <dt><span class="strong">��˾:</span></dt>
 * <dd>CorpIt</dd>
 * 
 * @author aa1000777 - Email:aa1000777@qq.com
 ***************************************************** 
 */

public class Utils {
	public static void CopyStream(InputStream is, OutputStream os) {
		final int buffer_size = 1024;
		try {
			byte[] bytes = new byte[buffer_size];
			for (;;) {
				int count = is.read(bytes, 0, buffer_size);
				if (count == -1)
					break;
				os.write(bytes, 0, count);
				is.close();
				os.close();
			}
		} catch (Exception ex) {
		}
	}
}