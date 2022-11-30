package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import racingcar.domain.car.Car;

public class GameResult {

    // TODO player를 내부 필드화 할 때 안 할 때 차이점 고민해보기
    private final Player player;
    private Map<String, Integer> playerPosition = new LinkedHashMap<>();

    public GameResult(Player player) {
        this.player = player;
    }

    public Map<String, Integer> getPlayerPosition() {
        updatePosition();
        return playerPosition;
    }

    private void updatePosition() {
        List<Car> racingCars = player.getRacingCars();
        for (Car car : racingCars) {
            playerPosition.put(car.getName(), car.getPosition());
        }
    }

    // TODO 코드 뜯어보며 공부해보기
    public List<String> getFinalWinner() {
        List<String> finalWinner = new ArrayList<>();
        int maxValue = Collections.max(playerPosition.values());
        for (Map.Entry<String, Integer> m : playerPosition.entrySet()) {
            if (m.getValue() == maxValue) {
                finalWinner.add(m.getKey());
            }
        }
        return finalWinner;
    }
}
