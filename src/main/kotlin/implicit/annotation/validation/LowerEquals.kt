package implicit.annotation.validation

import implicit.annotation.Implicit
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.VALUE_PARAMETER

@Retention(RUNTIME)
@Target(VALUE_PARAMETER)
@Implicit
annotation class LowerEquals(val size:Int, val message:String = "")