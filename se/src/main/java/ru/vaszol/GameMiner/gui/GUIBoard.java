package ru.vaszol.GameMiner.gui;

import ru.vaszol.GameMiner.Board;
import ru.vaszol.GameMiner.Cell;

import javax.swing.*;
import java.awt.*;

/**
 * Created by vas on 13.09.2015.
 */
public class GUIBoard extends JPanel implements Board {

	public static final int PADDING = 50;

	public Cell<Graphics>[][] cells;

	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		if (this.cells != null) {
			for (int x=0;x!=cells.length;x++) {
				for (int y = 0; y!=cells[0].length; y++) {
					graphics.setColor(Color.black);
					cells[x][y].draw(graphics, false);
					graphics.drawRect(x * PADDING, y * PADDING, PADDING, PADDING);
				}
			}
		}
	}

	public void drawBoard(Cell[][] cells) {
		this.cells = cells;
		this.repaint();
	}

	public void drawCell(int x, int y) {
		this.repaint();
	}

	public void drawBang() {
		this.repaint();
	}

	public void drawCongratulate() {
	}
}