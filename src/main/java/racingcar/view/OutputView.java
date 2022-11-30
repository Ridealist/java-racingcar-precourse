package racingcar.view;

import java.util.List;
import java.util.Map;
import racingcar.domain.GameResult;

public class OutputView {

    private static final String RESULT_OF_PLAY = "실행 결과";
    private static final String FINAL_WINNER = "최종 우승자";
    private static final String COLON = ":";
    private static final String BLANK = " ";
    private static final String MOVING = "-";

    public void printResultMessage() {
        System.out.println();
        System.out.println(RESULT_OF_PLAY);
    }

    // TODO 시급한 refactoring이 필요
    public void printRoundResult(GameResult gameResult) {
        Map<String, Integer> playerPosition = gameResult.getPlayerPosition();
        for (String name : playerPosition.keySet()) {
            System.out.print(name + BLANK + COLON + BLANK);
            for (int i = 0; i < playerPosition.get(name); i++) {
                System.out.print(MOVING);
            }
            System.out.println();
        }
        System.out.println();
    }

    // TODO print의 template관점 / stringbuilder관점 - 찍어내는 것? / 블록처럼 생성하는 것?
    public void printFinalWinner(GameResult gameResult) {
        List<String> finalWinner = gameResult.getFinalWinner();
        System.out.println(FINAL_WINNER + BLANK + COLON + BLANK + String.join(", ", finalWinner));
    }

    public void printErrorMessage(String message) {
        System.out.println("[ERROR]" + BLANK + message);
    }
}
