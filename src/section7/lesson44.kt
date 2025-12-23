package section7

//import model.Status
import model.Status
import model.StatusTest

fun main() {
    /**
     * ・シールドクラス
     *   >> ネストクラス or 同一ファイル内の継承可能
     */

    var status = StatusTest.Enable
    status = StatusTest.Disable
    status = StatusTest.Error

    var s: Status = Status.Enable
    s = Status.Disable
    s = Status.Error("Error: 001")
}

// シールドクラスは別ファイルからアクセスできない。
//class C(): Status() {}
