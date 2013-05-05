/* Copyright (C) 2013  Zachary Scott <zscott.dev@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.zeddev.zedlog.gui;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import net.zeddev.zedlog.Config;

/**
 * The main GUI frame.
 *
 * @author Zachary Scott <zscott.dev@gmail.com>
 */
public final class ZedLogFrame extends javax.swing.JFrame {

	/**
	 * Creates new form <code>ZedLogFrame</code>.
	 *
	 */
	public ZedLogFrame() {

		initComponents();

		// center on screen
		setLocationRelativeTo(null);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	//@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        tabs = new javax.swing.JTabbedPane();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnHide = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        mitemSave = new javax.swing.JMenuItem();
        mitemLogDir = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        javax.swing.JPopupMenu.Separator jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mitemQuit = new javax.swing.JMenuItem();
        menuLoggers = new javax.swing.JMenu();
        mitemAdd = new javax.swing.JMenuItem();
        mitemRemove = new javax.swing.JMenuItem();
        mitemClear = new javax.swing.JMenuItem();
        menuTools = new javax.swing.JMenu();
        mitemHide = new javax.swing.JMenuItem();
        mitemReplay = new javax.swing.JMenuItem();
        sep = new javax.swing.JPopupMenu.Separator();
        menuProgramLog = new javax.swing.JMenu();
        mitemMsgLogFile = new javax.swing.JMenuItem();
        mitemLogWindow = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        mitemHelp = new javax.swing.JMenuItem();
        javax.swing.JPopupMenu.Separator sep1 = new javax.swing.JPopupMenu.Separator();
        mitemAbout = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(Config.INSTANCE.FULL_NAME);
        setPreferredSize(new java.awt.Dimension(640, 480));

        btnAdd.setText("Add");
        btnAdd.setToolTipText("Add a new logger to ZedLog.");

        btnRemove.setText("Remove");
        btnRemove.setToolTipText("Remove the selected logger from ZedLog.");

        btnNext.setText(">");

        btnPrev.setText("<");
        btnPrev.setToolTipText("");

        btnHide.setMnemonic('H');
        btnHide.setText("Hide");
        btnHide.setToolTipText("Hide the ZedLog window.");

        btnClear.setMnemonic('C');
        btnClear.setText("Clear");
        btnClear.setToolTipText("Clear all loggers and all logged data.");

        menuFile.setText("File");

        mitemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mitemSave.setMnemonic('S');
        mitemSave.setText("Save");
        mitemSave.setToolTipText("Save the composite logger output.");
        menuFile.add(mitemSave);

        mitemLogDir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mitemLogDir.setText("Set Log Directory");
        mitemLogDir.setToolTipText("Set the output log file directory.");
        menuFile.add(mitemLogDir);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setMnemonic('O');
        jMenuItem2.setText("Open Log Directory");
        jMenuItem2.setToolTipText("Open logged data.");
        menuFile.add(jMenuItem2);
        menuFile.add(jSeparator1);

        mitemQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mitemQuit.setMnemonic('q');
        mitemQuit.setText("Quit");
        mitemQuit.setToolTipText("Quit ZedLog.");
        menuFile.add(mitemQuit);

        menubar.add(menuFile);

        menuLoggers.setMnemonic('L');
        menuLoggers.setText("Loggers");

        mitemAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_EQUALS, java.awt.event.InputEvent.CTRL_MASK));
        mitemAdd.setMnemonic('A');
        mitemAdd.setText("Add Logger");
        mitemAdd.setToolTipText("Add a new logger to ZedLog.");
        menuLoggers.add(mitemAdd);

        mitemRemove.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_MINUS, java.awt.event.InputEvent.CTRL_MASK));
        mitemRemove.setMnemonic('R');
        mitemRemove.setText("Remove Logger");
        mitemRemove.setToolTipText("Remove the selected logger from ZedLog.");
        menuLoggers.add(mitemRemove);

        mitemClear.setMnemonic('C');
        mitemClear.setText("Clear All");
        mitemClear.setToolTipText("Clear all loggers and all logged data.");
        menuLoggers.add(mitemClear);

        menubar.add(menuLoggers);

        menuTools.setMnemonic('T');
        menuTools.setText("Tools");

        mitemHide.setMnemonic('H');
        mitemHide.setText("Hide");
        mitemHide.setToolTipText("Hide the ZedLog window.");
        menuTools.add(mitemHide);

        mitemReplay.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mitemReplay.setMnemonic('R');
        mitemReplay.setText("Replay Events");
        mitemReplay.setToolTipText("Replay/simulate the events recorded by ZedLog.");
        menuTools.add(mitemReplay);
        menuTools.add(sep);

        menuProgramLog.setText("Program Log");
        menuProgramLog.setToolTipText(null);

        mitemMsgLogFile.setText("Set Log File");
        mitemMsgLogFile.setToolTipText("Set the program log file.");
        menuProgramLog.add(mitemMsgLogFile);

        mitemLogWindow.setText("Show Log Window");
        mitemLogWindow.setToolTipText("Show the program log window.");
        menuProgramLog.add(mitemLogWindow);

        menuTools.add(menuProgramLog);

        menubar.add(menuTools);

        menuHelp.setMnemonic('H');
        menuHelp.setText("Help");

        mitemHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mitemHelp.setMnemonic('H');
        mitemHelp.setText("Help");
        mitemHelp.setToolTipText("Display the program documentation.");
        menuHelp.add(mitemHelp);
        menuHelp.add(sep1);

        mitemAbout.setMnemonic('A');
        mitemAbout.setText("About");
        mitemAbout.setToolTipText("Display information about ZedLog.");
        menuHelp.add(mitemAbout);

        menubar.add(menuHelp);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnHide)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(btnPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext))
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove)
                    .addComponent(btnNext)
                    .addComponent(btnPrev)
                    .addComponent(btnHide)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("zedlog");

        pack();
    }// </editor-fold>//GEN-END:initComponents

	public JMenuItem getMItemAdd() {
		return mitemAdd;
	}

	public JMenuItem getMItemRemove() {
		return mitemRemove;
	}

	public JMenuItem getMItemReplay() {
		return mitemReplay;
	}

	public JButton getBtnHide() {
		return btnHide;
	}

	public JMenuItem getMItemHide() {
		return mitemHide;
	}

	public JMenuItem getMItemSave() {
		return mitemSave;
	}

	public JMenuItem getMItemLogDir() {
		return mitemLogDir;
	}

	public JMenuItem getMItemLogWindow() {
		return mitemLogWindow;
	}

	public JMenuItem getMItemMsgLogFile() {
		return mitemMsgLogFile;
	}

	public JMenuItem getMItemQuit() {
		return mitemQuit;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public JButton getBtnRemove() {
		return btnRemove;
	}

	public JButton getBtnClear() {
		return btnClear;
	}

	public JMenuItem getMItemClear() {
		return mitemClear;
	}

	public JButton getBtnNext() {
		return btnNext;
	}

	public JButton getBtnPrev() {
		return btnPrev;
	}

	public JMenu getMenuHelp() {
		return menuHelp;
	}

	public JMenuBar getMenubar() {
		return menubar;
	}

	public JTabbedPane getTabs() {
		return tabs;
	}

	public JMenuItem getMItemAbout() {
		return mitemAbout;
	}

	public JMenuItem getMItemHelp() {
		return mitemHelp;
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHide;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnRemove;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuLoggers;
    private javax.swing.JMenu menuProgramLog;
    private javax.swing.JMenu menuTools;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem mitemAbout;
    private javax.swing.JMenuItem mitemAdd;
    private javax.swing.JMenuItem mitemClear;
    private javax.swing.JMenuItem mitemHelp;
    private javax.swing.JMenuItem mitemHide;
    private javax.swing.JMenuItem mitemLogDir;
    private javax.swing.JMenuItem mitemLogWindow;
    private javax.swing.JMenuItem mitemMsgLogFile;
    private javax.swing.JMenuItem mitemQuit;
    private javax.swing.JMenuItem mitemRemove;
    private javax.swing.JMenuItem mitemReplay;
    private javax.swing.JMenuItem mitemSave;
    private javax.swing.JPopupMenu.Separator sep;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables

}
