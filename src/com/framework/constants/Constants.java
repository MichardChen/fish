package com.framework.constants;

import org.slf4j.impl.StaticMDCBinder;

/**
 * 系统常量
 * 
 * @author Chen Dang
 * @date 2016年3月29日 上午8:45:58
 * @version 1.0
 * @Description:
 */
public interface Constants {

	public final static String SYSTEM_NAME = "56物流平台";

	/**
	 * 异常信息统一头信息<br>
	 * 非常遗憾的通知您,程序发生了异常
	 */
	public static final String Exception_Head = "OH,MY GOD! SOME ERRORS OCCURED! AS FOLLOWS :";
	/** 客户端语言 */
	public static final String USERLANGUAGE = "userLanguage";
	/** 客户端主题 */
	public static final String WEBTHEME = "webTheme";
	/** 当前用户 */
	public static final String CURRENT_USER = "CURRENT_USER";
	/** 在线用户数量 */
	public static final String ALLUSER_NUMBER = "ALLUSER_NUMBER";
	/** 登录用户数量 */
	public static final String USER_NUMBER = "USER_NUMBER";
	/** 上次请求地址 */
	public static final String PREREQUEST = "PREREQUEST";
	/** 上次请求时间 */
	public static final String PREREQUEST_TIME = "PREREQUEST_TIME";
	/** 非法请求次数 */
	public static final String MALICIOUS_REQUEST_TIMES = "MALICIOUS_REQUEST_TIMES";
	/** 缓存命名空间 */
	public static final String CACHE_NAMESPACE = "iBase4J:";

	/** 用户类型 */
	public static interface USER_TYPE {
		public static final String USER_TYPE_CLIENT = "010001";
		public static final String PLATFORM_USER = "010002";
	}

	/** 消息 */
	public static interface MESSAGE_CONTENT {
		public static final String VERTIFY_CODE_MSG = "尊敬的用户，您的验证码是：0914，10分钟内有效。";
	}

	/** 状态码 */
	public static interface STATUS_CODE {
		public static final String LOGIN_SUCCESS = "5606";
		public static final String LOGIN_FAIL = "5607";
		public static final String LOGIN_FAIL_ERROR_PWD = "560701";
		public static final String LOGIN_FAIL_USER_NOT_EXIST = "560702";
		public static final String USER_NOT_LOGIN = "560703";
		public static final String USER_LOGIN_ANOTHER_DEVICE = "560704";
		public static final String LOGIN_EXPIRE = "560705";
		public static final String SUCCESS = "5600";
		public static final String FAIL = "5700";
		public static final String LOGIN_ANOTHER_PLACE = "5701";
		public static final String ACCOUNT_MONEY_NOT_ENOUGH = "5702";
		public static final String PAYPWD_ERROR = "5703";
		public static final String IMAGE_UPLOAD_SUCCESS = "5610";
		public static final String IMAGE_UPLOAD_FAIL = "5611";
	}

	/** 日期格式 */
	public static interface DATE_FORMAT {
		public static final String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd HH:mm";
		public static final String DATE_FORMATE_YYYYMMDD = "yyyy-MM-dd";
	}

	public static interface CHARACTER {
		public static final String STRENGTH_CHAR = "-";
	}

	public static interface STRING_ONE_ZERO {
		public static final String ONE = "1";
		public static final String ZERO = "0";
	}

	public static interface NUMBER {
		public static final int ONE = 1;
		public static final int ZERO = 0;
	}

	public static interface LOCATION_TYPE {
		public static final String PROVINCE = "province";
		public static final String CITY = "city";
		public static final String DISTRICT = "district";
	}

	public static interface PLATFORM {
		public static final String ANDROID = "020002";
		public static final String IOS = "020001";
	}

