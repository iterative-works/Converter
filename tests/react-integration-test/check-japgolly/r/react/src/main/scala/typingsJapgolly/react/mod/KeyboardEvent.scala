package typingsJapgolly.react.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardEvent[T] extends BaseSyntheticEvent[Event, EventTarget with T, EventTarget] {
  var altKey: Boolean = js.native
  var charCode: Double = js.native
  var ctrlKey: Boolean = js.native
  /**
    * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
    */
  var key: String = js.native
  var keyCode: Double = js.native
  var locale: String = js.native
  var location: Double = js.native
  var metaKey: Boolean = js.native
  var repeat: Boolean = js.native
  var shiftKey: Boolean = js.native
  var which: Double = js.native
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: String): Boolean = js.native
}

object KeyboardEvent {
  @scala.inline
  def apply[T](
    altKey: Boolean,
    bubbles: Boolean,
    cancelable: Boolean,
    charCode: Double,
    ctrlKey: Boolean,
    currentTarget: EventTarget with T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    getModifierState: String => CallbackTo[Boolean],
    isDefaultPrevented: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    isTrusted: Boolean,
    key: String,
    keyCode: Double,
    locale: String,
    location: Double,
    metaKey: Boolean,
    nativeEvent: Event,
    persist: Callback,
    preventDefault: Callback,
    repeat: Boolean,
    shiftKey: Boolean,
    stopPropagation: Callback,
    target: EventTarget,
    timeStamp: Double,
    `type`: String,
    which: Double
  ): KeyboardEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("getModifierState")(js.Any.fromFunction1((t0: java.lang.String) => getModifierState(t0).runNow()))
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("persist")(persist.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent[T]]
  }
}

