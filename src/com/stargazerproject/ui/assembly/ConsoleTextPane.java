package com.stargazerproject.ui.assembly;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import com.stargazerproject.ui.exception.ExceptionDispose;
import com.stargazerproject.ui.parameter.GetParamentByName;
import com.stargazerproject.ui.util.ColorUtil;
import com.stargazerproject.ui.util.FontUtil;
import com.stargazerproject.ui.util.UIUtil;

/**
 * 主界面控制台输出
 * 
 * @Web https://github.com/pisual http://www.pisual.com
 * @email pisual@163.com dsnsuva@163.com dsnsuva@gmail.com
 * @author Felixerio FelixSion
 */
public class ConsoleTextPane extends JTextPane {
	private static final long serialVersionUID = 7309857723035362456L;
	/** ConsoleTextArea单例 **/
	private static ConsoleTextPane consoleTextArea;
	/** 控制台输出字符字体类型 **/
	private static Font ConsoleTextFont;
	/** 控制台备用字体的绝对路径 在系统包含指定字体的情况下将不使用备用字体 **/
	public static String Main_Frame_Console_StandbyFontPath;
	/** 控制台指定字体名称 **/
	public static String Main_Frame_Console_FontName;
	/** 控制台输出字符字体颜色 **/
	private static Color ConsoleText_FontColor;

	private static StyledDocument styledDocument;

	private static Style style;

	private static SimpleAttributeSet simpleAttributeSet;

	public static ConsoleTextPane getInstance() {
		if (consoleTextArea == null) {
			consoleTextArea = new ConsoleTextPane();
			consoleTextArea.initConsoleTextArea();
		}
		return consoleTextArea;
	}

	private ConsoleTextPane() {
		Main_Frame_Console_StandbyFontPath = GetParamentByName.GetParamentByKeyInSystemMemory("Main_Frame_Console_StandbyFontPath");
		Main_Frame_Console_FontName = GetParamentByName.GetParamentByKeyInSystemMemory("Main_Frame_Console_FontName");
		ConsoleText_FontColor = ColorUtil.getColorFromSystemmParanment("ConsoleText_FontColor");
		ConsoleTextFont = FontUtil.getConsoleFont(Main_Frame_Console_FontName,Main_Frame_Console_StandbyFontPath);
		ConsoleTextFont.deriveFont(Font.BOLD, 13);
		simpleAttributeSet = new SimpleAttributeSet();
		StyleConstants.setForeground(simpleAttributeSet, ConsoleText_FontColor);
	}

	private void initConsoleTextArea() {
		styledDocument = consoleTextArea.getStyledDocument();
		style = styledDocument.addStyle("ConsoleTextPane", null);
		StyleConstants.setIcon(style,new ImageIcon("/Users/Felixerio/Workspaces/StargazerProject/StargazerProjectStargazerSwingUIFrameWork/StargazerUIBlackRaven/PisualCellsSmall.png"));
		consoleTextArea.setOpaque(false);
		consoleTextArea.setFont(ConsoleTextFont);
		consoleTextArea.setForeground(ConsoleText_FontColor);
		consoleTextArea.setBorder(BorderFactory.createEmptyBorder());
		UIUtil.startConsoleReaderThread(consoleTextArea);
	}

	public static void insertMessage(String text) {
		try {
			styledDocument.insertString(styledDocument.getLength(), text + '\n', simpleAttributeSet);
		} catch (BadLocationException e) {
			ExceptionDispose.catchExceptionAndSaveToDatabase("Document 配置错误");
		}
	}

	public static void insertLogo() {
		try {
			styledDocument.insertString(styledDocument.getLength(), " ", style);
		} catch (BadLocationException ex) {
			ExceptionDispose.catchExceptionAndSaveToDatabase("Document 配置错误");
		}
	}

	public static void insertLine() {
		StyleConstants.setIcon(style,new ImageIcon("/Users/Felixerio/Workspaces/StargazerProject/StargazerProjectStargazerSwingUIFrameWork/StargazerUIBlackRaven/Line.png"));
		try {
			styledDocument.insertString(styledDocument.getLength(), " ", style);
		} catch (BadLocationException ex) {
			ExceptionDispose.catchExceptionAndSaveToDatabase("Document 配置错误");
		}
	}

}