	/**
	 * 本地
	 */
	/**
	public static interface HOST {
		public static final String LOCALHOST = "http://192.168.1.91:82/newsimages/";
		public static final String TEA = "http://192.168.1.91:82/tea/";
		public static final String DOCUMENT = "http://192.168.1.91:82/document/";
		public static final String FILE = "http://192.168.1.91:82/file/";
		public static final String ICON = "http://192.168.1.91:82/icon/";
		public static final String IMG = "http://192.168.1.91:82/img/";
		public static final String STORE = "http://192.168.1.91:82/store/";
		public static final String COMMON = "http://192.168.1.91:82/common/";
	}

	public static interface FILE_HOST {
		public static final String LOCALHOST = "F:\\upload\\newsimages\\";
		public static final String TEA = "F:\\upload\\tea\\";
		public static final String DOCUMENT = "F:\\upload\\document\\";
		public static final String FILE = "F:\\upload\\file\\";
		public static final String ICON = "F:\\upload\\icon\\";
		public static final String IMG = "F:\\upload\\img\\";
		public static final String STORE = "F:\\upload\\store\\";
		public static final String COMMON = "F:\\upload\\common\\";
	}
	
	public static interface HTTP_HOST {
		public static final String LOCALHOST = "http://192.168.1.91:82/newsimages/";
		public static final String TEA = "http://192.168.1.91:82/tea/";
		public static final String DOCUMENT = "http://192.168.1.91:82/document/";
		public static final String FILE = "http://192.168.1.91:82/file/";
		public static final String ICON = "http://192.168.1.91:82/icon/";
		public static final String IMG = "http://192.168.1.91:82/img/";
		public static final String STORE = "http://192.168.1.91:82/store/";
		public static final String COMMON = "http://192.168.1.91:82/common/";
	}*/

	//测试服务器地址
	/**
	public static interface HOST {
		public static final String DOCUMENT = "http://www.yibuwangluo.cn:88/document/";
		public static final String IMG = "http://www.yibuwangluo.cn:88/img/";
		public static final String MAP_URL = "http://www.yibuwangluo.cn/framework/map.html";
	}
	
	public static interface HTTPS_HOST {
		public static final String DOCUMENT = "https://www.yibuwangluo.cn/document/";
	}

	public static interface HTTP_HOST {
		public static final String DOCUMENT = "http://www.yibuwangluo.cn:88/document/";
	}
	
	public static interface HTTPS_FILE_HOST {
		public static final String DOCUMENT = "D:\\apache-tomcat-7.0.69-ht\\webapps\\ROOT\\document\\";
	}

	public static interface FILE_HOST {
		public static final String DOCUMENT = "D:\\upload\\document\\";
		public static final String IMG = "D:\\upload\\img\\";
	}
	*/

	//Linux服务器地址
	public static interface HOST {
		public static final String DOCUMENT = "https://www.huisouche8.com:88/document/";
		public static final String IMG = "http://www.huisouche8.com:88/img/";
		public static final String MAP_URL = "https://www.huisouche8.com/framework/map.html";
		//public static final String MAP_URL = "https://www.yibuwangluo.cn/framework/map.html";
	}
	
	public static interface HTTPS_HOST {
		public static final String DOCUMENT = "https://www.huisouche8.com/document/";
		public static final String STORY = "https://www.huisouche8.com/document/story/";
		public static final String NEWS = "https://www.huisouche8.com/document/news/";
	}

	public static interface HTTP_HOST {
		public static final String DOCUMENT = "https://www.huisouche8.com:88/document/";
	}
	
	public static interface HTTPS_FILE_HOST {
		public static final String DOCUMENT = "/home/tomcat/apache-tomcat-8.0.30/webapps/ROOT/document/";
		public static final String STORY = "/home/tomcat/apache-tomcat-8.0.30/webapps/ROOT/document/story/";
		public static final String NEWS = "/home/tomcat/apache-tomcat-8.0.30/webapps/ROOT/document/news/";
	}

	public static interface FILE_HOST {
		public static final String DOCUMENT = "/home/data/document/";
		public static final String IMG = "/home/data/img/";
	}


	public static interface FEEDBACK_STATUS {
		public static final String HANDLE = "050002";
		public static final String STAY_HANDLE = "050001";
	}

	public static interface CAROUSEL_TYPE {
		// 店招
		public static final String STORY_ZHAO = "040001";
		// PC版轮播图
		public static final String PC_INDEX = "040002";
		// 微信轮播图
		public static final String WX_INDEX = "040003";
		// 小程序轮播图
		public static final String XCX_INDEX = "040004";
		// 小程序以租代购横幅
		public static final String CAR_LEASE_IMAGE = "040005";
		// 小程序二手车横幅
		public static final String CAR_SECONDHAND_IMAGE = "040006";
		// 小程序平行进口横幅
		public static final String CAR_IMPORT_IMAGE = "040007";

