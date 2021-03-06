package com.stargazerproject.ui.parameter;

/**
 * StargazerProject UI 核心参数配置
 * 
 * @Web https://github.com/pisual http://www.pisual.com
 * @email pisual@163.com dsnsuva@163.com dsnsuva@gmail.com
 * @author Felixerio FelixSion
 */
class StargazerProjectParameter {
	
	/**全局根路径**/
	public static final String BasePath = System.getProperty("user.dir") + "/StargazerUIBlackRaven/";
	
	/**加载进度页面背景**/
	public static final String LOADING_INTERFACE_BACKGROUND = BasePath + "Loading.png";
	
	/**主界面页面背景**/
	public static final String MAIN_INTERFACE_BACKGROUND = BasePath + "BackGround.png";
	
	/**滚动条上部把手背景
	 *  ▲  ←
	 * |||
	 * |||
	 *  ▽
	 * **/
	public static final String JScrollPaneUI_UP_PNG = BasePath + "up.png";
	
	/**滚动条下部把手背景
	 *  △ 
	 * |||
	 * |||
	 *  ▼ ←
	 * **/
	public static final String JScrollPaneUI_Down_PNG = BasePath + "down.png";

	/**滚动条闸道背景颜色 RGB色组**/
	public static final String JScrollPaneUI_TrackColor = "18,22,34";
	
	/**滚动条把手边框颜色 RGB色组**/
	public static final String JScrollPaneUI_Scroll_Border_Color = "34,66,110";
	
	/**界面大小**/
	public static final String Main_Frame_Size = "1500,584";
	
	/**界面系统图标**/
	public static final String Main_Frame_IconImage = BasePath + "logo.png";
	
	/**操纵图标头像位置及大小**/
	public static final String Main_Frame_LogoLocation = "1385,20,100,100";
	
	/**操纵图标头像文件路径**/
	public static final String Main_Frame_Logo_Path = BasePath + "logo.png";
	
	/**主界面控制台高度**/
	public static final String Main_Frame_Console_Height = "340";
	
	/**控制台备用字体的绝对路径 在系统包含指定字体的情况下将不使用备用字体**/
	public static final String Main_Frame_Console_StandbyFontPath = BasePath + "Copperplate.ttf";
	
	/**控制台指定字体名称**/
	public static final String Main_Frame_Console_FontName = "Copperplate";
	
	/**控制台指定字体RGB颜色**/
	public static final String ConsoleText_FontColor = "255,255,255";
	
	/**加载界面进度条 RGB色组**/
	public static final String Loading_Frame_ProgressBar_Color = "149,148,148";
	
	/**加载界面备用字体的绝对路径 在系统包含指定字体的情况下将不使用备用字体**/
	public static final String Loading_Frame_ProgressInfo_StandbyFontPath = BasePath + "Copperplate.ttf";
	
	/**加载界面指定字体名称**/
	public static final String Loading_Frame_ProgressInfo_FontName = "Copperplate";
	
	/**加载界面指定字体颜色**/
	public static final String loading_ProgressInfo_FontColor = "255,255,255";

}
