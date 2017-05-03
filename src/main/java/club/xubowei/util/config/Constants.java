package club.xubowei.util.config;

import java.io.Serializable;

/**
 * Created by xubowei on 03/05/2017.
 */
public class Constants extends BasePropConfig implements Serializable {
    private static final long serialVersionUID = 8042355387234201583L;

    /***
     * 附件保存路径
     */
    public static String ATTACHMENT_SAVE_PATH;
    public static String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static String TIME_FORMAT_NUM = "yyyyMMddHHmmss";
    public static String ATTACHMENT_DOWNLOAD_PATH = "/admin/attachment_download.action?file=";
    //可以添加更多的静态变量

    //这个方法是重写父类的，解析文件后会自动调用
    public void parseConfigProperties() {
        //文件配置覆盖默认的值
        ATTACHMENT_SAVE_PATH = get("ATTACHMENT_SAVE_PATH",EMPTY_STR);
    }



}
