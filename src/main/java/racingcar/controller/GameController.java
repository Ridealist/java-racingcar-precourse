package racingcar.controller;

import java.util.List;
import java.util.function.Supplier;
import racingcar.domain.GameResult;
import racingcar.domain.Player;
import racingcar.domain.RacingGame;
import racingcar.domain.car.NumberGenerator;
import racingcar.domain.car.RandomNumberGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {

    private RacingGame racingGame;
    private GameResult gameResult;

    // TODO 전체적인 클래스 구조도 그려보기. 객체간의 연결성 및 depth 확인. RacingGame 클래스의 Service역할 확인.
    public GameController() {
        setUp();
    }

    private void setUp() {
        // TODO View단의 static / non-static에 대한 고찰 필요
        InputView inputView = new InputView();
        List<String> playerNames = repeat(inputView::readPlayerName);
        Player player = new Player(playerNames);
        // TODO gameResult에 player를 내부 필드화 할 때 안 할 때 차이점 고민해보기
        this.gameResult = new GameResult(player);
        int gameRound = repeat(inputView::readGameRound);
        this.racingGame = new RacingGame(player, gameRound);
    }

    // TODO 너무 길다... refactoring 가즈아
    public void start() {
        OutputView outputView = new OutputView();
        outputView.printResultMessage();
        do {
            NumberGenerator numberGenerator = new RandomNumberGenerator();
            racingGame.play(numberGenerator);
            outputView.printRoundResult(gameResult);
        } while (racingGame.isGameContinue());
        outputView.printFinalWinner(gameResult);
    }

    // TODO 함수형 프로그래밍 공부하기
    private <T> T repeat(Supplier<T> inputReader) {
        try {
            return inputReader.get();
        } catch (IllegalArgumentException e) {
            OutputView outputView = new OutputView();
            outputView.printErrorMessage(e.getMessage());
            return repeat(inputReader);
        }
    }
}
