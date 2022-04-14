# 숫자 야구 게임(프리코스 1주차)

![Generic badge](https://img.shields.io/badge/precourse-week1-green.svg)
![Generic badge](https://img.shields.io/badge/version-1.0.1-brightgreen.svg)

<br>

## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

<br>

## 기능 목록

1. 1부터 9까지 서로 다른 랜덤 수를 생성한다

2. 사용자로부터 서로 다른 3자리의 수를 입력받고 게임 로직을 구현한다
    - 잘못 입력된 경우 `IllegalArgumentException`을 발생시키고 애플리케이션을 종료시킨다
    - 정상 입력된 경우 입력에 따른 결과를 판정한다
      - 스트라이크, 볼, 낫싱 판단

3. 정답 이후 종료 또는 재시작 로직을 구현한다 
