package racingcar.domain;

import racingcar.domain.car.NumberGenerator;

public class RacingGame {

    private static final int GAME_OVER_COUNT = 0;

    private final Player player;
    private int gameRound;

    public RacingGame(Player player, int gameRound) {
        this.player = player;
        this.gameRound = gameRound;
    }

    public void play(NumberGenerator numberGenerator) {
        player.playOneRound(numberGenerator);
        gameRound--;
    }

    // TODO 다른 프로그램(야구, 로또, 다리)과 전체 코드 흐름 제어 구조 비교
    public boolean isGameContinue() {
        return (gameRound != GAME_OVER_COUNT);
    }
}
