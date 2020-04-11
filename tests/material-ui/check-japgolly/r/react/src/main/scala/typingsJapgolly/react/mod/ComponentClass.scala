package typingsJapgolly.react.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentClass[P]
  extends ComponentType[P]
     with Instantiable1[
      /* props */ P, 
      japgolly.scalajs.react.raw.React.Component[P with js.Object, js.Object]
    ]
     with Instantiable2[
      /* props */ P, 
      /* context */ js.Any, 
      japgolly.scalajs.react.raw.React.Component[P with js.Object, js.Object]
    ] {
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  var displayName: js.UndefOr[String] = js.native
}

