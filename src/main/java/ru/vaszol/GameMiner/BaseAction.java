package ru.vaszol.GameMiner;

/**
 * Created by vas on 07.09.2015.
 */
public class BaseAction implements UserAction {
    private final GeneratorBoard generator;
    private final Board board;
    private final SaperLogic logic;

    public BaseAction(final SaperLogic logic, final Board board, final GeneratorBoard generatorBoard) {
        this.generator = generatorBoard;
        this.board = board;
        this.logic = logic;
    }

    public void initGame(){
        final Cell[][] cells = generator.generate();
        this.board.drawBoard(cells);
        this.logic.loadBoard(cells);
    }

    public void select
}
