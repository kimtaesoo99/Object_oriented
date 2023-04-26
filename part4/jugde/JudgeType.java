package part4.jugde;

import java.util.Arrays;

public enum JudgeType {

    KING("왕"){
        Judge getJudge() {
            return new King();
        }
    },
    QUEEN("왕비"){
        Judge getJudge() {
            return new Queen();
        }
    };

    final String judge;

    JudgeType (String judge) {
        this.judge = judge;
    }

    private static boolean isCorrectJudge(String input) {
        return Arrays.stream(JudgeType.values())
            .anyMatch(name -> name.judge.equals(input));
    }

    public static Judge getJudge(String input) {
        if (!isCorrectJudge(input)) {
            throw new IllegalStateException("잘못된 판사입니다. 다시입력해주세요. 왕과 왕비만 고를 수 있습니다.");
        }
        return Arrays.stream(JudgeType.values())
            .filter(name -> name.judge.equals(input))
            .findFirst().orElseThrow(IllegalAccessError::new).getJudge();
    }

    Judge getJudge() {
        return null;
    }
}
