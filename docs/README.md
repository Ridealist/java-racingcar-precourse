# 구현할 기능 목록

## 0. 전체 예외 처리
- [x] 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
- [x] 아래의 프로그래밍 실행 결과 예시와 동일하게 입력과 출력이 이루어져야 한다.


## 1. 경주할 자동차
- [x] 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
### 입력
- [x] 자동차 이름들 입력
### 예외처리
- [x] 자동차 이름은 쉼표(,)를 기준으로 구분
- [x] 이름은 5자 이하만 가능
### 단위테스트
- [x]

## 2. 경주 방법
### 입력
- [x] 시도할 횟수 입력
### 예외처리
- [x] 숫자여야 함
### 단위테스트
- [x]

## 3. 실행 과정
- [x] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있음
  - [x] 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우
### 출력
- [x] 각 차수별 실행 결과


## 4. 실행 결과
- [x] 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
- [x] 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
### 출력
- [x] 단독 우승자 안내 문구
- [x] 공동 우승자 안내 문구