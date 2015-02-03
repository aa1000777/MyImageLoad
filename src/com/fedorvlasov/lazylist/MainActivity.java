package com.fedorvlasov.lazylist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

/**
 ***************************************************** 
 * <hr>
 * <dt><span class="strong">类功能简介:</span></dt>
 * <dd>Coffee</dd>
 * <dt><span class="strong">创建时间:</span></dt>
 * <dd>2015-2-3 上午11:52:00</dd>
 * <dt><span class="strong">公司:</span></dt>
 * <dd>主页面</dd>
 * 
 * @author aa1000777 - Email:aa1000777@qq.com
 ***************************************************** 
 */

public class MainActivity extends Activity {

	ListView list;
	MainAdapter adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		list = (ListView) findViewById(R.id.list);
		adapter = new MainAdapter(this, mStrings);
		list.setAdapter(adapter);

		Button b = (Button) findViewById(R.id.button1);
		b.setOnClickListener(listener);
	}

	@Override
	public void onDestroy() {
		list.setAdapter(null);
		super.onDestroy();
	}

	public OnClickListener listener = new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			adapter.imageLoader.clearCache();
			adapter.notifyDataSetChanged();
		}
	};

	private String[] mStrings = { "http://su.bdimg.com/static/superplus/img/logo_white_ee663702.png",

	"http://203.127.83.176/SEAASIA/downimg/20141104110121.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141104110209.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141104110511.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141104112228.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141104112338.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141111093356.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111093432.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141126121005.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141203094005.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212051703.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141215020331.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141215020421.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141215020432.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141215020442.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141215020500.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141215020511.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141215025503.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141215025516.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20150120095607.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141109065856.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141109065923.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141109065953.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141109070016.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141109070036.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141109070057.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141109070116.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141109070141.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141110083157.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110083226.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110083947.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084003.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084023.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084044.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084058.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084155.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084358.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084408.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084444.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084456.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084509.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084523.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084537.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084549.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084602.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084716.png",

	"http://203.127.83.176/SEAASIA/downimg/20141110084948.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015344.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015451.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015509.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015525.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015544.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015558.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015613.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015631.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015646.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015657.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015712.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015733.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015746.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015826.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015837.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111015850.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111020251.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111020357.png",

	"http://203.127.83.176/SEAASIA/downimg/20141111020437.png",

	"http://203.127.83.176/SEAASIA/downimg/20141114125235.png",

	"http://203.127.83.176/SEAASIA/downimg/20141114125304.png",

	"http://203.127.83.176/SEAASIA/downimg/20141114065703.png",

	"http://203.127.83.176/SEAASIA/downimg/20141120023606.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120023901.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120023932.jpg", "http://203.127.83.176/SEAASIA/downimg/20141120024022.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120024153.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120024246.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120024329.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120024438.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120024527.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120024632.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120024815.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120024858.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120024941.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120025019.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120025110.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120025146.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120025224.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120025306.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120025434.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120025519.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120025603.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120025714.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120025757.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120025839.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120025915.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141120025937.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141205110256.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141205110455.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141205110548.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141205110631.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141205110651.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141205110802.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141205110849.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141205110924.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212033915.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212034612.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212035450.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212035528.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212035613.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212035647.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212035749.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212040037.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212040632.gif",

	"http://203.127.83.176/SEAASIA/downimg/20141212041202.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212041546.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212041726.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212041819.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141212045442.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20141219060128.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20150105102430.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20150112110543.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20150114104511.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20150116103400.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20150123103431.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20150123043301.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20150123043611.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20150127102459.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20150129021641.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20150129022655.jpg",

	"http://203.127.83.176/SEAASIA/downimg/20150202025520.jpg", "http://static.kuaihuala.com/uploads/share/20141223/14193276354943.jpg",
			"http://static.kuaihuala.com/uploads/adver/20141222/14192466504022.jpg", "http://static.kuaihuala.com/uploads/adver/20141222/14192464894056.jpg",
			"http://static.kuaihuala.com/uploads/download/20141230/14199214419877.jpg",
			"http://static.kuaihuala.com/uploads/download/20141222/14192471472179.jpg",
			"http://static.kuaihuala.com/uploads/download/20141222/1419245961720.jpg", "http://static.kuaihuala.com/uploads/share/20141229/14198335778831.jpg",
			"http://static.kuaihuala.com/uploads/share/20141223/14193308734597.jpg",
			"http://static.kuaihuala.com/uploads/download/20141229/14198460398571.jpg",
			"http://static.kuaihuala.com/uploads/download/20141229/14198399966853.jpg",
			"http://static.kuaihuala.com/uploads/download/20141229/14198498909027.jpg", "http://static.kuaihuala.com/uploads/adver/20141230/1419924451817.jpg",
			"http://static.kuaihuala.com/uploads/download/20141231/14199924451997.jpg",
			"http://static.kuaihuala.com/uploads/download/20141231/1419993178509.jpg",
			"http://static.kuaihuala.com/uploads/download/20141231/14199938863183.jpg",
			"http://static.kuaihuala.com/uploads/download/20141231/14199956659657.jpg",
			"http://static.kuaihuala.com/uploads/download/20141231/14199960857576.jpg",
			"http://static.kuaihuala.com/uploads/download/20141231/14199965043272.jpg", "http://203.127.83.176/SEAASIA/downimg/20141120024022.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120024153.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120024246.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120024329.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120024438.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120024527.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120024632.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120024815.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120024858.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120024941.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120025019.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120025110.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120025146.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120025224.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120025306.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120025434.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120025519.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120025603.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120025714.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120025757.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120025839.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120025915.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141120025937.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141205110256.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141205110455.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141205110548.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141205110631.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141205110651.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141205110802.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141205110849.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141205110924.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141212033915.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141212034612.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141212035450.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141212035528.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141212035613.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141212035647.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141212035749.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141212040037.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141212040632.gif",

			"http://203.127.83.176/SEAASIA/downimg/20141212041202.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141212041546.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141212041726.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141212041819.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141212045442.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20141219060128.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20150105102430.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20150112110543.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20150114104511.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20150116103400.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20150123103431.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20150123043301.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20150123043611.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20150127102459.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20150129021641.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20150129022655.jpg",

			"http://203.127.83.176/SEAASIA/downimg/20150202025520.jpg", "http://static.kuaihuala.com/uploads/share/20141223/14193276354943.jpg",
			"http://static.kuaihuala.com/uploads/adver/20141222/14192466504022.jpg", "http://static.kuaihuala.com/uploads/adver/20141222/14192464894056.jpg",
			"http://static.kuaihuala.com/uploads/download/20141230/14199214419877.jpg",
			"http://static.kuaihuala.com/uploads/download/20141222/14192471472179.jpg",
			"http://static.kuaihuala.com/uploads/download/20141222/1419245961720.jpg", "http://static.kuaihuala.com/uploads/share/20141229/14198335778831.jpg",
			"http://static.kuaihuala.com/uploads/share/20141223/14193308734597.jpg",
			"http://static.kuaihuala.com/uploads/download/20141229/14198460398571.jpg",
			"http://static.kuaihuala.com/uploads/download/20141229/14198399966853.jpg",
			"http://static.kuaihuala.com/uploads/download/20141229/14198498909027.jpg", "http://static.kuaihuala.com/uploads/adver/20141230/1419924451817.jpg",
			"http://static.kuaihuala.com/uploads/download/20141231/14199924451997.jpg",
			"http://static.kuaihuala.com/uploads/download/20141231/1419993178509.jpg",
			"http://static.kuaihuala.com/uploads/download/20141231/14199938863183.jpg",
			"http://static.kuaihuala.com/uploads/download/20141231/14199956659657.jpg",
			"http://static.kuaihuala.com/uploads/download/20141231/14199960857576.jpg",
			"http://static.kuaihuala.com/uploads/download/20141231/14199965043272.jpg", };
}