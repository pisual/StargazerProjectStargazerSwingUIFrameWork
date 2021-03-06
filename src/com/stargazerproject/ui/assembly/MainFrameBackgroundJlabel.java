package com.stargazerproject.ui.assembly;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *主界面背景
 * 
 *@Web https://github.com/pisual http://www.pisual.com
 *@email pisual@163.com dsnsuva@163.com dsnsuva@gmail.com
 *@author Felixerio FelixSion
 */
public class MainFrameBackgroundJlabel extends JLabel{
	private static final long serialVersionUID = 4040037367225492924L;
	/**单例模式**/
	private static MainFrameBackgroundJlabel mainFrameBackgroundJlabel;
	
	public static MainFrameBackgroundJlabel getInstance(String background){
		if(mainFrameBackgroundJlabel == null){
			ImageIcon backgroundImage = new ImageIcon(background);
			mainFrameBackgroundJlabel = new MainFrameBackgroundJlabel(backgroundImage);
			mainFrameBackgroundJlabel.initMainFrameBackgroundJlabel(backgroundImage);
		}
		return mainFrameBackgroundJlabel;
	}
	
	private MainFrameBackgroundJlabel(ImageIcon background) {
		super(background);
	}
	
	private void initMainFrameBackgroundJlabel(ImageIcon background){
		mainFrameBackgroundJlabel.setBounds(0, 0,background.getIconWidth(), background.getIconHeight());
	}
}
