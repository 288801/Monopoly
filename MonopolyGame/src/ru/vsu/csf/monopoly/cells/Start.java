package ru.vsu.csf.monopoly.cells;

import ru.vsu.csf.monopoly.game.Game;
import ru.vsu.csf.monopoly.game.GraphicGame;
import ru.vsu.csf.monopoly.player.Player;

import java.awt.*;
import java.util.ArrayList;

public class Start extends Cell implements CellActions{

    public Start(int x, int y, int sizeX, int sizeY, Color color, String inscription) {
        super(x, y, sizeX, sizeY, color, inscription, new ArrayList<>());
    }

    public void makeMove(Player player, Game game){
        //game.getG().printStr("Вы получаете 2000 за прохождение круга");
        player.setCash(player.getCash() + 1000);
        //game.getG().printStr("Ваш бюджет: " + player.getCash());
        game.getRunnable().render(null, GraphicGame.Steps.DRAW_STRING, game.getField(), "Вы получаете 1000 за попадание на Старт");
    }
}
