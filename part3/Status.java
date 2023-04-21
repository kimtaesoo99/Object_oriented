package part3;

public enum Status {

    Reverse(true),
    KneelDown(true);

    final boolean nowStatus;

    Status(boolean nowStatus) {
        this.nowStatus = nowStatus;
    }
}
