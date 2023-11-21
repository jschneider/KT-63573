package dirB.othermodule

import com.benasher44.uuid.uuidFrom
import dirA.uuid.MyUuid


/**
 *
 */
fun fooBar() {
  val uuid = uuidFrom("fa81be8e-c353-404c-9888-6a329bbf4580")
  val a = MyUuid(uuid)
}