		// pc以租代购横幅
		public static final String PC_CAR_LEASE_IMAGE = "040008";
		// pc二手车横幅
		public static final String PC_CAR_SECONDHAND_IMAGE = "040009";
		// pc平行进口横幅
		public static final String PC_CAR_IMPORT_IMAGE = "040010";

		// h5以租代购横幅
		public static final String H5_CAR_LEASE_IMAGE = "040011";
		// h5二手车横幅
		public static final String H5_CAR_SECONDHAND_IMAGE = "040012";
		// h5平行进口横幅
		public static final String H5_CAR_IMPORT_IMAGE = "040013";
		// 平行进口车常见问题
		public static final String IMPORT_CAR_OFTENQUESTION = "040014";
		// 会淘车购买须知
		public static final String SECONDHAND_CAR_BUYKONW = "040015";
		// 会淘车购买说明
		public static final String SECONDHAND_CAR_BUYMARK = "040016";
		// 以租代购购买须知
		public static final String LEASE_CAR_BUYKONW = "040017";
		// 以租代购购买说明
		public static final String LEASE_CAR_BUYMARK = "040018";
		//惠车邦售后服务图片
		public static final String AFTER_SALE = "040019";
		//pc
		//PC平行进口车常见问题
		public static final String PC_IMPORT_CAR_OFTENQUESTION = "040020";
		//PC会淘车购买须知
		public static final String PC_SECONDHAND_CAR_BUYKONW = "040021";
		//PC会淘车购买说明
		public static final String PC_SECONDHAND_CAR_BUYMARK = "040022";
		//PC以租代购购买须知
		public static final String PC_LEASE_CAR_BUYKONW = "040023";
		//PC以租代购购买说明
		public static final String PC_LEASE_CAR_BUYMARK = "040024";
		//PC惠车邦售后服务图片
		public static final String PC_AFTER_SALE = "040025";
	}

	public static interface SHORT_MESSAGE_TYPE {
		public static final String REGISTER = "200001";
		public static final String FORGET_REGISTER_PWD = "200002";
		public static final String FORGET_PAY_PWD = "200003";
		public static final String SUMBIT_QUESTION = "200004";
	}

	// 车型
	public static interface CAR_TYPE {
		public static final String SMALL = "060001";
		public static final String MIDDLE = "060002";
		public static final String SUV = "060003";
		public static final String MPV = "060004";
		public static final String PAOCHE = "060005";
	}

	// 品类
	public static interface CAR_CLASS {
		public static final String MEIGUI = "070001";
		public static final String JIAGUI = "070002";
		public static final String MOGUI = "070003";
		public static final String ZHONGDONG = "070004";
		public static final String OUGUI = "070005";
	}

	// 问答类型
	public static interface QUESTION_ANSWER_TYPE {
		public static final String GOUCHE_MARK = "080001";
		public static final String FEIYONG = "080002";
		public static final String SHOUHOU = "080003";
		public static final String YONGCHE = "080004";
		public static final String BAOXIAN = "080005";
		public static final String QITA = "080006";
	}

	// 资讯类型
	public static interface QUESTION_TYPE {
		public static final String PC = "090001";
		public static final String XCX = "090002";
		public static final String H5 = "090003";
	}

	// 电话
	public static interface TEL_TYPE {
		public static final String KEFU = "100001";
	}

	// 汽车销售类型
	public static interface CAR_SALE_TYPE {
		public static final String LEASE = "110001";
		public static final String SECONDHAND = "110002";
		public static final String IMPORT = "110003";
	}
	
	//资讯类型
	public static interface NEWS_TYPE {
		//平台通知
		public static final String PLAT_NOTIFICATION = "030001";
		//汽车资讯
		public static final String CAR_NEWS = "030002";
		//活动专题
		public static final String ACTIVITY = "030003";
		//媒体报道
		public static final String MEDIA = "030004";
	}
	
	//文档类型
	public static interface DOCUMENT_ABOUTUS{
		public static final String ABOUTUS = "120001";
		public static final String JOINUS = "120002";
		public static final String SERVICE_ITEM = "120003";
		public static final String ABOUT_SALEAFTER = "120004";
		public static final String CONTACT_US = "120005";
		public static final String BUYCART_PRODUCE = "120003";
		public static final String PCODE = "120000";
	}
}
