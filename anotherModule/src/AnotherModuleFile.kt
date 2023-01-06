import oop.enums.Department
import oop.enums.Department.*
import oop.singleton.CompanyCommunications
import oop.singleton.topLevelFunction

fun main() {
   topLevelFunction("TEST")
   println(CompanyCommunications.getCopyRightLine())

   println(IT.getInfo())
}